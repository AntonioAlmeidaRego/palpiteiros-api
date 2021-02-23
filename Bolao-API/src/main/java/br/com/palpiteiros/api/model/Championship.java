package br.com.palpiteiros.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/*Championship Entity - Entidade Campeonato*/
@Entity
@Data
@Table(name = "tb_championship")
public class Championship implements Serializable {

	private static final long serialVersionUID = 1L;
	/*
	 * championship entity attributes
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String year;
	private String hostCountry;
	private String phase;
	/*
	 * a championship has many teams
	 */
	@OneToMany
	@JoinTable(name = "championship_teams")
	private List<Team> teams;
	/*
	 * a championship has many matches
	 */
	@OneToMany
	@JoinTable(name = "championship_matches")
	private List<Match> matches;
}
