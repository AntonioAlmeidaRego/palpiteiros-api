package br.com.palpiteiros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.palpiteiros.api.model.Badge;

/*Interface responsible for the persistence layer of badge data*/
@Repository
public interface BadgeRepository extends JpaRepository<Badge, Long> {

}
