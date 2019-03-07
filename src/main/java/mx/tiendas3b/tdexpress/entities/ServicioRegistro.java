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
 * ServicioRegistro generated by hbm2java
 */
@Entity
@Table(name = "servicio_registro", catalog = "itaid")
public class ServicioRegistro implements java.io.Serializable {

	private Integer id;
	private Integer ticketId;
	private String nombre;
	private int region;
	private String puesto;
	private String area;
	private String tipoServicio;
	private int usuarioup;
	private Date fechaup;
	private int usuariocharge;
	private Date fechacharge;
	private int usuariovobo;
	private Date fechavobo;
	private String observaciones;
	private byte status;

	public ServicioRegistro() {
	}

	public ServicioRegistro(String nombre, int region, String puesto, String area, String tipoServicio, int usuarioup,
			Date fechaup, int usuariocharge, Date fechacharge, int usuariovobo, Date fechavobo, String observaciones,
			byte status) {
		this.nombre = nombre;
		this.region = region;
		this.puesto = puesto;
		this.area = area;
		this.tipoServicio = tipoServicio;
		this.usuarioup = usuarioup;
		this.fechaup = fechaup;
		this.usuariocharge = usuariocharge;
		this.fechacharge = fechacharge;
		this.usuariovobo = usuariovobo;
		this.fechavobo = fechavobo;
		this.observaciones = observaciones;
		this.status = status;
	}

	public ServicioRegistro(Integer ticketId, String nombre, int region, String puesto, String area,
			String tipoServicio, int usuarioup, Date fechaup, int usuariocharge, Date fechacharge, int usuariovobo,
			Date fechavobo, String observaciones, byte status) {
		this.ticketId = ticketId;
		this.nombre = nombre;
		this.region = region;
		this.puesto = puesto;
		this.area = area;
		this.tipoServicio = tipoServicio;
		this.usuarioup = usuarioup;
		this.fechaup = fechaup;
		this.usuariocharge = usuariocharge;
		this.fechacharge = fechacharge;
		this.usuariovobo = usuariovobo;
		this.fechavobo = fechavobo;
		this.observaciones = observaciones;
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

	@Column(name = "ticket_id")
	public Integer getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	@Column(name = "nombre", nullable = false, length = 65535)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "region", nullable = false)
	public int getRegion() {
		return this.region;
	}

	public void setRegion(int region) {
		this.region = region;
	}

	@Column(name = "puesto", nullable = false)
	public String getPuesto() {
		return this.puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Column(name = "area", nullable = false)
	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "tipo_servicio", nullable = false)
	public String getTipoServicio() {
		return this.tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	@Column(name = "usuarioup", nullable = false)
	public int getUsuarioup() {
		return this.usuarioup;
	}

	public void setUsuarioup(int usuarioup) {
		this.usuarioup = usuarioup;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaup", nullable = false, length = 19)
	public Date getFechaup() {
		return this.fechaup;
	}

	public void setFechaup(Date fechaup) {
		this.fechaup = fechaup;
	}

	@Column(name = "usuariocharge", nullable = false)
	public int getUsuariocharge() {
		return this.usuariocharge;
	}

	public void setUsuariocharge(int usuariocharge) {
		this.usuariocharge = usuariocharge;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechacharge", nullable = false, length = 19)
	public Date getFechacharge() {
		return this.fechacharge;
	}

	public void setFechacharge(Date fechacharge) {
		this.fechacharge = fechacharge;
	}

	@Column(name = "usuariovobo", nullable = false)
	public int getUsuariovobo() {
		return this.usuariovobo;
	}

	public void setUsuariovobo(int usuariovobo) {
		this.usuariovobo = usuariovobo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechavobo", nullable = false, length = 19)
	public Date getFechavobo() {
		return this.fechavobo;
	}

	public void setFechavobo(Date fechavobo) {
		this.fechavobo = fechavobo;
	}

	@Column(name = "observaciones", nullable = false, length = 65535)
	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Column(name = "status", nullable = false)
	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}