package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Reportexsucursal generated by hbm2java
 */
@Entity
@Table(name = "reportexsucursal", catalog = "itaid")
public class Reportexsucursal implements java.io.Serializable {

	private ReportexsucursalId id;

	public Reportexsucursal() {
	}

	public Reportexsucursal(ReportexsucursalId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "tickets", column = @Column(name = "tickets", nullable = false)),
			@AttributeOverride(name = "numero3b", column = @Column(name = "numero3b", nullable = false, length = 4)),
			@AttributeOverride(name = "nombre", column = @Column(name = "nombre", nullable = false, length = 25)),
			@AttributeOverride(name = "ultimoticket", column = @Column(name = "ultimoticket", length = 19)) })
	public ReportexsucursalId getId() {
		return this.id;
	}

	public void setId(ReportexsucursalId id) {
		this.id = id;
	}

}
