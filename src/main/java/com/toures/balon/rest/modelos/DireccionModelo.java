package com.toures.balon.rest.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class DireccionModelo {
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Integer id;
	private String direccion;
	private String nombre;
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Short activo;
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Timestamp fechaCreacion;
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Timestamp fechaInactivacion;
	private Integer usuarioId;

	public DireccionModelo() {
	}

}
