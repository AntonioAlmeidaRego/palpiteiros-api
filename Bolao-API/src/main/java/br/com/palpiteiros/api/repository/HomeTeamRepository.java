package br.com.palpiteiros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.palpiteiros.api.model.HomeTeam;

/*Interface responsible for the persistence layer of home team data*/

@Repository
public interface HomeTeamRepository extends JpaRepository<HomeTeam, Long> {

}
