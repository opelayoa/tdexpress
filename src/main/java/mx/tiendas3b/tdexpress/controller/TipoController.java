package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.Tipotd;
import mx.tiendas3b.tdexpress.repository.TipoRepository;

@RestController
@RequestMapping("/tipos")
public class TipoController {

	@Autowired
	TipoRepository tipoRepository;

	@GetMapping("")
	public List<Tipotd> getAll() {
		return (List<Tipotd>) tipoRepository.findAll();
	}
}
