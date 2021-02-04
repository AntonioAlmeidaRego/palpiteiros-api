package br.com.palpiteiros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.palpiteiros.api.model.Jackpot;

/*Interface responsible for the persistence layer of jackpot data*/
@Repository
public interface JackpotRepository extends JpaRepository<Jackpot, Long> {

}
