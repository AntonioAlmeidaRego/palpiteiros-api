package br.com.palpiteiros.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.palpiteiros.api.model.VisitingTeam;
import br.com.palpiteiros.api.repository.VisitingTeamRepository;
import br.com.palpiteiros.api.util.EntityService;
/*VisitingTeam Service that uses the data persistence layer*/

@Service
public class VisitingTeamService implements EntityService<VisitingTeam> {
	/*
	 * Using the data persistence layer
	 */
	@Autowired
	private VisitingTeamRepository repository;

	/*
	 * default service methods
	 */

	@Override
	public void save(VisitingTeam entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public List<VisitingTeam> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<VisitingTeam> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
