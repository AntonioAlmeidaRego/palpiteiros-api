package br.com.palpiteiros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.palpiteiros.api.model.Ranking;

@Repository
public interface RankingRepository extends JpaRepository<Ranking, Long> {

}
