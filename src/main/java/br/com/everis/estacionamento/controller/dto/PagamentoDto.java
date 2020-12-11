package br.com.everis.estacionamento.controller.dto;

import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.OneToOne;
import br.com.everis.estacionamento.modelo.Estacionamento;
import br.com.everis.estacionamento.modelo.Pagamento;

public class PagamentoDto {

	Long id;
	@OneToOne
	Estacionamento estacionamento;
	double valor;

	public PagamentoDto(Pagamento pagamento) {
		this.id = pagamento.getId();
		this.estacionamento = pagamento.getEstacionamento();
		this.valor = pagamento.getValor();

	}

	public Long getId() {
		return id;
	}

	public Estacionamento getEstacionamento() {
		return estacionamento;
	}

	public double getValor() {
		return valor;
	}

	public static List<PagamentoDto> converter(List<Pagamento> pagamento) {
		
		return pagamento.stream().map(PagamentoDto::new).collect(Collectors.toList());
	}
	
}
