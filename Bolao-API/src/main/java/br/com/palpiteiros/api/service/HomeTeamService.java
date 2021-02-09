package br.com.palpiteiros.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.palpiteiros.api.model.HomeTeam;
import br.com.palpiteiros.api.repository.HomeTeamRepository;
import br.com.palpiteiros.api.util.EntityService;
/*HomeTeam Service that uses the data persistence layer*/

@Service
public class HomeTeamService implements EntityService<HomeTeam> {
	/*
	 * Using the data persistence layer
	 */
	@Autowired
	private HomeTeamRepository repository;

	/*
	 * default service methods
	 */

	@Override
	public void save(HomeTeam entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public List<HomeTeam> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<HomeTeam> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
