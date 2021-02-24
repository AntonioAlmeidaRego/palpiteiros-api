package br.com.palpiteiros.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/*
 * Ranking Entity - Entidade Ranking
 * */
@Entity
@Table(name = "tb_ranking")
@Data
public class Ranking implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * ranking entity attributes
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer totalHunches;
	private Integer totalPoints; // Soma dos pontos que já marcou
	private Integer totalJackpots; // Bolões que já participou
	private Integer accuracy; // Precisão de acertos em %
	private Integer totalHits; // Total de acertos exatos
	private Integer totalHalfHits; // Total de acertos do vencedor
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	/*
	 * a ranking has a user
	 */
	private User user;
	@ManyToOne
	@JoinColumn(name = "jackpot_id")
	/*
	 * a ranking has a jackpot
	 */
	private Jackpot jackpot;

}
