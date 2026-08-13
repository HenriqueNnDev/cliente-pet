package br.com.petz.cliente_pet.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.petz.cliente_pet.cliente.domain.Cliente;
import br.com.petz.cliente_pet.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String email;
	private String celular;
	private String telefone;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private Boolean aceitaTermos;
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao; 

	public ClienteDetalhadoResponse(Cliente cliente) {
	    this.idCliente = cliente.getIdCliente();
	    this.nomeCompleto = cliente.getNomeCompleto();
	    this.cpf = cliente.getCpf();
	    this.email = cliente.getEmail();
	    this.celular = cliente.getCelular();
	    this.telefone = cliente.getTelefone();
	    this.sexo = cliente.getSexo();
	    this.dataNascimento = cliente.getDataNascimento();
	    this.aceitaTermos = cliente.getAceitaTermos();
	    this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
	    this.dataHoraDaUltimaAlteracao = cliente.getDataHoraDaUltimaAlteracao(); // ← pega do cliente
	}
}