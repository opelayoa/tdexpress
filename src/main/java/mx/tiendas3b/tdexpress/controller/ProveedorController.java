package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.Proveedor;
import mx.tiendas3b.tdexpress.repository.ProveedorRepository;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {

	@Autowired
	ProveedorRepository proveedorRepository;

	@GetMapping("")
	public List<Proveedor> getAll() {
		return (List<Proveedor>) proveedorRepository.findAll();
	}

}
