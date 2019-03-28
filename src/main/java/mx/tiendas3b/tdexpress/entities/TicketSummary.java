package mx.tiendas3b.tdexpress.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

@NamedNativeQuery(name = "TicketSummary.getTicketsSummary", query = "select id, leyenda\r\n" + 
		"from ticket \r\n" + 
		"where ticket.solicitante_id = ?1\r\n" + 
		"  and ticket.estado_id = ?2", resultClass = TicketSummary.class)
@Entity
public class TicketSummary {
	@Id
	private Integer id;
	private String leyenda;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLeyenda() {
		return leyenda;
	}

	public void setLeyenda(String leyenda) {
		this.leyenda = leyenda;
	}

}
