package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Apertura generated by hbm2java
 */
@Entity
@Table(name = "apertura", catalog = "itaid")
public class Apertura implements java.io.Serializable {

	private int id;
	private Date fechasolicitud;
	private Date fechaentrega;
	private byte estado;
	private int ticketId;

	public Apertura() {
	}

	public Apertura(int id, Date fechasolicitud, Date fechaentrega, byte estado, int ticketId) {
		this.id = id;
		this.fechasolicitud = fechasolicitud;
		this.fechaentrega = fechaentrega;
		this.estado = estado;
		this.ticketId = ticketId;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechasolicitud", nullable = false, length = 10)
	public Date getFechasolicitud() {
		return this.fechasolicitud;
	}

	public void setFechasolicitud(Date fechasolicitud) {
		this.fechasolicitud = fechasolicitud;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechaentrega", nullable = false, length = 10)
	public Date getFechaentrega() {
		return this.fechaentrega;
	}

	public void setFechaentrega(Date fechaentrega) {
		this.fechaentrega = fechaentrega;
	}

	@Column(name = "estado", nullable = false)
	public byte getEstado() {
		return this.estado;
	}

	public void setEstado(byte estado) {
		this.estado = estado;
	}

	@Column(name = "ticket_id", nullable = false)
	public int getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

}
