package com.blogpessoal.BlogPessoal.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogpessoal.BlogPessoal.Service.UsuarioService;
import com.blogpessoal.BlogPessoal.model.userLogin;
import com.blogpessoal.BlogPessoal.model.usuario;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {
	
	@Autowired
	private UsuarioService _userService;
	
	@PostMapping("/logar")
	public ResponseEntity<userLogin> Autentication(@RequestBody Optional<userLogin> user){
		return _userService.Logar(user).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<usuario> Post (@RequestBody usuario user){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(_userService.SingUpUser(user));
		
		
		
	}
	

}
