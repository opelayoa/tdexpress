package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.SolucionesStandard;
import mx.tiendas3b.tdexpress.repository.SolucionesStandardRepository;

@RestController
@RequestMapping("/soluciones-standard")
public class SolucionesStandardController {

	@Autowired
	SolucionesStandardRepository solucionesStandardRepository;

	@GetMapping("")
	public List<SolucionesStandard> getAll() {
		return (List<SolucionesStandard>) solucionesStandardRepository.findAll();
	}
}
