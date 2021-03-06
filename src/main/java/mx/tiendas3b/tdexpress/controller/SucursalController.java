package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.Sucursal;
import mx.tiendas3b.tdexpress.repository.SucursalRepository;

@RestController
@RequestMapping("/sucursales")
public class SucursalController {

	@Autowired
	SucursalRepository sucursalRepository;

	@GetMapping("")
	public List<Sucursal> getAll() {
		return (List<Sucursal>) sucursalRepository.findAll();
	}
}
