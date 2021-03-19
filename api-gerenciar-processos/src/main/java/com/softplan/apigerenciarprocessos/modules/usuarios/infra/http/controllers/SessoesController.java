package com.softplan.apigerenciarprocessos.modules.usuarios.infra.http.controllers;

import com.softplan.apigerenciarprocessos.modules.usuarios.entities.AuthenticationRequest;
import com.softplan.apigerenciarprocessos.modules.usuarios.entities.AuthenticationResponse;
import com.softplan.apigerenciarprocessos.modules.usuarios.entities.Usuario;
import com.softplan.apigerenciarprocessos.modules.usuarios.services.AuthenticationService;
import com.softplan.apigerenciarprocessos.modules.usuarios.services.CriarUsuarioService;
import com.softplan.apigerenciarprocessos.shared.configs.JwtUtil;
import com.softplan.apigerenciarprocessos.shared.infra.responses.WrongCredentialsException;

import com.softplan.apigerenciarprocessos.modules.usuarios.entities.enums.Funcao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sessoes")
public class SessoesController {
  @Autowired
  private AuthenticationService authenticationService;

  @Autowired
  private CriarUsuarioService criarUsuarioService;

  @Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUtil jwtTokenUtil;

  @RequestMapping(value = "", method = RequestMethod.POST)
  public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authenticationRequest.getEmail(), authenticationRequest.getSenha())
			);
		}
		catch (BadCredentialsException e) {
			throw new WrongCredentialsException("Email ou senha incorretos!");
		}


		final UserDetails userDetails = authenticationService
      .loadUserByUsername(authenticationRequest.getEmail());

		final String jwt = jwtTokenUtil.generateToken(userDetails);

		return ResponseEntity.ok(new AuthenticationResponse(jwt, userDetails));
	}

  @RequestMapping(value = "/registrar", method = RequestMethod.POST)
  public Usuario post(@RequestBody Usuario usuarioRequest) {
		System.out.println("********************** SessoesController /REGISTRAR" + usuarioRequest.toString());
		return criarUsuarioService.criarUsuario(usuarioRequest);
  }

}
