package br.com.everis.estacionamento.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.ManyToOne;
import org.springframework.lang.Nullable;
import br.com.everis.estacionamento.modelo.Estacionamento;
import br.com.everis.estacionamento.modelo.Veiculo;

public class EstacionamentoDto {

	private Long id;
	@ManyToOne
	private Veiculo veiculo;
	private String placa;
	private LocalDateTime dataHoraEntrada;
	@Nullable
	private LocalDateTime dataHoraSaida;
	
	public EstacionamentoDto(Estacionamento estacionamento) {
		this.id = estacionamento.getId();
		this.veiculo = estacionamento.getVeiculo();
		this.placa = estacionamento.getPlaca();
		this.dataHoraEntrada = estacionamento.getDataHoraEntrada();
		this.dataHoraSaida = estacionamento.getDataHoraSaida();
	}

	public Long getId() {
		return id;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public LocalDateTime getDataHoraEntrada() {
		return dataHoraEntrada;
	}

	public LocalDateTime getDataHoraSaida() {
		return dataHoraSaida;
	}

	public static List<EstacionamentoDto> converter(List<Estacionamento> estacionamento) {
		
		return estacionamento.stream().map(EstacionamentoDto::new).collect(Collectors.toList());
	}

}
