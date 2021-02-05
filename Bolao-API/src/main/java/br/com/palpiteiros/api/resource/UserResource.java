package br.com.palpiteiros.api.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.palpiteiros.api.model.User;
import br.com.palpiteiros.api.service.UserService;
import br.com.palpiteiros.api.util.EntityResource;

/*User Resource - Resourco do Usuário*/

@RestController
@RequestMapping("/api/users")
public class UserResource implements EntityResource<User> {
	@Autowired
	private UserService userService;

	@Override
	public ResponseEntity<User> save(@Valid User entity) { 
		return null;
	}
	
	@Override
	public ResponseEntity<List<User>> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<User> findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<User> updateById(Long id, @Valid User entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<User> deleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
