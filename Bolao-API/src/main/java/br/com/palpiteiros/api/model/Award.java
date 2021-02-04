package br.com.palpiteiros.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/*Award Entity - Entidade Premiação*/
@Entity
@Table(name = "tb_award")
@Getter
@Setter
public class Award implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * award entity attributes
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double firstPlace;
	private Double secondPlace;
	private Double thirdPlace;
}
