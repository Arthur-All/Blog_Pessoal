package com.blogpessoal.BlogPessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long _id;
	
	@NotNull
	@Size(min = 2, max = 100)
	private String _nome;
	
	@NotNull
	@Size(min = 6, max = 100)
	private String _senha;
	
	@NotNull
	@Size(min = 6, max = 100)
	private String _usuario;
	
	
	public long getId() {
		return _id;
	}
	public void setId(long id) {
		this._id = id;
	}
	public String getNome() {
		return _nome;
	}
	public void setNome(String nome) {
		this._nome = nome;
	}
	public String getSenha() {
		return _senha;
	}
	public void setSenha(String senha) {
		this._senha = senha;
	}
	public String getUsuario() {
		return _usuario;
	}
	public void setUsuario(String usuario) {
		this._usuario = usuario;
	}
	

	
	
}
