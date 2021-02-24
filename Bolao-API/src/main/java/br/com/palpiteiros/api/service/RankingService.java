package br.com.palpiteiros.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.palpiteiros.api.model.Ranking;
import br.com.palpiteiros.api.repository.RankingRepository;
import br.com.palpiteiros.api.util.EntityService;

@Service
public class RankingService implements EntityService<Ranking> {
	@Autowired
	private RankingRepository repository;
	
	@Override
	public void save(Ranking entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public List<Ranking> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Ranking> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
