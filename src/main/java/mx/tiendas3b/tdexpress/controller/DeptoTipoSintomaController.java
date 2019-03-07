package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.DeptoTipoSintoma;
import mx.tiendas3b.tdexpress.repository.DeptoTipoSintomaRepository;

@RestController
@RequestMapping("/departamento-tipo-sintoma")
public class DeptoTipoSintomaController {

	@Autowired
	DeptoTipoSintomaRepository deptoTipoSintomaRepository;

	@GetMapping("")
	public List<DeptoTipoSintoma> getAll() {
		return (List<DeptoTipoSintoma>) deptoTipoSintomaRepository.findAll();
	}

}
