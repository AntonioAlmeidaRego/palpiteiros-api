package br.com.palpiteiros.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.palpiteiros.api.model.Phase;
import br.com.palpiteiros.api.repository.BrokenPhaseRepository;
import br.com.palpiteiros.api.util.EntityService;
/*BrokenPhase Service that uses the data persistence layer*/

@Service
public class BrokenPhaseService implements EntityService<Phase> {
	/*
	 * Using the data persistence layer
	 */
	@Autowired
	private BrokenPhaseRepository repository;

	/*
	 * default service methods
	 */

	@Override
	public void save(Phase entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public List<Phase> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Phase> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
