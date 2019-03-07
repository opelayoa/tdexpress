package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.Tienda;
import mx.tiendas3b.tdexpress.repository.TiendaRepository;

@RestController
@RequestMapping("/tiendas")
public class TiendaController {
	
	@Autowired
	TiendaRepository tiendaRepository;
	
	@GetMapping("")
	public List<Tienda> getAll() {
		return (List<Tienda>) tiendaRepository.findAll();
	}
}
