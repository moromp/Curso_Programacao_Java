package cafeteria;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(nullable = false, length = 50)
	private String nome;

	@Column(nullable = false)
	private Date dataCadastro;

	@Column(nullable = false)
	private int idade;

	@Enumerated(EnumType.STRING)
	private sexo sexo;

	@Column(nullable = false)
	private Double renda;

	@Enumerated(EnumType.STRING)
	private perfilcliente perfil;

	public cliente(String nome, Date data, int idade, sexo sexo,double valor) {
		this.nome = nome;
		this.dataCadastro = data;
		this.idade = idade;
		this.sexo = sexo;
		this.renda = valor;
		this.perfil = updatePerfil(valor);
	}

	public perfilcliente updatePerfil(Double valor) {

		if (valor >= 2000) {
			return perfilcliente.PREMIUN;
		} 
		else if (valor >= 1000 && valor < 2000) {
			return perfilcliente.GOLD;
		} 
		else {
			return perfilcliente.NORMAL;
		}
	}
	
	
}
