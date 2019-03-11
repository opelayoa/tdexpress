package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.IconEntity;
import mx.tiendas3b.tdexpress.repository.IconEntityRepository;

@RestController
@RequestMapping("/icon-entity")
public class IconEntityController {

	@Autowired
	IconEntityRepository iconEntityRepository;

	@GetMapping("")
	public List<IconEntity> getAll() {
		return (List<IconEntity>) iconEntityRepository.findAll();
	}
}
