package br.com.petz.cliente_pet.cliente.application.api;

import java.util.UUID;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteResponse {
	private UUID idCliente;
}