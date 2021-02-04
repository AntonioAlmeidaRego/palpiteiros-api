package br.com.palpiteiros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.palpiteiros.api.model.Punctuation;

/*Interface responsible for the persistence layer of punctuation data*/

@Repository
public interface PunctuationRepository extends JpaRepository<Punctuation, Long> {

}
