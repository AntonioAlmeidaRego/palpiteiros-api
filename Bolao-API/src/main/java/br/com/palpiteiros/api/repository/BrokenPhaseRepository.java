package br.com.palpiteiros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.palpiteiros.api.model.Phase;

/*Interface responsible for the persistence layer of brokenphase data*/
@Repository
public interface BrokenPhaseRepository extends JpaRepository<Phase, Long> {

}
