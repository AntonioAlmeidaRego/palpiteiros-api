package br.com.palpiteiros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.palpiteiros.api.model.VisitingTeam;

/*Interface responsible for the persistence layer of visiting team data*/
@Repository
public interface VisitingTeamRepository extends JpaRepository<VisitingTeam, Long> {

}
