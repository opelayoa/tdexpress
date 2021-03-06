package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * GastosCuentacont generated by hbm2java
 */
@Entity
@Table(name = "gastos_cuentacont", catalog = "itaid")
public class GastosCuentacont implements java.io.Serializable {

	private int id;
	private String numero;
	private String descripcion;

	public GastosCuentacont() {
	}

	public GastosCuentacont(int id, String numero) {
		this.id = id;
		this.numero = numero;
	}

	public GastosCuentacont(int id, String numero, String descripcion) {
		this.id = id;
		this.numero = numero;
		this.descripcion = descripcion;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "numero", nullable = false, length = 15)
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Column(name = "descripcion")
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
