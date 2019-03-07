package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.Acceso;
import mx.tiendas3b.tdexpress.repository.AccesoRepository;

@RestController
@RequestMapping("/accesos")
public class AccesoController {

	@Autowired
	AccesoRepository accesoRepository;

	@GetMapping("")
	public List<Acceso> getAll() {
		return (List<Acceso>) accesoRepository.findAll();
	}
}
