package br.com.palpiteiros.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/*Team Entity - Entidade Time*/

@Entity
@Table(name = "tb_team")
@Data
public class Team implements Serializable {

	private static final long serialVersionUID = 1L;
	/*
	 * team entity attributes
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private int goals;
	private int points;
	private int victory;
	private int draw;
	private int defeat;
	private int goalDifference; // Saldo de gols
	private int redCard;

}
