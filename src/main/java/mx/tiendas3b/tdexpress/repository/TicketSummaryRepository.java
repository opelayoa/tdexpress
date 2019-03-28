package mx.tiendas3b.tdexpress.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mx.tiendas3b.tdexpress.entities.TicketSummary;

public interface TicketSummaryRepository extends CrudRepository<TicketSummary, Integer> {

	List<TicketSummary> getTicketsSummary(Integer userId, Integer typeId);
}
