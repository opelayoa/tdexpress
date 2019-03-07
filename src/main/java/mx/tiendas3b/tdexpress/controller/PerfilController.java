package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.Perfil;
import mx.tiendas3b.tdexpress.repository.PerfilRepository;

@RestController
@RequestMapping("/perfiles")
public class PerfilController {

	@Autowired
	PerfilRepository perfilRepository;

	@GetMapping("")
	public List<Perfil> getAll() {
		return (List<Perfil>) perfilRepository.findAll();
	}

}
