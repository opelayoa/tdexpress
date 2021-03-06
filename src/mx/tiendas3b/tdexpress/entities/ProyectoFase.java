package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:16:53 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ProyectoFase generated by hbm2java
 */
@Entity
@Table(name = "proyecto_fase", catalog = "itaid")
public class ProyectoFase implements java.io.Serializable {

	private int id;
	private String nombre;
	private int proyectoId;

	public ProyectoFase() {
	}

	public ProyectoFase(int id, String nombre, int proyectoId) {
		this.id = id;
		this.nombre = nombre;
		this.proyectoId = proyectoId;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "nombre", nullable = false, length = 30)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "proyecto_id", nullable = false)
	public int getProyectoId() {
		return this.proyectoId;
	}

	public void setProyectoId(int proyectoId) {
		this.proyectoId = proyectoId;
	}

}
