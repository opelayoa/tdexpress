package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.DeptoSintomaDiagnostico;
import mx.tiendas3b.tdexpress.repository.DeptoSintomaDiagnosticoRepository;

@RestController
@RequestMapping("/departamento-sintoma-diagnostico")
public class DeptoSintomaDiagnosticoController {

	@Autowired
	DeptoSintomaDiagnosticoRepository deptoSintomaDiagnosticoRepository;

	@GetMapping("")
	public List<DeptoSintomaDiagnostico> getAll() {
		return (List<DeptoSintomaDiagnostico>) deptoSintomaDiagnosticoRepository.findAll();
	}

}
