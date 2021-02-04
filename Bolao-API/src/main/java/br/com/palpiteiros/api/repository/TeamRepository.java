package br.com.palpiteiros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.palpiteiros.api.model.Team;

/*Interface responsible for the persistence layer of team data*/
@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
