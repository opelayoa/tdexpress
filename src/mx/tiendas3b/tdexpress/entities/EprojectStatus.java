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
 * EprojectStatus generated by hbm2java
 */
@Entity
@Table(name = "eproject_status", catalog = "itaid")
public class EprojectStatus implements java.io.Serializable {

	private Integer id;
	private String snombre;
	private String sdescripcion;
	private String sdescripcionCorta;
	private int usercreate;
	private Date fechacreate;
	private Integer usermod;
	private Date fechamod;
	private Integer userdel;
	private Date fechadel;
	private int status;
	private Integer orden;

	public EprojectStatus() {
	}

	public EprojectStatus(String snombre, String sdescripcion, String sdescripcionCorta, int usercreate,
			Date fechacreate, int status) {
		this.snombre = snombre;
		this.sdescripcion = sdescripcion;
		this.sdescripcionCorta = sdescripcionCorta;
		this.usercreate = usercreate;
		this.fechacreate = fechacreate;
		this.status = status;
	}

	public EprojectStatus(String snombre, String sdescripcion, String sdescripcionCorta, int usercreate,
			Date fechacreate, Integer usermod, Date fechamod, Integer userdel, Date fechadel, int status,
			Integer orden) {
		this.snombre = snombre;
		this.sdescripcion = sdescripcion;
		this.sdescripcionCorta = sdescripcionCorta;
		this.usercreate = usercreate;
		this.fechacreate = fechacreate;
		this.usermod = usermod;
		this.fechamod = fechamod;
		this.userdel = userdel;
		this.fechadel = fechadel;
		this.status = status;
		this.orden = orden;
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

	@Column(name = "snombre", nullable = false, length = 65535)
	public String getSnombre() {
		return this.snombre;
	}

	public void setSnombre(String snombre) {
		this.snombre = snombre;
	}

	@Column(name = "sdescripcion", nullable = false, length = 65535)
	public String getSdescripcion() {
		return this.sdescripcion;
	}

	public void setSdescripcion(String sdescripcion) {
		this.sdescripcion = sdescripcion;
	}

	@Column(name = "sdescripcion_corta", nullable = false, length = 10)
	public String getSdescripcionCorta() {
		return this.sdescripcionCorta;
	}

	public void setSdescripcionCorta(String sdescripcionCorta) {
		this.sdescripcionCorta = sdescripcionCorta;
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

	@Column(name = "orden")
	public Integer getOrden() {
		return this.orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

}
