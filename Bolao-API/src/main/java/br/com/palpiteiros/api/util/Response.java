package br.com.palpiteiros.api.util;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

/*Class Util para reutilizar a resposta do resources*/

public abstract class Response<Entity extends Object> {
	public ResponseEntity<List<Entity>> findAll(List<Entity> entities){
		if (!entities.isEmpty()) {
			return ResponseEntity.ok(entities);
		}
		
		return toNotFoundList();
	}
	
	public ResponseEntity<List<Entity>> findAll(EntityService<Entity> entityService){
		List<Entity> entities = entityService.findAll();
		
		if (!entities.isEmpty()) {
			return ResponseEntity.ok(entities);
		}
		
		return toNotFoundList();
	}
	
	public ResponseEntity<Entity> getOne(EntityService<Entity> entityService, Long id) {
		Optional<Entity> optional = entityService.findOne(id);

		if (optional.isPresent()) {
			return ResponseEntity.ok(optional.get());
		}

		return getNotFound();
	}

	public ResponseEntity<Entity> getOptional(Optional<Entity> optional) {
		if (optional.isPresent()) {
			return ResponseEntity.ok(optional.get());
		}
		
		return getNotFound();
	}
	
	private ResponseEntity<Entity> getNotFound() {
		return ResponseEntity.notFound().build();
	}

	private ResponseEntity<List<Entity>> toNotFoundList() {
		return ResponseEntity.notFound().build();
	}
}
