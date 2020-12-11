package br.com.everis.estacionamento.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.everis.estacionamento.modelo.Veiculo;

public class VeiculoDto {
	
	Long id;
	String marca;
	String modelo;

	public VeiculoDto(Veiculo veiculo) {
		this.id = veiculo.getId();
		this.marca = veiculo.getMarca();
		this.modelo = veiculo.getModelo();
	}

	public Long getId() {
		return id;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public static List<VeiculoDto> converter(List<Veiculo> veiculo) {

		return veiculo.stream().map(VeiculoDto::new).collect(Collectors.toList());
	}
}
