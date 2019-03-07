package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Reportexdia generated by hbm2java
 */
@Entity
@Table(name = "reportexdia", catalog = "itaid")
public class Reportexdia implements java.io.Serializable {

	private ReportexdiaId id;

	public Reportexdia() {
	}

	public Reportexdia(ReportexdiaId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "fecha", column = @Column(name = "fecha", length = 10)),
			@AttributeOverride(name = "problema", column = @Column(name = "problema", nullable = false)),
			@AttributeOverride(name = "origen", column = @Column(name = "origen", nullable = false, length = 25)),
			@AttributeOverride(name = "solucion", column = @Column(name = "solucion", nullable = false)),
			@AttributeOverride(name = "categoria", column = @Column(name = "categoria", nullable = false, length = 14)),
			@AttributeOverride(name = "cantidad", column = @Column(name = "cantidad", nullable = false)) })
	public ReportexdiaId getId() {
		return this.id;
	}

	public void setId(ReportexdiaId id) {
		this.id = id;
	}

}