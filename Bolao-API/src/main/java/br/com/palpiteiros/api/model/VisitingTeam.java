package br.com.palpiteiros.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

/*Visiting Team Entity - Entidade Time Visitante*/

@Entity
@Table(name = "tb_visiting_team")
@Data
public class VisitingTeam implements Serializable {

	private static final long serialVersionUID = 1L;

	/*
	 * visiting team entity attributes
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	/*
	 * relationship a team has a visiting team
	 */
	@OneToOne
	@JoinColumn(name = "team_id")
	private Team team;
	private Integer resultPlacar;
}
