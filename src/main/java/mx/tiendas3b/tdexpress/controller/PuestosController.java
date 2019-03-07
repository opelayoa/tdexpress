package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.Puestos;
import mx.tiendas3b.tdexpress.repository.PuestosRepository;

@RestController
@RequestMapping("/puestos")
public class PuestosController {

	@Autowired
	PuestosRepository puestosRepository;

	@GetMapping("")
	public List<Puestos> getAll() {
		return (List<Puestos>) puestosRepository.findAll();
	}
}
