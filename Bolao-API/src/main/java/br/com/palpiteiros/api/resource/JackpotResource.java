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

import br.com.palpiteiros.api.model.Jackpot;
import br.com.palpiteiros.api.service.JackpotService;
import br.com.palpiteiros.api.util.EntityResource;

/*Jackpot Resource - Resource do Bolão*/

@RestController
@RequestMapping("api/jackpots")
public class JackpotResource implements EntityResource<Jackpot> {

	@Autowired
	private JackpotService jackpotService;

	/* implementação do metodo save */
	@Override
	public ResponseEntity<Jackpot> save(@Valid Jackpot entity) {
		jackpotService.save(entity);
		return new ResponseEntity<Jackpot>(entity, HttpStatus.CREATED);
	}

	/* implementação do metodo findAll */
	@Override
	public ResponseEntity<List<Jackpot>> findAll() {
		List<Jackpot> jackpots = jackpotService.findAll();

		if (!jackpots.isEmpty()) {
			return ResponseEntity.ok(jackpots);
		}
		return new ResponseEntity<List<Jackpot>>(jackpots, HttpStatus.NOT_FOUND);
	}

	/* implementação do metodo findOne */
	@Override
	public ResponseEntity<Jackpot> findOne(Long id) {
		Optional<Jackpot> jackpot = jackpotService.findOne(id);

		if (jackpot.isPresent()) {
			return ResponseEntity.ok(jackpot.get());
		}

		return ResponseEntity.notFound().build();
	}

	/* implementação do metodo updateById */
	@Override
	public ResponseEntity<Jackpot> updateById(Long id, @Valid Jackpot entity) {
		Optional<Jackpot> jackpot = jackpotService.findOne(id);

		if (jackpot.isPresent()) {
			BeanUtils.copyProperties(entity, jackpot.get(), "id");
			jackpotService.save(jackpot.get());
			return ResponseEntity.ok(jackpot.get());
		}
		return ResponseEntity.notFound().build();
	}

	/* implementação do metodo deleteById */
	@Override
	public ResponseEntity<Jackpot> deleteById(Long id) {
		Optional<Jackpot> jackpot = jackpotService.findOne(id);

		if (jackpot.isPresent()) {
			jackpotService.deleteById(id);
			return ResponseEntity.ok().build();
		}

		return ResponseEntity.notFound().build();
	}

}
