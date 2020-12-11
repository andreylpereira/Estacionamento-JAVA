package br.com.everis.estacionamento.modelo;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.springframework.lang.Nullable;

@Entity
public class Estacionamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private Veiculo veiculo;
	private String placa;
	private LocalDateTime dataHoraEntrada = LocalDateTime.now();
	@Nullable
	private LocalDateTime dataHoraSaida;

	public Estacionamento() {

	}

	public Estacionamento(Veiculo veiculo, String placa) {

	}

	public Estacionamento(Long id, Veiculo veiculo, String placa, LocalDateTime dataHoraEntrada,
			LocalDateTime dataHoraSaida) {

		this.id = id;
		this.veiculo = veiculo;
		this.placa = placa;
		this.dataHoraEntrada = dataHoraEntrada;
		this.dataHoraSaida = dataHoraSaida;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public LocalDateTime getDataHoraEntrada() {
		return dataHoraEntrada;
	}

	public void setDataHoraEntrada(LocalDateTime dataHoraEntrada) {
		this.dataHoraEntrada = dataHoraEntrada;
	}

	public LocalDateTime getDataHoraSaida() {
		return dataHoraSaida;
	}

	public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
		this.dataHoraSaida = dataHoraSaida;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estacionamento other = (Estacionamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
