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
 * ApEqapRegistro generated by hbm2java
 */
@Entity
@Table(name = "ap_eqap_registro", catalog = "itaid")
public class ApEqapRegistro implements java.io.Serializable {

	private Integer id;
	private int equipoId;
	private int apId;
	private int usuarioup;
	private Date fechaup;
	private int usuariocharge;
	private Date fechacharge;
	private int usuariovobo;
	private Date fechavobo;
	private byte status;

	public ApEqapRegistro() {
	}

	public ApEqapRegistro(int equipoId, int apId, int usuarioup, Date fechaup, int usuariocharge, Date fechacharge,
			int usuariovobo, Date fechavobo, byte status) {
		this.equipoId = equipoId;
		this.apId = apId;
		this.usuarioup = usuarioup;
		this.fechaup = fechaup;
		this.usuariocharge = usuariocharge;
		this.fechacharge = fechacharge;
		this.usuariovobo = usuariovobo;
		this.fechavobo = fechavobo;
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

	@Column(name = "equipo_id", nullable = false)
	public int getEquipoId() {
		return this.equipoId;
	}

	public void setEquipoId(int equipoId) {
		this.equipoId = equipoId;
	}

	@Column(name = "ap_id", nullable = false)
	public int getApId() {
		return this.apId;
	}

	public void setApId(int apId) {
		this.apId = apId;
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

	@Column(name = "status", nullable = false)
	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}
