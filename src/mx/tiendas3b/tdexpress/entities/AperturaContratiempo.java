package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:16:53 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AperturaContratiempo generated by hbm2java
 */
@Entity
@Table(name = "apertura_contratiempo", catalog = "itaid")
public class AperturaContratiempo implements java.io.Serializable {

	private int id;
	private String descripcion;
	private Date fecha;
	private int aperturaId;

	public AperturaContratiempo() {
	}

	public AperturaContratiempo(int id, String descripcion, Date fecha, int aperturaId) {
		this.id = id;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.aperturaId = aperturaId;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "descripcion", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", nullable = false, length = 19)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "apertura_id", nullable = false)
	public int getAperturaId() {
		return this.aperturaId;
	}

	public void setAperturaId(int aperturaId) {
		this.aperturaId = aperturaId;
	}

}
