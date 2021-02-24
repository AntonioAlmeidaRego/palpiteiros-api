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

/*HomeTeam Entity - Entidade Time de Casa*/
@Entity
@Table(name = "tb_home_team")
@Data
public class HomeTeam implements Serializable {

	private static final long serialVersionUID = 1L;
	/*
	 * home team entity attributes
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	/*
	 * a home team is a team
	 */
	@OneToOne
	@JoinColumn(name = "team_id")
	private Team team;
	private Integer resultScore;
}
