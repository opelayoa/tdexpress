package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AsignatarioId generated by hbm2java
 */
@Embeddable
public class AsignatarioId implements java.io.Serializable {

	private String id;
	private String nombre;

	public AsignatarioId() {
	}

	public AsignatarioId(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	@Column(name = "id", length = 12)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AsignatarioId))
			return false;
		AsignatarioId castOther = (AsignatarioId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getNombre() == castOther.getNombre()) || (this.getNombre() != null
						&& castOther.getNombre() != null && this.getNombre().equals(castOther.getNombre())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getNombre() == null ? 0 : this.getNombre().hashCode());
		return result;
	}

}
