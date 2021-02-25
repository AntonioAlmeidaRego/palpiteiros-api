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

import br.com.palpiteiros.api.model.Hunch;
import br.com.palpiteiros.api.service.HunchService;
import br.com.palpiteiros.api.util.EntityResource;

/*Hunch Resource - Resource do Bolão*/

@RestController
@RequestMapping("api/hunchs")
public class HunchResource implements EntityResource<Hunch> {

	@Autowired
	private HunchService hunchService;

	/* implementação do metodo save */
	@Override
	public ResponseEntity<Hunch> save(@Valid Hunch entity) {
		hunchService.save(entity);
		return new ResponseEntity<Hunch>(entity, HttpStatus.CREATED);
	}

	/* implementação do metodo findAll */
	@Override
	public ResponseEntity<List<Hunch>> findAll() {
		List<Hunch> hunchs = hunchService.findAll();

		if (!hunchs.isEmpty()) {
			return ResponseEntity.ok(hunchs);
		}
		return new ResponseEntity<List<Hunch>>(hunchs, HttpStatus.NOT_FOUND);
	}

	/* implementação do metodo findOne */
	@Override
	public ResponseEntity<Hunch> findOne(Long id) {
		Optional<Hunch> hunch = hunchService.findOne(id);

		if (hunch.isPresent()) {
			return ResponseEntity.ok(hunch.get());
		}

		return ResponseEntity.notFound().build();
	}

	/* implementação do metodo updateById */
	@Override
	public ResponseEntity<Hunch> updateById(Long id, @Valid Hunch entity) {
		Optional<Hunch> hunch = hunchService.findOne(id);

		if (hunch.isPresent()) {
			BeanUtils.copyProperties(entity, hunch.get(), "id");
			hunchService.save(hunch.get());
			return ResponseEntity.ok(hunch.get());
		}
		return ResponseEntity.notFound().build();
	}

	/* implementação do metodo deleteById */
	@Override
	public ResponseEntity<Hunch> deleteById(Long id) {
		Optional<Hunch> hunch = hunchService.findOne(id);

		if (hunch.isPresent()) {
			hunchService.deleteById(id);
			return ResponseEntity.ok().build();
		}

		return ResponseEntity.notFound().build();
	}

}
