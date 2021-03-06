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
 * CrossPerfiles generated by hbm2java
 */
@Entity
@Table(name = "cross_perfiles", catalog = "itaid")
public class CrossPerfiles implements java.io.Serializable {

	private Integer id;
	private int perfilId;
	private int perfilDastaId;
	private int usercreate;
	private Date fechacreate;
	private Integer usermod;
	private Date fechamod;
	private Integer userdel;
	private Date fechadel;
	private byte status;

	public CrossPerfiles() {
	}

	public CrossPerfiles(int perfilId, int perfilDastaId, int usercreate, Date fechacreate, byte status) {
		this.perfilId = perfilId;
		this.perfilDastaId = perfilDastaId;
		this.usercreate = usercreate;
		this.fechacreate = fechacreate;
		this.status = status;
	}

	public CrossPerfiles(int perfilId, int perfilDastaId, int usercreate, Date fechacreate, Integer usermod,
			Date fechamod, Integer userdel, Date fechadel, byte status) {
		this.perfilId = perfilId;
		this.perfilDastaId = perfilDastaId;
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

	@Column(name = "perfil_id", nullable = false)
	public int getPerfilId() {
		return this.perfilId;
	}

	public void setPerfilId(int perfilId) {
		this.perfilId = perfilId;
	}

	@Column(name = "perfil_dasta_id", nullable = false)
	public int getPerfilDastaId() {
		return this.perfilDastaId;
	}

	public void setPerfilDastaId(int perfilDastaId) {
		this.perfilDastaId = perfilDastaId;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechadel", length = 19)
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
