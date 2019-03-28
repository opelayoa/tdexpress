package mx.tiendas3b.tdexpress.repository;

import org.springframework.data.repository.CrudRepository;

import mx.tiendas3b.tdexpress.entities.TicketInfo;

public interface TicketInfoRepository extends CrudRepository<TicketInfo, Integer> {

	TicketInfo getTicketInfoById(Integer ticketId);
}
