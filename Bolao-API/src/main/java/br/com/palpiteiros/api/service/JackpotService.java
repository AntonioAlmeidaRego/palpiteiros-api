package br.com.palpiteiros.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.palpiteiros.api.model.Jackpot;
import br.com.palpiteiros.api.repository.JackpotRepository;
import br.com.palpiteiros.api.util.EntityService;
/*Jackpot Service that uses the data persistence layer*/

@Service
public class JackpotService implements EntityService<Jackpot> {
	/*
	 * Using the data persistence layer
	 */
	@Autowired
	private JackpotRepository repository;

	/*
	 * default service methods
	 */
	
	@Override
	public void save(Jackpot entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public List<Jackpot> findAll() {
		return repository.findAll();
	}

	@Override
	public Jackpot findOne(Long id) {
		return repository.getOne(id);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
