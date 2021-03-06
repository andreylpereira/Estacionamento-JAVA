package br.com.everis.estacionamento.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.everis.estacionamento.controller.dto.VeiculoDto;
import br.com.everis.estacionamento.controller.form.VeiculoForm;
import br.com.everis.estacionamento.modelo.Veiculo;
import br.com.everis.estacionamento.repository.VeiculoRepository;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

	@Autowired
	private VeiculoRepository veiculoRepository;

	@GetMapping
	public List<VeiculoDto> lista() {

		List<Veiculo> veiculo = veiculoRepository.findAll();
		return VeiculoDto.converter(veiculo);
	}

	@PostMapping
	public void cadastrar(@RequestBody VeiculoForm form) {
		Veiculo veiculo = form.converter(veiculoRepository);
		veiculoRepository.save(veiculo);
		
	}

}
