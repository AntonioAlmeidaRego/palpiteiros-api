package br.com.palpiteiros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.palpiteiros.api.model.Championship;

/*Interface responsible for the persistence layer of championship data*/
@Repository
public interface ChampionshipRepository extends JpaRepository<Championship, Long> {
}
