package com.toures.balon.rest.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

import java.util.Date;

@Data
public class UsuarioModelo {

	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Integer id;
	private TipoDocumentoModelo tipoDocumentoId;
	private Long documento;
	private String correo;
	private String nombreUsuario;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Integer puntosAcomulados;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String contrasena;
	private List<RolModelo> roles;

	public UsuarioModelo() {
	}



}
