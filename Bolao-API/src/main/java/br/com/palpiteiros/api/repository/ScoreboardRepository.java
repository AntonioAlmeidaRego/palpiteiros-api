package br.com.palpiteiros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.palpiteiros.api.model.Scoreboard;

/*Interface responsible for the persistence layer of scoreboard data*/

@Repository
public interface ScoreboardRepository extends JpaRepository<Scoreboard, Long> {

}
