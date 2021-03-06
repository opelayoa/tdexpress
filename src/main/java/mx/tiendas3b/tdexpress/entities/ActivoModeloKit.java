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
 * ActivoModeloKit generated by hbm2java
 */
@Entity
@Table(name = "activo_modelo_kit", catalog = "itaid")
public class ActivoModeloKit implements java.io.Serializable {

	private Integer id;
	private int activomodeloId;
	private int acId;
	private Date fecha;
	private boolean status;

	public ActivoModeloKit() {
	}

	public ActivoModeloKit(int activomodeloId, int acId, Date fecha, boolean status) {
		this.activomodeloId = activomodeloId;
		this.acId = acId;
		this.fecha = fecha;
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

	@Column(name = "activomodelo_id", nullable = false)
	public int getActivomodeloId() {
		return this.activomodeloId;
	}

	public void setActivomodeloId(int activomodeloId) {
		this.activomodeloId = activomodeloId;
	}

	@Column(name = "ac_id", nullable = false)
	public int getAcId() {
		return this.acId;
	}

	public void setAcId(int acId) {
		this.acId = acId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", nullable = false, length = 19)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
