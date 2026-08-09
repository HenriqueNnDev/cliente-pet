package br.com.petz.cliente_pet.cliente.application.api;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String email;
	private String celular;
	private Boolean aceitaTermos;
	private LocalDate dataHoraDoCadastro;
}
