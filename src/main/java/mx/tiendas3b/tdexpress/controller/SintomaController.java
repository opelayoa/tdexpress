package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.Sintoma;
import mx.tiendas3b.tdexpress.repository.SintomaRepository;

@RestController
@RequestMapping("/sintomas")
public class SintomaController {

	@Autowired
	SintomaRepository sintomaRepository;

	@GetMapping("")
	public List<Sintoma> getAll() {
		return (List<Sintoma>) sintomaRepository.findAll();
	}
}
