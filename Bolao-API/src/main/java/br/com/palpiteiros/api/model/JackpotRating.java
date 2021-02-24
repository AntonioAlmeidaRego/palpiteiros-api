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

/*Ranking Entity - Entidade Ranking do Bolão*/
@Entity
@Table(name = "tb_classification")
@Data
public class JackpotRating implements Serializable {

	private static final long serialVersionUID = 1L;
	/*
	 * ranking entity attributes
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	/*
	 * a classification has many scores
	 */
	@OneToMany
	@JoinTable(name = "classification_punctuations")
	private List<Punctuation> punctuations;
}
