package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.StatusProyectos;
import mx.tiendas3b.tdexpress.repository.StatusProyectosRepository;

@RestController
@RequestMapping("/status-proyectos")
public class StatusProyectosController {

	@Autowired
	StatusProyectosRepository statusProyectosRepository;

	@GetMapping("")
	public List<StatusProyectos> getAll() {
		return (List<StatusProyectos>) statusProyectosRepository.findAll();
	}
}
