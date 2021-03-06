package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Table6 generated by hbm2java
 */
@Entity
@Table(name = "table 6", catalog = "itaid")
public class Table6 implements java.io.Serializable {

	private Table6Id id;

	public Table6() {
	}

	public Table6(Table6Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idCategoria", column = @Column(name = "Id Categoria")),
			@AttributeOverride(name = "categoria", column = @Column(name = "Categoria", length = 11)),
			@AttributeOverride(name = "idModelo", column = @Column(name = "Id Modelo", length = 3)),
			@AttributeOverride(name = "modelo", column = @Column(name = "Modelo", length = 15)),
			@AttributeOverride(name = "marca", column = @Column(name = "Marca", length = 7)),
			@AttributeOverride(name = "serie", column = @Column(name = "Serie", length = 21)),
			@AttributeOverride(name = "tagCpu", column = @Column(name = "Tag CPU", length = 7)),
			@AttributeOverride(name = "usuario", column = @Column(name = "Usuario", length = 39)),
			@AttributeOverride(name = "departamento", column = @Column(name = "Departamento", length = 16)),
			@AttributeOverride(name = "usuarioId", column = @Column(name = "usuario_id", length = 8)) })
	public Table6Id getId() {
		return this.id;
	}

	public void setId(Table6Id id) {
		this.id = id;
	}

}
