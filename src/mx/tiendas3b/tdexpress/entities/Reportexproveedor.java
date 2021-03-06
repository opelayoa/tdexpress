package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:16:53 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Reportexproveedor generated by hbm2java
 */
@Entity
@Table(name = "reportexproveedor", catalog = "itaid")
public class Reportexproveedor implements java.io.Serializable {

	private ReportexproveedorId id;

	public Reportexproveedor() {
	}

	public Reportexproveedor(ReportexproveedorId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "proveedor", column = @Column(name = "proveedor", nullable = false)),
			@AttributeOverride(name = "ticket", column = @Column(name = "ticket", nullable = false)),
			@AttributeOverride(name = "lugar", column = @Column(name = "lugar", nullable = false, length = 25)),
			@AttributeOverride(name = "asunto", column = @Column(name = "asunto", nullable = false)),
			@AttributeOverride(name = "accion", column = @Column(name = "accion", nullable = false)),
			@AttributeOverride(name = "fecha", column = @Column(name = "fecha", nullable = false, length = 19)) })
	public ReportexproveedorId getId() {
		return this.id;
	}

	public void setId(ReportexproveedorId id) {
		this.id = id;
	}

}
