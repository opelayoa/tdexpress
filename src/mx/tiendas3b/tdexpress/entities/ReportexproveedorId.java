package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:16:53 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ReportexproveedorId generated by hbm2java
 */
@Embeddable
public class ReportexproveedorId implements java.io.Serializable {

	private String proveedor;
	private int ticket;
	private String lugar;
	private String asunto;
	private String accion;
	private Date fecha;

	public ReportexproveedorId() {
	}

	public ReportexproveedorId(String proveedor, int ticket, String lugar, String asunto, String accion, Date fecha) {
		this.proveedor = proveedor;
		this.ticket = ticket;
		this.lugar = lugar;
		this.asunto = asunto;
		this.accion = accion;
		this.fecha = fecha;
	}

	@Column(name = "proveedor", nullable = false)
	public String getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	@Column(name = "ticket", nullable = false)
	public int getTicket() {
		return this.ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

	@Column(name = "lugar", nullable = false, length = 25)
	public String getLugar() {
		return this.lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	@Column(name = "asunto", nullable = false)
	public String getAsunto() {
		return this.asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	@Column(name = "accion", nullable = false)
	public String getAccion() {
		return this.accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	@Column(name = "fecha", nullable = false, length = 19)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ReportexproveedorId))
			return false;
		ReportexproveedorId castOther = (ReportexproveedorId) other;

		return ((this.getProveedor() == castOther.getProveedor()) || (this.getProveedor() != null
				&& castOther.getProveedor() != null && this.getProveedor().equals(castOther.getProveedor())))
				&& (this.getTicket() == castOther.getTicket())
				&& ((this.getLugar() == castOther.getLugar()) || (this.getLugar() != null
						&& castOther.getLugar() != null && this.getLugar().equals(castOther.getLugar())))
				&& ((this.getAsunto() == castOther.getAsunto()) || (this.getAsunto() != null
						&& castOther.getAsunto() != null && this.getAsunto().equals(castOther.getAsunto())))
				&& ((this.getAccion() == castOther.getAccion()) || (this.getAccion() != null
						&& castOther.getAccion() != null && this.getAccion().equals(castOther.getAccion())))
				&& ((this.getFecha() == castOther.getFecha()) || (this.getFecha() != null
						&& castOther.getFecha() != null && this.getFecha().equals(castOther.getFecha())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getProveedor() == null ? 0 : this.getProveedor().hashCode());
		result = 37 * result + this.getTicket();
		result = 37 * result + (getLugar() == null ? 0 : this.getLugar().hashCode());
		result = 37 * result + (getAsunto() == null ? 0 : this.getAsunto().hashCode());
		result = 37 * result + (getAccion() == null ? 0 : this.getAccion().hashCode());
		result = 37 * result + (getFecha() == null ? 0 : this.getFecha().hashCode());
		return result;
	}

}
