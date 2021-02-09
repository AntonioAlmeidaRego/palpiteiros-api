package br.com.palpiteiros.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.palpiteiros.api.model.Classification;
import br.com.palpiteiros.api.repository.ClassificationRepository;
import br.com.palpiteiros.api.util.EntityService;
/*Classification Service that uses the data persistence layer*/

@Service
public class ClassificationService implements EntityService<Classification> {
	/*
	 * Using the data persistence layer
	 */
	@Autowired
	private ClassificationRepository repository;

	/*
	 * default service methods
	 */
	
	@Override
	public void save(Classification entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public List<Classification> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Classification> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
