package br.com.palpiteiros.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/*Scoreboard Entity - Entidade Placar*/
@Entity
@Table(name = "tb_scoreboard")
@Getter
@Setter
public class Scoreboard implements Serializable {

	private static final long serialVersionUID = 1L;
	/*
	 * scoreboard entity attributes
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	/*
	 * many leaderboards have a visiting team
	 */
	@ManyToOne
	@JoinColumn(name = "visiting_team_id")
	private VisitingTeam visitingTeam;
	/* many leaderboards have a home team */
	@ManyToOne
	@JoinColumn(name = "home_team_id")
	private HomeTeam homeTeam;
}
