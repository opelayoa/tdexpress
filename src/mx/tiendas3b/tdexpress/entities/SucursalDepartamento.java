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
 * SucursalDepartamento generated by hbm2java
 */
@Entity
@Table(name = "sucursal_departamento", catalog = "itaid")
public class SucursalDepartamento implements java.io.Serializable {

	private Integer id;
	private int sucursalId;
	private int departamentoId;
	private int usercreate;
	private Date fechacreate;
	private Integer usermod;
	private Date fechamod;
	private Integer userdel;
	private Date fechadel;
	private byte status;

	public SucursalDepartamento() {
	}

	public SucursalDepartamento(int sucursalId, int departamentoId, int usercreate, Date fechacreate, byte status) {
		this.sucursalId = sucursalId;
		this.departamentoId = departamentoId;
		this.usercreate = usercreate;
		this.fechacreate = fechacreate;
		this.status = status;
	}

	public SucursalDepartamento(int sucursalId, int departamentoId, int usercreate, Date fechacreate, Integer usermod,
			Date fechamod, Integer userdel, Date fechadel, byte status) {
		this.sucursalId = sucursalId;
		this.departamentoId = departamentoId;
		this.usercreate = usercreate;
		this.fechacreate = fechacreate;
		this.usermod = usermod;
		this.fechamod = fechamod;
		this.userdel = userdel;
		this.fechadel = fechadel;
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

	@Column(name = "sucursal_id", nullable = false)
	public int getSucursalId() {
		return this.sucursalId;
	}

	public void setSucursalId(int sucursalId) {
		this.sucursalId = sucursalId;
	}

	@Column(name = "departamento_id", nullable = false)
	public int getDepartamentoId() {
		return this.departamentoId;
	}

	public void setDepartamentoId(int departamentoId) {
		this.departamentoId = departamentoId;
	}

	@Column(name = "usercreate", nullable = false)
	public int getUsercreate() {
		return this.usercreate;
	}

	public void setUsercreate(int usercreate) {
		this.usercreate = usercreate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechacreate", nullable = false, length = 19)
	public Date getFechacreate() {
		return this.fechacreate;
	}

	public void setFechacreate(Date fechacreate) {
		this.fechacreate = fechacreate;
	}

	@Column(name = "usermod")
	public Integer getUsermod() {
		return this.usermod;
	}

	public void setUsermod(Integer usermod) {
		this.usermod = usermod;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechamod", length = 19)
	public Date getFechamod() {
		return this.fechamod;
	}

	public void setFechamod(Date fechamod) {
		this.fechamod = fechamod;
	}

	@Column(name = "userdel")
	public Integer getUserdel() {
		return this.userdel;
	}

	public void setUserdel(Integer userdel) {
		this.userdel = userdel;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechadel", length = 10)
	public Date getFechadel() {
		return this.fechadel;
	}

	public void setFechadel(Date fechadel) {
		this.fechadel = fechadel;
	}

	@Column(name = "status", nullable = false)
	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}
