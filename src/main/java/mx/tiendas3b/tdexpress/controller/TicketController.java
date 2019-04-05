package mx.tiendas3b.tdexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tiendas3b.tdexpress.entities.Ticket;
import mx.tiendas3b.tdexpress.entities.TicketInfo;
import mx.tiendas3b.tdexpress.entities.TicketSummary;
import mx.tiendas3b.tdexpress.repository.TicketInfoRepository;
import mx.tiendas3b.tdexpress.repository.TicketRepository;
import mx.tiendas3b.tdexpress.repository.TicketSummaryRepository;

@RestController
@RequestMapping("/tickets")
public class TicketController {

	@Autowired
	TicketRepository ticketRepository;

	@Autowired
	TicketInfoRepository ticketInfoRepository;

	@Autowired
	TicketSummaryRepository ticketSummaryRepository;

	@GetMapping("/info/{id}")
	public TicketInfo getAll(@PathVariable("id") Integer ticketId) {
		TicketInfo ticketInfo = ticketInfoRepository.getTicketInfoById(ticketId);
		return ticketInfo;
	}

	@GetMapping("/summary/user/{userId}/type/{typeId}")
	public List<TicketSummary> getByType(@PathVariable("userId") Integer userId,
			@PathVariable("typeId") Integer typeId) {
		List<TicketSummary> list = ticketSummaryRepository.getTicketsSummary(userId, typeId);
		return list;
	}
	
	@PostMapping("")
	public ResponseEntity<Void> saveTicket(@RequestBody Ticket ticket) {
		//ticketRepository.save(ticket);
		System.out.println(ticket);
		ResponseEntity<Void> response = new ResponseEntity<>(HttpStatus.CREATED);
		return response;
	}
}
