package br.com.everis.estacionamento.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.everis.estacionamento.controller.dto.PagamentoDto;
import br.com.everis.estacionamento.modelo.Pagamento;
import br.com.everis.estacionamento.repository.PagamentoRepository;

public class PagamentoController {
	
	@Autowired
	private PagamentoRepository pagamentoRepository;
	
	@RequestMapping("/pagamento")
	public List<PagamentoDto> lista() {
		
		List<Pagamento> pagamento = pagamentoRepository.findAll();
		return PagamentoDto.converter(pagamento);
	}

}
