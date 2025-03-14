package com.br.zup.relacionavel.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank( message = "Nome não pode ficar em branco")
	@Size(min = 2, message = "Nome tem que ter no minimo 2 letas")
	private String nome;
	
	@NotBlank( message = "Sobrenome não pode ficar em branco")
	@Size(min = 2, message = "Sobrenome tem que ter no minimo 2 letas")
	private String sobrenome;
	
	@NotBlank( message = "Email não pode ficar em branco")
	@Email(message = "E-MAIL INVÁLIDO")
	private String email;
	
	@OneToOne(mappedBy = "usuario")
	private Login login;
	
	public Usuario() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
}
