package br.com.palpiteiros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.palpiteiros.api.model.JackpotRating;

/*Interface responsible for the persistence layer of jackpot ratiing data*/
@Repository
public interface JackpotRatingRepository extends JpaRepository<JackpotRating, Long> {

}
