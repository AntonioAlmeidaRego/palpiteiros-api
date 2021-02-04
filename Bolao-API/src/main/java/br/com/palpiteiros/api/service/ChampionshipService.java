package br.com.palpiteiros.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.palpiteiros.api.model.Championship;
import br.com.palpiteiros.api.repository.ChampionshipRepository;
import br.com.palpiteiros.api.util.EntityService;
/*championship Service that uses the data persistence layer*/

@Service
public class ChampionshipService implements EntityService<Championship> {
	/*
	 * Using the data persistence layer
	 */
	@Autowired
	private ChampionshipRepository repository;

	/*
	 * default service methods
	 */

	@Override
	public void save(Championship entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public List<Championship> findAll() {
		return repository.findAll();
	}

	@Override
	public Championship findOne(Long id) {
		return repository.getOne(id);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
