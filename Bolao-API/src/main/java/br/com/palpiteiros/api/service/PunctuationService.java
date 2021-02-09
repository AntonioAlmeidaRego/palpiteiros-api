package br.com.palpiteiros.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.palpiteiros.api.model.Punctuation;
import br.com.palpiteiros.api.repository.PunctuationRepository;
import br.com.palpiteiros.api.util.EntityService;
/*Punctuation Service that uses the data persistence layer*/

@Service
public class PunctuationService implements EntityService<Punctuation> {
	/*
	 * Using the data persistence layer
	 */
	@Autowired
	private PunctuationRepository repository;

	/*
	 * default service methods
	 */
	
	@Override
	public void save(Punctuation entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public List<Punctuation> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Punctuation> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		repository.getOne(id);
	}

}
