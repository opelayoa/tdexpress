package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EprojectAcciones generated by hbm2java
 */
@Entity
@Table(name = "eproject_acciones", catalog = "itaid")
public class EprojectAcciones implements java.io.Serializable {

	private Integer id;
	private int acproyectoId;
	private Date acfecha;
	private String acdescripcion;
	private int acestatus;

	public EprojectAcciones() {
	}

	public EprojectAcciones(int acproyectoId, Date acfecha, String acdescripcion, int acestatus) {
		this.acproyectoId = acproyectoId;
		this.acfecha = acfecha;
		this.acdescripcion = acdescripcion;
		this.acestatus = acestatus;
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

	@Column(name = "acproyecto_id", nullable = false)
	public int getAcproyectoId() {
		return this.acproyectoId;
	}

	public void setAcproyectoId(int acproyectoId) {
		this.acproyectoId = acproyectoId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "acfecha", nullable = false, length = 19)
	public Date getAcfecha() {
		return this.acfecha;
	}

	public void setAcfecha(Date acfecha) {
		this.acfecha = acfecha;
	}

	@Column(name = "acdescripcion", nullable = false, length = 65535)
	public String getAcdescripcion() {
		return this.acdescripcion;
	}

	public void setAcdescripcion(String acdescripcion) {
		this.acdescripcion = acdescripcion;
	}

	@Column(name = "acestatus", nullable = false)
	public int getAcestatus() {
		return this.acestatus;
	}

	public void setAcestatus(int acestatus) {
		this.acestatus = acestatus;
	}

}
