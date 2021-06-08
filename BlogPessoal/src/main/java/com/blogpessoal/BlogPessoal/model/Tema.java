package com.blogpessoal.BlogPessoal.model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tb_tema")
public class Tema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long _id;
	
	@NotNull
	private String _descricao;
	
	@OneToMany(mappedBy = "_tema", cascade =  CascadeType.ALL)
	@JsonIgnoreProperties("_tema")
	private List<Postagem> _postagem;
	
	
	public long getId() {
		return _id;
	}
	public void setId(long id) {
		this._id = id;
	}
	public String getDescricao() {
		return _descricao;
	}
	public void setDescricao(String descricao) {
		this._descricao = descricao;
	}
	public List<Postagem> getPostagem() {
		return _postagem;
	}
	public void setPostagem(List<Postagem> postagem) {
		this._postagem = postagem;
	}
}
