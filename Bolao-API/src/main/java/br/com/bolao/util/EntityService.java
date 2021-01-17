package br.com.bolao.util;

import java.util.List;

public interface EntityService<Entity extends Object> {
	public void save(Entity entity);
	public List<Entity> findAll();
	public Entity findOne(Long id);
	public void deleteById(Long id);
}
