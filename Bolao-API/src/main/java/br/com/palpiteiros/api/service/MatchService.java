package br.com.palpiteiros.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.palpiteiros.api.model.Match;
import br.com.palpiteiros.api.repository.MatchRepository;
import br.com.palpiteiros.api.util.EntityService;
/*Match Service that uses the data persistence layer*/

@Service
public class MatchService implements EntityService<Match> {
	/*
	 * Using the data persistence layer
	 */
	@Autowired
	private MatchRepository repository;

	/*
	 * default service methods
	 */
	
	@Override
	public void save(Match entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public List<Match> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Match> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
