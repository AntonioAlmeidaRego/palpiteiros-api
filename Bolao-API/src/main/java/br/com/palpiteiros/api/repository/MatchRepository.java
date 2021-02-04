package br.com.palpiteiros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.palpiteiros.api.model.Match;

/*Interface responsible for the persistence layer of match data*/

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {

}
