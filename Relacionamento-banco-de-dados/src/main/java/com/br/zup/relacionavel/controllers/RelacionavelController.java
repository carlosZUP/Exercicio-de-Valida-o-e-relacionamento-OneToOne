package com.br.zup.relacionavel.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.zup.relacionavel.models.Login;
import com.br.zup.relacionavel.models.Usuario;
import com.br.zup.relacionavel.services.LoginService;
import com.br.zup.relacionavel.services.UsuarioService;

@Controller
public class RelacionavelController {

	@Autowired
	private LoginService loginservice;
	
	@GetMapping("/cadastro/login")
	public ModelAndView exibirFormulario() {
		ModelAndView model = new ModelAndView("cadastro.html");
		return model;
	}
	
	@PostMapping("/cadastro/login")
	public ModelAndView cadastroLogin(@Valid Usuario user, BindingResult bindingUser , @Valid Login login,
			BindingResult bindingLogin) {
		ModelAndView model = new ModelAndView("cadastro.html");
		
		if(bindingUser.hasErrors() || bindingLogin.hasErrors()) {
			List<String> msgs = new ArrayList<String>();
			for (ObjectError objerro : bindingUser.getAllErrors() ) {
				msgs.add(objerro.getDefaultMessage());
			}
			for (ObjectError objerro : bindingLogin.getAllErrors()) {
				msgs.add(objerro.getDefaultMessage());
				
			}
			model.addObject("msgs", msgs);
		} else {
			model.addObject("msgs", loginservice.cadastrarLogin(user, login));
		}
		
		return model;
	}
	
}
