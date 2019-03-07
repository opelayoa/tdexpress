package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ReportexdiaBkpId generated by hbm2java
 */
@Embeddable
public class ReportexdiaBkpId implements java.io.Serializable {

	private Date fecha;
	private String problema;
	private String origen;
	private String solucion;
	private long cantidad;

	public ReportexdiaBkpId() {
	}

	public ReportexdiaBkpId(String problema, String origen, String solucion, long cantidad) {
		this.problema = problema;
		this.origen = origen;
		this.solucion = solucion;
		this.cantidad = cantidad;
	}

	public ReportexdiaBkpId(Date fecha, String problema, String origen, String solucion, long cantidad) {
		this.fecha = fecha;
		this.problema = problema;
		this.origen = origen;
		this.solucion = solucion;
		this.cantidad = cantidad;
	}

	@Column(name = "Fecha", length = 10)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "Problema", nullable = false)
	public String getProblema() {
		return this.problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	@Column(name = "Origen", nullable = false, length = 25)
	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Column(name = "Solucion", nullable = false)
	public String getSolucion() {
		return this.solucion;
	}

	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}

	@Column(name = "Cantidad", nullable = false)
	public long getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ReportexdiaBkpId))
			return false;
		ReportexdiaBkpId castOther = (ReportexdiaBkpId) other;

		return ((this.getFecha() == castOther.getFecha()) || (this.getFecha() != null && castOther.getFecha() != null
				&& this.getFecha().equals(castOther.getFecha())))
				&& ((this.getProblema() == castOther.getProblema()) || (this.getProblema() != null
						&& castOther.getProblema() != null && this.getProblema().equals(castOther.getProblema())))
				&& ((this.getOrigen() == castOther.getOrigen()) || (this.getOrigen() != null
						&& castOther.getOrigen() != null && this.getOrigen().equals(castOther.getOrigen())))
				&& ((this.getSolucion() == castOther.getSolucion()) || (this.getSolucion() != null
						&& castOther.getSolucion() != null && this.getSolucion().equals(castOther.getSolucion())))
				&& (this.getCantidad() == castOther.getCantidad());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getFecha() == null ? 0 : this.getFecha().hashCode());
		result = 37 * result + (getProblema() == null ? 0 : this.getProblema().hashCode());
		result = 37 * result + (getOrigen() == null ? 0 : this.getOrigen().hashCode());
		result = 37 * result + (getSolucion() == null ? 0 : this.getSolucion().hashCode());
		result = 37 * result + (int) this.getCantidad();
		return result;
	}

}