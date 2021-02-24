package br.com.palpiteiros.api.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.palpiteiros.api.enums.StatusMatch;
import lombok.Data;

/*Match Entity - Entidade Partida*/
@Entity
@Table(name = "tb_match")
@Data
public class Match implements Serializable {

	private static final long serialVersionUID = 1L;

	/*
	 * match entity attributes
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;	
	
	@Enumerated(EnumType.STRING)
	private StatusMatch statusMatch;
	
	private String place;
	/*
	 * a match has a match phase
	 */
	@OneToOne
	@JoinColumn(name = "phase_id")
	private Phase phase;
	
	private HomeTeam homeTeam;	
	private VisitingTeam visitingTeam;
}
