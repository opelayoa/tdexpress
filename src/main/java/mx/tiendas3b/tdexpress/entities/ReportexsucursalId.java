package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ReportexsucursalId generated by hbm2java
 */
@Embeddable
public class ReportexsucursalId implements java.io.Serializable {

	private long tickets;
	private String numero3b;
	private String nombre;
	private Date ultimoticket;

	public ReportexsucursalId() {
	}

	public ReportexsucursalId(long tickets, String numero3b, String nombre) {
		this.tickets = tickets;
		this.numero3b = numero3b;
		this.nombre = nombre;
	}

	public ReportexsucursalId(long tickets, String numero3b, String nombre, Date ultimoticket) {
		this.tickets = tickets;
		this.numero3b = numero3b;
		this.nombre = nombre;
		this.ultimoticket = ultimoticket;
	}

	@Column(name = "tickets", nullable = false)
	public long getTickets() {
		return this.tickets;
	}

	public void setTickets(long tickets) {
		this.tickets = tickets;
	}

	@Column(name = "numero3b", nullable = false, length = 4)
	public String getNumero3b() {
		return this.numero3b;
	}

	public void setNumero3b(String numero3b) {
		this.numero3b = numero3b;
	}

	@Column(name = "nombre", nullable = false, length = 25)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "ultimoticket", length = 19)
	public Date getUltimoticket() {
		return this.ultimoticket;
	}

	public void setUltimoticket(Date ultimoticket) {
		this.ultimoticket = ultimoticket;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ReportexsucursalId))
			return false;
		ReportexsucursalId castOther = (ReportexsucursalId) other;

		return (this.getTickets() == castOther.getTickets())
				&& ((this.getNumero3b() == castOther.getNumero3b()) || (this.getNumero3b() != null
						&& castOther.getNumero3b() != null && this.getNumero3b().equals(castOther.getNumero3b())))
				&& ((this.getNombre() == castOther.getNombre()) || (this.getNombre() != null
						&& castOther.getNombre() != null && this.getNombre().equals(castOther.getNombre())))
				&& ((this.getUltimoticket() == castOther.getUltimoticket())
						|| (this.getUltimoticket() != null && castOther.getUltimoticket() != null
								&& this.getUltimoticket().equals(castOther.getUltimoticket())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getTickets();
		result = 37 * result + (getNumero3b() == null ? 0 : this.getNumero3b().hashCode());
		result = 37 * result + (getNombre() == null ? 0 : this.getNombre().hashCode());
		result = 37 * result + (getUltimoticket() == null ? 0 : this.getUltimoticket().hashCode());
		return result;
	}

}
