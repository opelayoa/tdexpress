package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Solucionestandard generated by hbm2java
 */
@Entity
@Table(name = "solucionestandard", catalog = "itaid")
public class SolucionesStandard implements java.io.Serializable {

	private Integer id;
	private String nombre;
	private String descripcion;
	private int categoriaId;

	public SolucionesStandard() {
	}

	public SolucionesStandard(String nombre, String descripcion, int categoriaId) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoriaId = categoriaId;
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

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "categoria_id", nullable = false)
	public int getCategoriaId() {
		return this.categoriaId;
	}

	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
	}

}
