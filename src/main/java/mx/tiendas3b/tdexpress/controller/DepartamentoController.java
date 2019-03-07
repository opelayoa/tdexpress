package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.Departamento;
import mx.tiendas3b.tdexpress.repository.DepartamentoRepository;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

	@Autowired
	DepartamentoRepository departamentoRepository;

	@GetMapping("")
	public List<Departamento> getAll() {
		return (List<Departamento>) departamentoRepository.findAll();
	}

}
