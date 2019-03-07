package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.TipoSintoma;
import mx.tiendas3b.tdexpress.repository.TipoSintomaRepository;

@RestController
@RequestMapping("/tipo-sucursal")
public class TipoSucursalController {

	@Autowired
	TipoSintomaRepository tipoSintomaRepository;

	@GetMapping("")
	public List<TipoSintoma> getAll() {
		return (List<TipoSintoma>) tipoSintomaRepository.findAll();
	}
}
