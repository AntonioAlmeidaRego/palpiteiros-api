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

/*BrokenPhase Entity - Entidade Fase da Partida*/
@Entity
@Table(name = "tb_broken_phase")
@Data
public class Phase implements Serializable {

	private static final long serialVersionUID = 1L;
	/*
	 * brokenPhase entity attributes
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	@OneToMany
	@JoinTable(name = "phase_matchs")
	private List<Match> matchs;
}
