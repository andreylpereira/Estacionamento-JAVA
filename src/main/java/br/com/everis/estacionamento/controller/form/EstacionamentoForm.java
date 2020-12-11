package br.com.everis.estacionamento.controller.form;

import br.com.everis.estacionamento.modelo.Estacionamento;
import br.com.everis.estacionamento.modelo.Veiculo;


public class EstacionamentoForm {
	
	private Veiculo veiculo;
	private String placa;

	public EstacionamentoForm() {
		
	}
	
	public EstacionamentoForm(Veiculo veiculo, String placa) {
		this.veiculo = veiculo;
		this.placa = placa;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Estacionamento converter() {
		return new Estacionamento(veiculo, placa);
	}



}
