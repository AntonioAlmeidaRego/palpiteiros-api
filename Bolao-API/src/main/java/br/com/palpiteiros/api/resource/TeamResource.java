package br.com.palpiteiros.api.resource;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.palpiteiros.api.model.Team;
import br.com.palpiteiros.api.service.TeamService;
import br.com.palpiteiros.api.util.EntityResource;

/*Championship Resource - Resource do Campeonato*/

@RestController
@RequestMapping("/api/teams")
public class TeamResource implements EntityResource<Team> {

	@Autowired
	private TeamService teamService;

	/* implementação do metodo save */
	@Override
	public ResponseEntity<Team> save(@Valid Team entity) {
		teamService.save(entity);
		return new ResponseEntity<Team>(entity, HttpStatus.CREATED);
	}

	/* implementação do metodo findAll */
	@Override
	public ResponseEntity<List<Team>> findAll() {
		List<Team> teams = teamService.findAll();

		if (!teams.isEmpty()) {
			return ResponseEntity.ok(teams);
		}

		return new ResponseEntity<List<Team>>(teams, HttpStatus.NOT_FOUND);
	}

	/* implementação do metodo findOne */
	@Override
	public ResponseEntity<Team> findOne(Long id) {
		Optional<Team> team = teamService.findOne(id);

		if (team.isPresent()) {
			return ResponseEntity.ok(team.get());
		}

		return ResponseEntity.notFound().build();
	}

	/* implementação do metodo updateById */
	@Override
	public ResponseEntity<Team> updateById(Long id, @Valid Team entity) {
		Optional<Team> team = teamService.findOne(id);

		if (team.isPresent()) {
			BeanUtils.copyProperties(entity, team.get(), "id");
			teamService.save(team.get());

			return ResponseEntity.ok(team.get());
		}

		return ResponseEntity.notFound().build();
	}

	/* implementação do metodo deleteById */
	@Override
	public ResponseEntity<Team> deleteById(Long id) {
		Optional<Team> team = teamService.findOne(id);

		if (team.isPresent()) {
			teamService.deleteById(id);
			return ResponseEntity.ok().build();
		}

		return ResponseEntity.notFound().build();
	}

}
