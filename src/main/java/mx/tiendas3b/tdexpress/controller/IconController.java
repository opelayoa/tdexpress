package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.Icon;
import mx.tiendas3b.tdexpress.repository.IconRepository;

@RestController
@RequestMapping("/icons")
public class IconController {

	@Autowired
	IconRepository iconRepository;

	@GetMapping("")
	public List<Icon> getAll() {
		return (List<Icon>) iconRepository.findAll();
	}
}
