package br.com.palpiteiros.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.palpiteiros.api.model.Scoreboard;
import br.com.palpiteiros.api.repository.ScoreboardRepository;
import br.com.palpiteiros.api.util.EntityService;
/*Scoreboard Service that uses the data persistence layer*/

@Service
public class ScoreboardService implements EntityService<Scoreboard> {
	/*
	 * Using the data persistence layer
	 */
	@Autowired
	private ScoreboardRepository repository;

	/*
	 * default service methods
	 */
	
	@Override
	public void save(Scoreboard entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public List<Scoreboard> findAll() {
		return repository.findAll();
	}

	@Override
	public Scoreboard findOne(Long id) {
		return repository.getOne(id);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
