package com.toures.balon.rest.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TipoDocumentoModelo {

	private Integer id;
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private String name;

	public TipoDocumentoModelo() {
	}

}
