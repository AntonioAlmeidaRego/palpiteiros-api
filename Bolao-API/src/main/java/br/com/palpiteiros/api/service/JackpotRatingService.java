package br.com.palpiteiros.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.palpiteiros.api.model.JackpotRating;
import br.com.palpiteiros.api.repository.JackpotRatingRepository;
import br.com.palpiteiros.api.util.EntityService;

public class JackpotRatingService implements EntityService<JackpotRating> {
	/*
	 * Using the data persistence layer
	 */
	@Autowired
	private JackpotRatingRepository repository;

	/*
	 * default service methods
	 */

	@Override
	public void save(JackpotRating entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public List<JackpotRating> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<JackpotRating> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
}
