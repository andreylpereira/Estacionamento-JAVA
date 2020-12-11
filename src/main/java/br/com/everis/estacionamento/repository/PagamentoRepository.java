package br.com.everis.estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.everis.estacionamento.modelo.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
