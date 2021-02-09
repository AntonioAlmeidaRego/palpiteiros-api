package br.com.palpiteiros.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.palpiteiros.api.model.Badge;
import br.com.palpiteiros.api.repository.BadgeRepository;
import br.com.palpiteiros.api.util.EntityService;
/*Badge Service that uses the data persistence layer*/

@Service
public class BadgeService implements EntityService<Badge> {
	/*
	 * Using the data persistence layer
	 */
	@Autowired
	private BadgeRepository repository;

	/*
	 * default service methods
	 */

	@Override
	public void save(Badge entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public List<Badge> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Badge> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
