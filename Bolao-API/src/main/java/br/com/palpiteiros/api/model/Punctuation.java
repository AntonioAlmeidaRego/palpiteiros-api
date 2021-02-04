package br.com.palpiteiros.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/*Punctuation Entity - Entidade Pontuação*/
@Entity
@Table(name = "tb_punctuation")
@Getter
@Setter
public class Punctuation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * punctuation entity attributes
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	/* many scores for a user */
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	private Integer totalPoints;
	/*
	 * a score has many guesses
	 */
	@OneToMany
	@JoinTable(name = "punctuation_hunchs")
	private List<Hunch> hunchs;
}
