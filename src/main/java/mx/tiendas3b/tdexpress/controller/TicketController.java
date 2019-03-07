package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.Ticket;
import mx.tiendas3b.tdexpress.repository.TicketRepository;

@RestController
@RequestMapping("/tickets")
public class TicketController {

	@Autowired
	TicketRepository ticketRepository;

	@GetMapping("")
	public List<Ticket> getAll() {
		return (List<Ticket>) ticketRepository.findAll();
	}
}
