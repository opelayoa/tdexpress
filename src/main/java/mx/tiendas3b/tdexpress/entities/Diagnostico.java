package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Diagnostico generated by hbm2java
 */
@Entity
@Table(name = "diagnostico", catalog = "itaid")
public class Diagnostico implements java.io.Serializable {

	private Integer id;
	private int sintomaId;
	private String descripcion;
	private String status;

	public Diagnostico() {
	}

	public Diagnostico(int sintomaId, String descripcion, String status) {
		this.sintomaId = sintomaId;
		this.descripcion = descripcion;
		this.status = status;
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

	@Column(name = "sintoma_id", nullable = false)
	public int getSintomaId() {
		return this.sintomaId;
	}

	public void setSintomaId(int sintomaId) {
		this.sintomaId = sintomaId;
	}

	@Column(name = "descripcion", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "status", nullable = false, length = 8)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
