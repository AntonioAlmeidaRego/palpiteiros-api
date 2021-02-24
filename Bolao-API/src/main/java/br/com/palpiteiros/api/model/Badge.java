package br.com.palpiteiros.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

/*Badge Entity - Entidade Badge*/
@Entity
@Table(name = "tb_badge")
@Data
public class Badge implements Serializable {

	private static final long serialVersionUID = 1L;
	/*
	 * badge entity attributes
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	/*
	 * many badge has many users
	 */
	@ManyToMany
	@JoinTable(name = "badge_users")
	private List<User> users;
}
