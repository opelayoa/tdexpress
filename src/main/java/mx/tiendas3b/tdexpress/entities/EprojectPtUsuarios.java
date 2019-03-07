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
 * EprojectPtUsuarios generated by hbm2java
 */
@Entity
@Table(name = "eproject_pt_usuarios", catalog = "itaid")
public class EprojectPtUsuarios implements java.io.Serializable {

	private Integer id;
	private int ptuptId;
	private int ptuuserId;
	private int usercreate;
	private Date fechacreate;
	private Integer usermod;
	private Date fechamod;
	private Integer userdel;
	private Date fechadel;
	private int status;

	public EprojectPtUsuarios() {
	}

	public EprojectPtUsuarios(int ptuptId, int ptuuserId, int usercreate, Date fechacreate, int status) {
		this.ptuptId = ptuptId;
		this.ptuuserId = ptuuserId;
		this.usercreate = usercreate;
		this.fechacreate = fechacreate;
		this.status = status;
	}

	public EprojectPtUsuarios(int ptuptId, int ptuuserId, int usercreate, Date fechacreate, Integer usermod,
			Date fechamod, Integer userdel, Date fechadel, int status) {
		this.ptuptId = ptuptId;
		this.ptuuserId = ptuuserId;
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

	@Column(name = "ptupt_id", nullable = false)
	public int getPtuptId() {
		return this.ptuptId;
	}

	public void setPtuptId(int ptuptId) {
		this.ptuptId = ptuptId;
	}

	@Column(name = "ptuuser_id", nullable = false)
	public int getPtuuserId() {
		return this.ptuuserId;
	}

	public void setPtuuserId(int ptuuserId) {
		this.ptuuserId = ptuuserId;
	}

	@Column(name = "usercreate", nullable = false)
	public int getUsercreate() {
		return this.usercreate;
	}

	public void setUsercreate(int usercreate) {
		this.usercreate = usercreate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechacreate", nullable = false, length = 10)
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

	@Temporal(TemporalType.DATE)
	@Column(name = "fechamod", length = 10)
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
	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
