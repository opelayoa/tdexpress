package mx.tiendas3b.tdexpress.repository;

import org.springframework.data.repository.CrudRepository;

import mx.tiendas3b.tdexpress.entities.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {

}
