package br.com.palpiteiros.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/*User Entity - Entidade Usuário*/
@Entity
@Table(name = "tb_user")
@Getter
@Setter
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	/*
	 * user entity attributes
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;
	private String cpf;

}
