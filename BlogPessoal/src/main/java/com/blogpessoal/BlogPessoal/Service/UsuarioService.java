package com.blogpessoal.BlogPessoal.Service;

import java.nio.charset.Charset;
import java.util.Optional;
import org.apache.commons.codec.binary.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.stereotype.Service;

import com.blogpessoal.BlogPessoal.model.userLogin;
import com.blogpessoal.BlogPessoal.model.usuario;
import com.blogpessoal.BlogPessoal.repository.UserRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UserRepository _repository;
	
	public usuario SingUpUser (usuario usuario){ //cadastro da conta
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); //Chamando o Encoder
		
		String senhaEncoder = encoder.encode(usuario.getSenha()); //transformando em "hash"
		usuario.setSenha(senhaEncoder); //seto a senha como "hash"
		
		return _repository.save(usuario); //mando para o repository a "hash"
	}
	
	public Optional<userLogin> Logar(Optional<userLogin> user){//Entender um pouco melhor sobre optinal
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<usuario> usuario = _repository.findByUsuario(user.get().getUsuario());
		
		if(usuario.isPresent()) { //entender melhor esse if
			if(encoder.matches(user.get().getSenha(), usuario.get().getSenha())) {
				
				String auth = user.get().getUsuario() + ":" + user.get().getSenha();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String 	authHeader = "Basic" + new String(encodedAuth);
				
				user.get().setToken(authHeader);
				user.get().setNome(usuario.get().getNome());
				
				return user;
				
			}
		}
		
		return null;
	}
}
