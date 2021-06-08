package com.blogpessoal.BlogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Postagem")
public class Postagem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long _id;

	@NotNull
	@Size(min = 5, max = 100)
	private String _titulo;

	@NotNull
	@Size(min = 5, max = 550)
	private String _text;

	@Temporal(TemporalType.TIMESTAMP)
	private Date _data = new java.sql.Date(System.currentTimeMillis());
	@ManyToOne
	@JsonIgnoreProperties("_postagem")
	private Tema _tema;

	public Tema getTema() {
		return _tema;
	}

	public void setTema(Tema tema) {
		this._tema = tema;
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		this._id = id;
	}

	public String getTitulo() {
		return _titulo;
	}

	public void setTitulo(String titulo) {
		this._titulo = titulo;
	}

	public String getText() {
		return _text;
	}

	public void setText(String text) {
		this._text = text;
	}

	public Date getData() {
		return _data;
	}

	public void setData(Date data) {
		this._data = data;
	}

}
