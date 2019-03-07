package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.PerfilTipoSintoma;
import mx.tiendas3b.tdexpress.repository.PerfilTipoSintomaRepository;

@RestController
@RequestMapping("/perfil-tipo-sintoma")
public class PerfilTipoSintomaController {
	
	@Autowired
	PerfilTipoSintomaRepository perfilTipoSintomaRepository;
	
	@GetMapping("")
	public List<PerfilTipoSintoma> getAll(){
		return (List<PerfilTipoSintoma>) perfilTipoSintomaRepository.findAll();
	}
}
