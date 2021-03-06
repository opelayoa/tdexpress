package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:16:53 AM by Hibernate Tools 4.3.5.Final

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
 * TrackingActivos generated by hbm2java
 */
@Entity
@Table(name = "tracking_activos", catalog = "itaid")
public class TrackingActivos implements java.io.Serializable {

	private Integer id;
	private int userid;
	private int activoId;
	private int activoestadoId;
	private String asignatarioId;
	private Date fechaasignacion;
	private String observaciones;
	private Integer ticket;
	private Integer zonaId;
	private Integer distritoId;

	public TrackingActivos() {
	}

	public TrackingActivos(int userid, int activoId, int activoestadoId, String asignatarioId, Date fechaasignacion,
			String observaciones) {
		this.userid = userid;
		this.activoId = activoId;
		this.activoestadoId = activoestadoId;
		this.asignatarioId = asignatarioId;
		this.fechaasignacion = fechaasignacion;
		this.observaciones = observaciones;
	}

	public TrackingActivos(int userid, int activoId, int activoestadoId, String asignatarioId, Date fechaasignacion,
			String observaciones, Integer ticket, Integer zonaId, Integer distritoId) {
		this.userid = userid;
		this.activoId = activoId;
		this.activoestadoId = activoestadoId;
		this.asignatarioId = asignatarioId;
		this.fechaasignacion = fechaasignacion;
		this.observaciones = observaciones;
		this.ticket = ticket;
		this.zonaId = zonaId;
		this.distritoId = distritoId;
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

	@Column(name = "userid", nullable = false)
	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Column(name = "activo_id", nullable = false)
	public int getActivoId() {
		return this.activoId;
	}

	public void setActivoId(int activoId) {
		this.activoId = activoId;
	}

	@Column(name = "activoestado_id", nullable = false)
	public int getActivoestadoId() {
		return this.activoestadoId;
	}

	public void setActivoestadoId(int activoestadoId) {
		this.activoestadoId = activoestadoId;
	}

	@Column(name = "asignatario_id", nullable = false, length = 5)
	public String getAsignatarioId() {
		return this.asignatarioId;
	}

	public void setAsignatarioId(String asignatarioId) {
		this.asignatarioId = asignatarioId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaasignacion", nullable = false, length = 19)
	public Date getFechaasignacion() {
		return this.fechaasignacion;
	}

	public void setFechaasignacion(Date fechaasignacion) {
		this.fechaasignacion = fechaasignacion;
	}

	@Column(name = "observaciones", nullable = false, length = 65535)
	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Column(name = "ticket")
	public Integer getTicket() {
		return this.ticket;
	}

	public void setTicket(Integer ticket) {
		this.ticket = ticket;
	}

	@Column(name = "zona_id")
	public Integer getZonaId() {
		return this.zonaId;
	}

	public void setZonaId(Integer zonaId) {
		this.zonaId = zonaId;
	}

	@Column(name = "distrito_id")
	public Integer getDistritoId() {
		return this.distritoId;
	}

	public void setDistritoId(Integer distritoId) {
		this.distritoId = distritoId;
	}

}
