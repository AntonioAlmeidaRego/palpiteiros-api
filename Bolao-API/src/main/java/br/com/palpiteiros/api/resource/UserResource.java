package br.com.palpiteiros.api.resource;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	/* implementação do metodo save */
	@Override
	public ResponseEntity<User> save(@Valid User entity) {

		userService.save(entity);
		return new ResponseEntity<User>(entity, HttpStatus.CREATED);
	}

	/* implementação do metodo findAll */
	@Override
	public ResponseEntity<List<User>> findAll() {
		List<User> users = userService.findAll();
		if (!users.isEmpty()) {
			return ResponseEntity.ok(userService.findAll());
		}

		return ResponseEntity.notFound().build();
	}

	/* implementação do metodo findOne */
	@Override
	public ResponseEntity<User> findOne(Long id) {
		Optional<User> user = userService.findOne(id);

		if (user.isPresent()) {
			return ResponseEntity.ok(user.get());
		}

		return ResponseEntity.notFound().build();
	}

	/* implementação do metodo updateById */
	@Override
	public ResponseEntity<User> updateById(Long id, @Valid User entity) {

		Optional<User> user = userService.findOne(id);

		if (user.isPresent()) {
			BeanUtils.copyProperties(entity, user.get(), "id");

			userService.save(user.get());
			return ResponseEntity.ok(user.get());
		}

		return ResponseEntity.notFound().build();
	}

	/* implementação do metodo deleteById */
	@Override
	public ResponseEntity<User> deleteById(Long id) {

		Optional<User> user = userService.findOne(id);

		if (user.isPresent()) {
			userService.deleteById(id);
			return ResponseEntity.ok().build();
		}

		return ResponseEntity.notFound().build();
	}

	/* implementação do metodo de login */
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User user) {
		
		System.out.println(user.getEmail() + user.getPassword());
		
		if (user.getEmail() != null && user.getPassword() != null) {
			Object obj = userService.login(user.getEmail(), user.getPassword());
			if (obj != null) {
				System.out.println("Deu certo!");
				return new ResponseEntity<Object>(obj, HttpStatus.OK);
			}
		}
		return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
	}

}
