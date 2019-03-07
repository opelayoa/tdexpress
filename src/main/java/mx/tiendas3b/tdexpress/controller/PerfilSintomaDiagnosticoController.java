package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.PerfilSintomaDiagnostico;
import mx.tiendas3b.tdexpress.repository.PerfilSintomaDiagnosticoRepository;

@RestController
@RequestMapping("/perfil-sintoma-diagnostico")
public class PerfilSintomaDiagnosticoController {
	
	@Autowired
	PerfilSintomaDiagnosticoRepository perfilSintomaDiagnosticoRepository;
	
	@GetMapping("")
	public List<PerfilSintomaDiagnostico> getAll() {
		return (List<PerfilSintomaDiagnostico>) perfilSintomaDiagnosticoRepository.findAll();
	}
}
