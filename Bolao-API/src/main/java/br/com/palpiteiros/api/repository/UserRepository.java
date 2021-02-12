package br.com.palpiteiros.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.palpiteiros.api.model.User;

/*Interface responsible for the persistence layer of user data*/
@Repository
public interface UserRepository extends JpaRepository<User, Long> { 
	
	public User findByEmailAndPassword(String email, String password);

}
