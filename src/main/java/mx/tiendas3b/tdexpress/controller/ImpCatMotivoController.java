package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.ImpCatMotivo;
import mx.tiendas3b.tdexpress.repository.ImpCatMotivoRepository;

@RestController
@RequestMapping("/imp-cat-motivo")
public class ImpCatMotivoController {

	@Autowired
	ImpCatMotivoRepository impCatMotivoRepository;

	@GetMapping("")
	public List<ImpCatMotivo> getAll() {
		return (List<ImpCatMotivo>) impCatMotivoRepository.findAll();
	}

}
