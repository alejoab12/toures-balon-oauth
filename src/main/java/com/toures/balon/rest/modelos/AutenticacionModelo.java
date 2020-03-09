package com.toures.balon.rest.modelos;

import lombok.Data;

@Data
public class AutenticacionModelo {
	private String contrasena;
	private UsuarioModelo usuario;
	public AutenticacionModelo() {
		super();
	}
	
	
}
