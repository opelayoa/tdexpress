package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.Zona;
import mx.tiendas3b.tdexpress.repository.ZonaRepository;

@RestController
@RequestMapping("/zonas")
public class ZonaController {
	
	@Autowired
	ZonaRepository regionRepository;
	
	@GetMapping("")
	public List<Zona> getAll() {
		return (List<Zona>) regionRepository.findAll();
	}
}
