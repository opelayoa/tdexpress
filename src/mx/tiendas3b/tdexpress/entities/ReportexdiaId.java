package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:16:53 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ReportexdiaId generated by hbm2java
 */
@Embeddable
public class ReportexdiaId implements java.io.Serializable {

	private Date fecha;
	private String problema;
	private String origen;
	private String solucion;
	private String categoria;
	private long cantidad;

	public ReportexdiaId() {
	}

	public ReportexdiaId(String problema, String origen, String solucion, String categoria, long cantidad) {
		this.problema = problema;
		this.origen = origen;
		this.solucion = solucion;
		this.categoria = categoria;
		this.cantidad = cantidad;
	}

	public ReportexdiaId(Date fecha, String problema, String origen, String solucion, String categoria, long cantidad) {
		this.fecha = fecha;
		this.problema = problema;
		this.origen = origen;
		this.solucion = solucion;
		this.categoria = categoria;
		this.cantidad = cantidad;
	}

	@Column(name = "fecha", length = 10)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "problema", nullable = false)
	public String getProblema() {
		return this.problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	@Column(name = "origen", nullable = false, length = 25)
	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Column(name = "solucion", nullable = false)
	public String getSolucion() {
		return this.solucion;
	}

	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}

	@Column(name = "categoria", nullable = false, length = 14)
	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Column(name = "cantidad", nullable = false)
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
		if (!(other instanceof ReportexdiaId))
			return false;
		ReportexdiaId castOther = (ReportexdiaId) other;

		return ((this.getFecha() == castOther.getFecha()) || (this.getFecha() != null && castOther.getFecha() != null
				&& this.getFecha().equals(castOther.getFecha())))
				&& ((this.getProblema() == castOther.getProblema()) || (this.getProblema() != null
						&& castOther.getProblema() != null && this.getProblema().equals(castOther.getProblema())))
				&& ((this.getOrigen() == castOther.getOrigen()) || (this.getOrigen() != null
						&& castOther.getOrigen() != null && this.getOrigen().equals(castOther.getOrigen())))
				&& ((this.getSolucion() == castOther.getSolucion()) || (this.getSolucion() != null
						&& castOther.getSolucion() != null && this.getSolucion().equals(castOther.getSolucion())))
				&& ((this.getCategoria() == castOther.getCategoria()) || (this.getCategoria() != null
						&& castOther.getCategoria() != null && this.getCategoria().equals(castOther.getCategoria())))
				&& (this.getCantidad() == castOther.getCantidad());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getFecha() == null ? 0 : this.getFecha().hashCode());
		result = 37 * result + (getProblema() == null ? 0 : this.getProblema().hashCode());
		result = 37 * result + (getOrigen() == null ? 0 : this.getOrigen().hashCode());
		result = 37 * result + (getSolucion() == null ? 0 : this.getSolucion().hashCode());
		result = 37 * result + (getCategoria() == null ? 0 : this.getCategoria().hashCode());
		result = 37 * result + (int) this.getCantidad();
		return result;
	}

}
