package br.com.palpiteiros.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/*BrokenPhase Entity - Entidade Fase da Partida*/
@Entity
@Table(name = "tb_broken_phase")
@Getter
@Setter
public class BrokenPhase implements Serializable {

	private static final long serialVersionUID = 1L;
	/*
	 * brokenPhase entity attributes
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
}
