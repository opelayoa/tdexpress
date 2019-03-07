package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.Distrito;
import mx.tiendas3b.tdexpress.repository.DistritoRepository;

@RestController
@RequestMapping("/distritos")
public class DistritoController {

	@Autowired
	DistritoRepository distritoRepository;
	
	@GetMapping("")
	public List<Distrito> getAll(){
		return (List<Distrito>) distritoRepository.findAll();
	}
	
}
