package mx.tiendas3b.tdexpress.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "icon", catalog = "itaid")
public class Icon implements java.io.Serializable {

	private int id;
	private String nombre;
	private String unicode;

	public Icon() {
	}

	public Icon(int id, String nombre, String unicode) {
		this.id = id;
		this.nombre = nombre;
		this.unicode = unicode;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "nombre", nullable = false, length = 100)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "unicode", nullable = false, length = 100)
	public String getUnicode() {
		return unicode;
	}

	public void setUnicode(String unicode) {
		this.unicode = unicode;
	}

}
