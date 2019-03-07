package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.Region;
import mx.tiendas3b.tdexpress.repository.RegionRepository;

@RestController
@RequestMapping("/regiones")
public class RegionController {
	
	@Autowired
	RegionRepository regionRepository;
	
	@GetMapping("")
	public List<Region> getAll() {
		return (List<Region>) regionRepository.findAll();
	}
}
