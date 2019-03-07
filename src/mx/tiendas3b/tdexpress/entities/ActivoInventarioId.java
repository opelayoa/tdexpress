package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:16:53 AM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ActivoInventarioId generated by hbm2java
 */
@Embeddable
public class ActivoInventarioId implements java.io.Serializable {

	private int id;
	private String activo;
	private String serie;
	private String tag;
	private BigDecimal costo;
	private String nombre;
	private String asignado;

	public ActivoInventarioId() {
	}

	public ActivoInventarioId(int id, BigDecimal costo, String nombre) {
		this.id = id;
		this.costo = costo;
		this.nombre = nombre;
	}

	public ActivoInventarioId(int id, String activo, String serie, String tag, BigDecimal costo, String nombre,
			String asignado) {
		this.id = id;
		this.activo = activo;
		this.serie = serie;
		this.tag = tag;
		this.costo = costo;
		this.nombre = nombre;
		this.asignado = asignado;
	}

	@Column(name = "id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "activo", length = 70)
	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	@Column(name = "serie", length = 24)
	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	@Column(name = "tag", length = 20)
	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Column(name = "costo", nullable = false, precision = 7)
	public BigDecimal getCosto() {
		return this.costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	@Column(name = "nombre", nullable = false, length = 25)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "asignado", length = 51)
	public String getAsignado() {
		return this.asignado;
	}

	public void setAsignado(String asignado) {
		this.asignado = asignado;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ActivoInventarioId))
			return false;
		ActivoInventarioId castOther = (ActivoInventarioId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getActivo() == castOther.getActivo()) || (this.getActivo() != null
						&& castOther.getActivo() != null && this.getActivo().equals(castOther.getActivo())))
				&& ((this.getSerie() == castOther.getSerie()) || (this.getSerie() != null
						&& castOther.getSerie() != null && this.getSerie().equals(castOther.getSerie())))
				&& ((this.getTag() == castOther.getTag()) || (this.getTag() != null && castOther.getTag() != null
						&& this.getTag().equals(castOther.getTag())))
				&& ((this.getCosto() == castOther.getCosto()) || (this.getCosto() != null
						&& castOther.getCosto() != null && this.getCosto().equals(castOther.getCosto())))
				&& ((this.getNombre() == castOther.getNombre()) || (this.getNombre() != null
						&& castOther.getNombre() != null && this.getNombre().equals(castOther.getNombre())))
				&& ((this.getAsignado() == castOther.getAsignado()) || (this.getAsignado() != null
						&& castOther.getAsignado() != null && this.getAsignado().equals(castOther.getAsignado())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getActivo() == null ? 0 : this.getActivo().hashCode());
		result = 37 * result + (getSerie() == null ? 0 : this.getSerie().hashCode());
		result = 37 * result + (getTag() == null ? 0 : this.getTag().hashCode());
		result = 37 * result + (getCosto() == null ? 0 : this.getCosto().hashCode());
		result = 37 * result + (getNombre() == null ? 0 : this.getNombre().hashCode());
		result = 37 * result + (getAsignado() == null ? 0 : this.getAsignado().hashCode());
		return result;
	}

}
