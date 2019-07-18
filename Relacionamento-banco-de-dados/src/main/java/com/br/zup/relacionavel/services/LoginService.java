package com.br.zup.relacionavel.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.zup.relacionavel.models.Login;
import com.br.zup.relacionavel.models.Usuario;
import com.br.zup.relacionavel.repositories.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;
	
	public String cadastrarLogin(Usuario user, Login login) {
		login.setUsuario(user);
		loginRepository.save(login);
		return "Login cadastro";
	}
	
}
