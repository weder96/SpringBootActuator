package com.wsousa.notification.response;

import com.wsousa.notification.integration.LocalidadesResponse;

public class PaisResponse {
	
	private final Long id;
	private final String nome;

	public PaisResponse(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public Long getId() {
		return id;
	}

	public static PaisResponse deLocalidadesResponse(LocalidadesResponse localidadesResponse) {
		return new PaisResponse(
				localidadesResponse.getId().getM49(),
				localidadesResponse.getNome()
		);
	}
}
