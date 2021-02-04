package br.com.palpiteiros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.palpiteiros.api.model.Classification;

/*Interface responsible for the persistence layer of classification data*/
@Repository
public interface ClassificationRepository extends JpaRepository<Classification, Long> {

}
