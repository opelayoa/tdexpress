package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ActivoMarca generated by hbm2java
 */
@Entity
@Table(name = "activo_marca", catalog = "itaid")
public class ActivoMarca implements java.io.Serializable {

	private Integer id;
	private String marca;
	private Boolean status;

	public ActivoMarca() {
	}

	public ActivoMarca(String marca) {
		this.marca = marca;
	}

	public ActivoMarca(String marca, Boolean status) {
		this.marca = marca;
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

	@Column(name = "marca", nullable = false, length = 25)
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Column(name = "status")
	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
