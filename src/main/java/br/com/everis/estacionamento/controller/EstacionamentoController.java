package br.com.everis.estacionamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.everis.estacionamento.controller.dto.EstacionamentoDto;
import br.com.everis.estacionamento.controller.form.EstacionamentoForm;
import br.com.everis.estacionamento.modelo.Estacionamento;
import br.com.everis.estacionamento.repository.EstacionamentoRepository;

@RestController
@RequestMapping("/estacionamento")
public class EstacionamentoController {

	@Autowired
	private EstacionamentoRepository estacionamentoRepository;

	@GetMapping
	public List<EstacionamentoDto> lista() {

		List<Estacionamento> estacionamento = estacionamentoRepository.findAll();
		return EstacionamentoDto.converter(estacionamento);
	}

	@PostMapping
	public void cadastrar(@RequestBody EstacionamentoForm form) {
		Estacionamento estacionamento = form.converter();
		estacionamentoRepository.save(estacionamento);

	}
	
}
