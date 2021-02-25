package br.com.palpiteiros.api.resource;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.palpiteiros.api.model.Championship;
import br.com.palpiteiros.api.service.ChampionshipService;
import br.com.palpiteiros.api.util.EntityResource;
import br.com.palpiteiros.api.util.Response;

/*Championship Resource - Resource do Campeonato*/

@RestController
@RequestMapping("/api/championships")
public class ChampionshipResource extends Response<Championship> implements EntityResource<Championship> {
	
	@Autowired
	private ChampionshipService championshipService;

	/* implementação do metodo save */
	@Override
	public ResponseEntity<Championship> save(@Valid Championship entity) { 
		championshipService.save(entity);
		return new ResponseEntity<Championship>(entity, HttpStatus.CREATED);
	}

	/* implementação do metodo findAll */
	@Override
	public ResponseEntity<List<Championship>> findAll() {
		return findAll(championshipService);
	}

	/* implementação do metodo findOne */
	@Override
	public ResponseEntity<Championship> findOne(Long id) {
		return getOne(championshipService, id);
	}

	/* implementação do metodo updateById */
	@Override
	public ResponseEntity<Championship> updateById(Long id, @Valid Championship entity) {
		Optional<Championship> championship = championshipService.findOne(id);

		if (championship.isPresent()) {
			BeanUtils.copyProperties(entity, championship.get(), "id");
			championshipService.save(championship.get());

			return ResponseEntity.ok(championship.get());
		}

		return ResponseEntity.notFound().build();
	}

	/* implementação do metodo deleteById */
	@Override
	public ResponseEntity<Championship> deleteById(Long id) {
		Optional<Championship> championship = championshipService.findOne(id);

		if (championship.isPresent()) {
			championshipService.deleteById(id);
			return ResponseEntity.ok().build();
		}

		return ResponseEntity.notFound().build();
	}

}
