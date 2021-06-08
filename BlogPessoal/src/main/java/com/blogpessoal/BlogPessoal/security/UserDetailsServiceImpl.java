/*
 * package com.blogpessoal.BlogPessoal.security;
 * 
 * import java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * 
 * import org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.stereotype.Service;
 * 
 * import com.blogpessoal.BlogPessoal.model.usuario; import
 * com.blogpessoal.BlogPessoal.repository.UserRepository;
 * 
 * @Service public class UserDetailsServiceImpl implements UserDetailsService{
 * 
 * @Autowired private UserRepository userRepository;
 * 
 * @Override public UserDetails loadUserByUsername(String userName) {
 * 
 * Optional<usuario> user = userRepository.findByUsuario(userName);
 * 
 * 
 * return user.map(UserDetailsImpl::new).get(); } }
 */