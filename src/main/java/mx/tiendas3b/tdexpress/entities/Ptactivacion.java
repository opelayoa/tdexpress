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
 * Ptactivacion generated by hbm2java
 */
@Entity
@Table(name = "ptactivacion", catalog = "itaid")
public class Ptactivacion implements java.io.Serializable {

	private Integer id;
	private int sucursalId;
	private int pos;
	private String registro;
	private String activacion;
	private String llave;
	private byte status;
	private Date fecha;
	private String solicitud;

	public Ptactivacion() {
	}

	public Ptactivacion(int sucursalId, int pos, String registro, byte status, Date fecha) {
		this.sucursalId = sucursalId;
		this.pos = pos;
		this.registro = registro;
		this.status = status;
		this.fecha = fecha;
	}

	public Ptactivacion(int sucursalId, int pos, String registro, String activacion, String llave, byte status,
			Date fecha, String solicitud) {
		this.sucursalId = sucursalId;
		this.pos = pos;
		this.registro = registro;
		this.activacion = activacion;
		this.llave = llave;
		this.status = status;
		this.fecha = fecha;
		this.solicitud = solicitud;
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

	@Column(name = "sucursal_id", nullable = false)
	public int getSucursalId() {
		return this.sucursalId;
	}

	public void setSucursalId(int sucursalId) {
		this.sucursalId = sucursalId;
	}

	@Column(name = "pos", nullable = false)
	public int getPos() {
		return this.pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	@Column(name = "registro", nullable = false, length = 16)
	public String getRegistro() {
		return this.registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	@Column(name = "activacion", length = 16)
	public String getActivacion() {
		return this.activacion;
	}

	public void setActivacion(String activacion) {
		this.activacion = activacion;
	}

	@Column(name = "llave")
	public String getLlave() {
		return this.llave;
	}

	public void setLlave(String llave) {
		this.llave = llave;
	}

	@Column(name = "status", nullable = false)
	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", nullable = false, length = 19)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "solicitud", length = 100)
	public String getSolicitud() {
		return this.solicitud;
	}

	public void setSolicitud(String solicitud) {
		this.solicitud = solicitud;
	}

}
