package br.com.palpiteiros.api.util;

import java.util.List;
import java.util.Optional;

/*Useful interface for service classes to
 implement the default methods of a service*/
public interface EntityService<Entity extends Object> {
	public void save(Entity entity);

	public List<Entity> findAll();

	public Optional<Entity> findOne(Long id);

	public void deleteById(Long id);
}
