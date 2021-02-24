package br.com.palpiteiros.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

/*User Entity - Entidade Usuário*/
@Entity
@Table(name = "tb_user")
@Data
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	/*
	 * user entity attributes
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull(message = "Campo nome não pode ser null")
	@NotEmpty(message = "Campo nome não pode ser vazio")
	private String name;
	
	@NotNull(message = "Campo e-mail não pode ser null")
	@NotEmpty(message = "Campo e-mail não pode ser vazio")
	private String email;
	
	@NotNull(message = "Campo phone não pode ser null")
	@NotEmpty(message = "Campo phone não pode ser vazio")
	private String phone;
	
	@NotNull(message = "Campo password não pode ser null")
	@NotEmpty(message = "Campo password não pode ser vazio")
	private String password;
	
	@NotNull(message = "Campo CPF não pode ser null")
	@NotEmpty(message = "Campo CPF não pode ser vazio")
	private String cpf;
	
	//Atributos referentes ao desempenho do usuário
	private int ranking; //Ranking do usuáio consideranto palpites x total de acertos 
	private int TotalHunches; // Total de palpites efetuados
	private int totalPoints; //Soma dos pontos que já marcou
	private int totalJackpots; //Bolões que já participou
	private int precision; //Precisão de acertos em %
	private int totalHits; //Total de acertos exatos
	private int totalHalfHits; //Total de acertos do vencedor
	
	

}
