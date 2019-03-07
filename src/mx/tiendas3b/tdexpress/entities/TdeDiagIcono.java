package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:16:53 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TdeDiagIcono generated by hbm2java
 */
@Entity
@Table(name = "tde_diag_icono", catalog = "itaid")
public class TdeDiagIcono implements java.io.Serializable {

	private Integer id;
	private String descripcion;
	private String icono;

	public TdeDiagIcono() {
	}

	public TdeDiagIcono(String descripcion, String icono) {
		this.descripcion = descripcion;
		this.icono = icono;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "descripcion", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "icono", nullable = false, length = 100)
	public String getIcono() {
		return this.icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

}
