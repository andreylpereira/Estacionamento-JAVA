package br.com.everis.estacionamento.controller.form;

import br.com.everis.estacionamento.modelo.Veiculo;
import br.com.everis.estacionamento.repository.VeiculoRepository;

public class VeiculoForm {
	
	private String marca;
	private String modelo;
	private String placa;
	
	public Veiculo converter(VeiculoRepository repository) {
		return new Veiculo(marca, modelo, placa);
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
