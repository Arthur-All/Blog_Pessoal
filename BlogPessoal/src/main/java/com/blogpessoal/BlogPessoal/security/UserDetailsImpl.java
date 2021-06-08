package com.blogpessoal.BlogPessoal.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.blogpessoal.BlogPessoal.model.usuario;

public class UserDetailsImpl implements UserDetails{
	private static final long serialVersionUID = 1L;

	private String _userName;
	private String _password;
	private List<GrantedAuthority> authorities;

	public UserDetailsImpl(usuario user) {
		this._userName = user.getUsuario();
		this._password = user.getSenha();		
	}

	public UserDetailsImpl() {}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return _password;
	}

	@Override
	public String getUsername() {

		return _userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
} 