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

import br.com.palpiteiros.api.model.Match;
import br.com.palpiteiros.api.service.MatchService;
import br.com.palpiteiros.api.util.EntityResource;

/*Match Resource - Resource do Bolão*/

@RestController
@RequestMapping("api/matchs")
public class MatchResource implements EntityResource<Match> {

	@Autowired
	private MatchService matchService;

	/* implementação do metodo save */
	@Override
	public ResponseEntity<Match> save(@Valid Match entity) {
		matchService.save(entity);
		return new ResponseEntity<Match>(entity, HttpStatus.CREATED);
	}

	/* implementação do metodo findAll */
	@Override
	public ResponseEntity<List<Match>> findAll() {
		List<Match> matchs = matchService.findAll();

		if (!matchs.isEmpty()) {
			return ResponseEntity.ok(matchs);
		}
		return new ResponseEntity<List<Match>>(matchs, HttpStatus.NOT_FOUND);
	}

	/* implementação do metodo findOne */
	@Override
	public ResponseEntity<Match> findOne(Long id) {
		Optional<Match> match = matchService.findOne(id);

		if (match.isPresent()) {
			return ResponseEntity.ok(match.get());
		}

		return ResponseEntity.notFound().build();
	}

	/* implementação do metodo updateById */
	@Override
	public ResponseEntity<Match> updateById(Long id, @Valid Match entity) {
		Optional<Match> match = matchService.findOne(id);

		if (match.isPresent()) {
			BeanUtils.copyProperties(entity, match.get(), "id");
			matchService.save(match.get());
			return ResponseEntity.ok(match.get());
		}
		return ResponseEntity.notFound().build();
	}

	/* implementação do metodo deleteById */
	@Override
	public ResponseEntity<Match> deleteById(Long id) {
		Optional<Match> match = matchService.findOne(id);

		if (match.isPresent()) {
			matchService.deleteById(id);
			return ResponseEntity.ok().build();
		}

		return ResponseEntity.notFound().build();
	}
}
