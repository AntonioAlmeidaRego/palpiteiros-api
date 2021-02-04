package br.com.palpiteiros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.palpiteiros.api.model.Hunch;
/*Interface responsible for the persistence layer of hunch data*/

@Repository
public interface HunchRepository extends JpaRepository<Hunch, Long> {

}
