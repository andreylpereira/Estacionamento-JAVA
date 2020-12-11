package br.com.everis.estacionamento.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.everis.estacionamento.modelo.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

	//List<Veiculo> findAll();

}
