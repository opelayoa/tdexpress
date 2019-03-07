package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:16:53 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Solicitante generated by hbm2java
 */
@Entity
@Table(name = "solicitante", catalog = "itaid")
public class Solicitante implements java.io.Serializable {

	private Integer id;
	private String apellido;
	private String nombre;
	private String email;
	private String celular;

	public Solicitante() {
	}

	public Solicitante(String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;
	}

	public Solicitante(String apellido, String nombre, String email, String celular) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.email = email;
		this.celular = celular;
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

	@Column(name = "apellido", nullable = false, length = 25)
	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Column(name = "nombre", nullable = false, length = 25)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "email", length = 25)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "celular", length = 10)
	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

}