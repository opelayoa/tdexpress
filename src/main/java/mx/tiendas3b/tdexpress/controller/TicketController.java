package mx.tiendas3b.tdexpress.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

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
import mx.tiendas3b.tdexpress.entities.TicketInsert;
import mx.tiendas3b.tdexpress.entities.TicketSummary;
import mx.tiendas3b.tdexpress.entities.custom.TicketResponse;
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
	public ResponseEntity<TicketResponse> saveTicket(@RequestBody TicketInsert ticketInsert) {
		// ticketRepository.save(ticket);
		System.out.println(ticketInsert);
		Ticket ticket = new Ticket();
		ticket.setObservaciones(ticketInsert.getObservaciones());
		ticket.setSolucionremota((byte) (ticketInsert.isSolucionRemota() ? 0 : 1));
		ticket.setFechaapertura(ticketInsert.getFechaApertura());
		ticket.setFechaaperturaf(ticketInsert.getFechaApertura());
		ticket.setFechaaperturah(ticketInsert.getFechaApertura());
		ticket.setSolicitanteId(ticketInsert.getSolicitanteId());
		ticket.setLugarId(ticketInsert.getLugarId());
		ticket.setSintomaId(ticketInsert.getSintomaId());
		ticket.setDiagnosticoId(ticketInsert.getDiagnosticoId());
		ticket.setEstadoId(1);
		ticket.setTecnicoId(ticketInsert.getTecnicoId());
		ticket.setCapturistaId(ticketInsert.getCapturistaId());
		ticket.setTipo(ticketInsert.getTipo());
		ticket.setLeyenda(ticketInsert.getLeyenda());
		ticket.setCategoria(ticketInsert.getCategoria());
		ticket.setCorreo((byte) (ticketInsert.isCorreoManual() ? 1 : 0));
		try {
			ticket = this.saveTicket(ticket);

			TicketResponse ticketResponse = new TicketResponse();
			ticketResponse.setTicketId(ticket.getId());
			ticketResponse.setMessage("El ticket se genero satisfactoriamente.");
			ResponseEntity<TicketResponse> response = new ResponseEntity<>(ticketResponse, HttpStatus.CREATED);

			return response;
		} catch (Exception e) {
			ResponseEntity<TicketResponse> response = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			return response;
		}

	}
	
	@Transactional
	private Ticket saveTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}
}
