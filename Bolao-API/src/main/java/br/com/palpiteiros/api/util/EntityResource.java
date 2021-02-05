package br.com.palpiteiros.api.util;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/*Useful interface for resource classes to
 implement the standard methods of a restfull api*/

public interface EntityResource<Entity extends Object> {
	@PostMapping
	public ResponseEntity<Entity> save(@RequestBody @Valid Entity entity);

	@GetMapping
	public ResponseEntity<List<Entity>> findAll();

	@GetMapping("/{id}")
	public ResponseEntity<Entity> findOne(@PathVariable("id") Long id);

	@PutMapping("/{id}")
	public ResponseEntity<Entity> updateById(@PathVariable("id") Long id, @RequestBody @Valid Entity entity);

	@DeleteMapping("/{id}")
	public ResponseEntity<Entity> deleteById(@PathVariable("id") Long id);
}
