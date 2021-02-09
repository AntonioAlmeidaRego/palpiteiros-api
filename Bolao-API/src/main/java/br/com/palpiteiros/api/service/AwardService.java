package br.com.palpiteiros.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.palpiteiros.api.model.Award;
import br.com.palpiteiros.api.repository.AwardRepository;
import br.com.palpiteiros.api.util.EntityService;
/*Award Service that uses the data persistence layer*/

@Service
public class AwardService implements EntityService<Award> {
	/*
	 * Using the data persistence layer
	 */
	@Autowired
	private AwardRepository repository;

	/*
	 * default service methods
	 */

	@Override
	public void save(Award entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public List<Award> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Award> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
