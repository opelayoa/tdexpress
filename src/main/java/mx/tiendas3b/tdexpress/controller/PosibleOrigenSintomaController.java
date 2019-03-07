package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.PosibleOrigen;
import mx.tiendas3b.tdexpress.repository.PosibleOrigenRepository;

@RestController
@RequestMapping("/posible-origen")
public class PosibleOrigenSintomaController {

	@Autowired
	PosibleOrigenRepository posibleOrigenRepository;

	@GetMapping("")
	public List<PosibleOrigen> getAll() {
		return (List<PosibleOrigen>) posibleOrigenRepository.findAll();
	}
}
