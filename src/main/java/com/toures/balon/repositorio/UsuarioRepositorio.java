package com.toures.balon.repositorio;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.toures.balon.rest.modelos.AutenticacionModelo;

@FeignClient(name="toures-balon-usuario-service")
public interface UsuarioRepositorio {
	@PostMapping("/autenticacion")
	public AutenticacionModelo buscarPorUsuarioOCorreo(
			@RequestParam("nombreUsuario")String nombreUsuario,@RequestParam("correo")String correo);
}
