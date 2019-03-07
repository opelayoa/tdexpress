package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.Diagnostico;
import mx.tiendas3b.tdexpress.repository.DiagnosticoRepository;

@RestController
@RequestMapping("/diagnosticos")
public class DiagnosticoController {

	@Autowired
	DiagnosticoRepository diagnosticoRepository;

	@GetMapping("")
	public List<Diagnostico> getAll() {
		return (List<Diagnostico>) diagnosticoRepository.findAll();
	}
}
