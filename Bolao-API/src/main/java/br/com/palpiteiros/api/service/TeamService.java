package br.com.palpiteiros.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.palpiteiros.api.model.Team;
import br.com.palpiteiros.api.repository.TeamRepository;
import br.com.palpiteiros.api.util.EntityService;

/*Team service using a data persistence layer*/

@Service
public class TeamService implements EntityService<Team> {
	/*
	 * Using the data persistence layer
	 */
	@Autowired
	private TeamRepository repository;

	/*
	 * default service methods
	 */

	@Override
	public void save(Team entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public List<Team> findAll() {
		return repository.findAll();
	}

	@Override
	public Team findOne(Long id) {
		return repository.getOne(id);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
