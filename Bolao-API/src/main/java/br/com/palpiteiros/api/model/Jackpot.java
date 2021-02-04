package br.com.palpiteiros.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/*
 * Jackpot Entity - Entidade Bolão
 * */
@Entity
@Table(name = "tb_bolao")
@Getter
@Setter
public class Jackpot implements Serializable {

	private static final long serialVersionUID = 1L;

	/*
	 * jackpot entity attributes
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private boolean isStatus;
	/*
	 * a jackpot has a championship
	 */
	@OneToOne
	@JoinColumn(name = "championship_id")
	private Championship championship;
	private Double registrationFee;
	/*
	 * a jackpot has many users
	 */
	@OneToMany
	@JoinTable(name = "bolao_users")
	private List<User> users;
	/* a jackpot has a award */
	@OneToOne
	@JoinColumn(name = "award_id")
	private Award award;

	public Jackpot() {
		isStatus = false;
	}
}
