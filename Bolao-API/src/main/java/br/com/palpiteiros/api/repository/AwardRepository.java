package br.com.palpiteiros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.palpiteiros.api.model.Award;

/*Interface responsible for the persistence layer of award data*/
@Repository
public interface AwardRepository extends JpaRepository<Award, Long> {

}
