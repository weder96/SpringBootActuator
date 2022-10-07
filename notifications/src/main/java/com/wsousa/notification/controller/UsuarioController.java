package com.wsousa.notification.controller;


import com.wsousa.notification.domain.Usuario;
import com.wsousa.notification.repository.UsuarioRepository;
import com.wsousa.notification.request.UsuarioRequest;
import com.wsousa.notification.response.UsuarioResponse;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	private final UsuarioRepository usuarioRepository;
	private final PasswordEncoder passwordEncoder;

	public UsuarioController(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
		this.usuarioRepository = usuarioRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UsuarioResponse criarNovo(@RequestBody @Valid UsuarioRequest usuarioRequest) {
		final Usuario usuario = usuarioRequest.converterParaUsuario();
		usuario.setPermissao(Usuario.Permissao.CLIENTE);
		usuario.setSenha(passwordEncoder.encode(usuarioRequest.getSenha()));
		return UsuarioResponse.doUsuario(usuarioRepository.save(usuario));
	}

}
