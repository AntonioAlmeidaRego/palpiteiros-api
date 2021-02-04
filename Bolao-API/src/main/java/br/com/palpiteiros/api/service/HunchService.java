package br.com.palpiteiros.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.palpiteiros.api.model.Hunch;
import br.com.palpiteiros.api.repository.HunchRepository;
import br.com.palpiteiros.api.util.EntityService;
/*Hunch Service that uses the data persistence layer*/

@Service
public class HunchService implements EntityService<Hunch> {
	/*
	 * Using the data persistence layer
	 */
	@Autowired
	private HunchRepository repository;
	
	/*
	 * default service methods
	 */
	
	@Override
	public void save(Hunch entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public List<Hunch> findAll() {
		return repository.findAll();
	}

	@Override
	public Hunch findOne(Long id) {
		return repository.getOne(id);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
