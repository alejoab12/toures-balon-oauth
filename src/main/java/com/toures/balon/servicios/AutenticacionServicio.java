package com.toures.balon.servicios;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gema.autentication.model.AuthenticationSecurityRequest;
import com.gema.autentication.model.AuthenticationSecurityResponse;
import com.gema.autentication.security.config.ApplicationConfig;
import com.gema.autentication.security.service.SecurityProcessJwt;
import com.toures.balon.repositorio.UsuarioRepositorio;
import com.toures.balon.rest.modelos.AutenticacionModelo;

@Service
public class AutenticacionServicio extends SecurityProcessJwt {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	

	@Override
	public AuthenticationSecurityResponse generateSecurity(AuthenticationSecurityRequest authenticationSecurityrequest,
			ApplicationConfig applicationConfig) {
		AutenticacionModelo autenticacion = usuarioRepositorio.buscarPorUsuarioOCorreo(
				authenticationSecurityrequest.getUsername(), authenticationSecurityrequest.getUsername());
		List<String> listRoles = autenticacion.getUsuario().getRoles().stream().map(x -> x.getNombre())
				.collect(Collectors.toList());
		return buildAuthenticationSecurityResponse(authenticationSecurityrequest, autenticacion.getContrasena(),
				listRoles, applicationConfig);
	}

}
