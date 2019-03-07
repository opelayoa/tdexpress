package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.SintomaDiagnostico;
import mx.tiendas3b.tdexpress.repository.SintomaDiagnosticoRepository;

@RestController
@RequestMapping("/sintoma-diagnostico")
public class SintomaDiagnosticoController {

	@Autowired
	SintomaDiagnosticoRepository sintomaDiagnosticoRepository;

	@GetMapping("")
	public List<SintomaDiagnostico> getAll() {
		return (List<SintomaDiagnostico>) sintomaDiagnosticoRepository.findAll();
	}
}
