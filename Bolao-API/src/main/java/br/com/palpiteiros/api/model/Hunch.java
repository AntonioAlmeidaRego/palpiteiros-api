package br.com.palpiteiros.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/*Hunch Entity - Entidade Palpite*/
@Entity
@Table(name = "tb_hunch")
@Getter
@Setter
public class Hunch implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * hunch entity attributes
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	/* a guess has a match */
	@OneToOne
	@JoinColumn(name = "match_id")
	private Match match;
	private Integer hunchPoints;
}
