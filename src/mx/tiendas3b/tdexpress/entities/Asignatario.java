package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:16:53 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Asignatario generated by hbm2java
 */
@Entity
@Table(name = "asignatario", catalog = "itaid")
public class Asignatario implements java.io.Serializable {

	private AsignatarioId id;

	public Asignatario() {
	}

	public Asignatario(AsignatarioId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id", length = 12)),
			@AttributeOverride(name = "nombre", column = @Column(name = "nombre")) })
	public AsignatarioId getId() {
		return this.id;
	}

	public void setId(AsignatarioId id) {
		this.id = id;
	}

}
