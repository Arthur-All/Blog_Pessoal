package com.blogpessoal.BlogPessoal.model;



public class userLogin {
	
	private String _nome;
	private String _usuario;
	private String _senha;
	private String _token;
	
	public String getNome() {
		return _nome;
	}
	public void setNome(String nome) {
		this._nome = nome;
	}
	public String getUsuario() {
		return _usuario;
	}
	public void setUsuario(String usuario) {
		this._usuario = usuario;
	}
	public String getSenha() {
		return _senha;
	}
	public void setSenha(String senha) {
		this._senha = senha;
	}
	public String getToken() {
		return _token;
	}
	public void setToken(String token) {
		this._token = token;
	}

	
}
