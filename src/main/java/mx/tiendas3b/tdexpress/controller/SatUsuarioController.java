package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.SatUsuario;
import mx.tiendas3b.tdexpress.repository.SatUsuarioRepository;

@RestController
@RequestMapping("/sat-usuarios")
public class SatUsuarioController {

	@Autowired
	SatUsuarioRepository satUsuarioRepository;

	@GetMapping("")
	public List<SatUsuario> getAll() {
		return (List<SatUsuario>) satUsuarioRepository.findAll();
	}
}
