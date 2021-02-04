package br.com.palpiteiros.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.palpiteiros.api.model.BrokenPhase;
import br.com.palpiteiros.api.repository.BrokenPhaseRepository;
import br.com.palpiteiros.api.util.EntityService;
/*BrokenPhase Service that uses the data persistence layer*/

@Service
public class BrokenPhaseService implements EntityService<BrokenPhase> {
	/*
	 * Using the data persistence layer
	 */
	@Autowired
	private BrokenPhaseRepository repository;

	/*
	 * default service methods
	 */

	@Override
	public void save(BrokenPhase entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public List<BrokenPhase> findAll() {
		return repository.findAll();
	}

	@Override
	public BrokenPhase findOne(Long id) {
		return repository.getOne(id);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
