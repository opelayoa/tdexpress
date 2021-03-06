package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:16:53 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Reportelineascel generated by hbm2java
 */
@Entity
@Table(name = "reportelineascel", catalog = "itaid")
public class Reportelineascel implements java.io.Serializable {

	private Integer id;
	private String serie;
	private String cuenta;

	public Reportelineascel() {
	}

	public Reportelineascel(String serie, String cuenta) {
		this.serie = serie;
		this.cuenta = cuenta;
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

	@Column(name = "serie", length = 65535)
	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	@Column(name = "cuenta", length = 65535)
	public String getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

}
