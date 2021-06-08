package com.blogpessoal.BlogPessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogpessoal.BlogPessoal.model.usuario;

public interface UserRepository extends JpaRepository<usuario, Long>{
	public Optional<usuario> findByUsuario(String usuario);
	
	
}
