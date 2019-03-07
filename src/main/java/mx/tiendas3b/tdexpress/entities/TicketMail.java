package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TicketMail generated by hbm2java
 */
@Entity
@Table(name = "ticket_mail", catalog = "itaid")
public class TicketMail implements java.io.Serializable {

	private Integer id;
	private int ticketId;
	private String para;
	private String asunto;
	private String mensaje;
	private Date fecha;
	private Date fechaEnvio;
	private boolean status;

	public TicketMail() {
	}

	public TicketMail(int ticketId, String para, String asunto, String mensaje, Date fecha, Date fechaEnvio,
			boolean status) {
		this.ticketId = ticketId;
		this.para = para;
		this.asunto = asunto;
		this.mensaje = mensaje;
		this.fecha = fecha;
		this.fechaEnvio = fechaEnvio;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "ticket_id", nullable = false)
	public int getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	@Column(name = "para", nullable = false, length = 65535)
	public String getPara() {
		return this.para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	@Column(name = "asunto", nullable = false, length = 65535)
	public String getAsunto() {
		return this.asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	@Column(name = "mensaje", nullable = false, length = 65535)
	public String getMensaje() {
		return this.mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", nullable = false, length = 19)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_envio", nullable = false, length = 19)
	public Date getFechaEnvio() {
		return this.fechaEnvio;
	}

	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}