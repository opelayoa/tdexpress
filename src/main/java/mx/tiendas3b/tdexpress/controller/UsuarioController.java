package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.Usuario;
import mx.tiendas3b.tdexpress.repository.UsuarioRepository;

@RestController
@RequestMapping("/tde/usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping("/")
	public List<Usuario> getAll() {
		return (List<Usuario>) usuarioRepository.findAll();
	}
}
