package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:16:53 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EprojectEtapasStatusId generated by hbm2java
 */
@Embeddable
public class EprojectEtapasStatusId implements java.io.Serializable {

	private int id;
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

	public EprojectEtapasStatusId() {
	}

	public EprojectEtapasStatusId(int id, String snombre, String sdescripcion, String sdescripcionCorta, int usercreate,
			Date fechacreate, int status) {
		this.id = id;
		this.snombre = snombre;
		this.sdescripcion = sdescripcion;
		this.sdescripcionCorta = sdescripcionCorta;
		this.usercreate = usercreate;
		this.fechacreate = fechacreate;
		this.status = status;
	}

	public EprojectEtapasStatusId(int id, String snombre, String sdescripcion, String sdescripcionCorta, int usercreate,
			Date fechacreate, Integer usermod, Date fechamod, Integer userdel, Date fechadel, int status,
			Integer orden) {
		this.id = id;
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

	@Column(name = "id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EprojectEtapasStatusId))
			return false;
		EprojectEtapasStatusId castOther = (EprojectEtapasStatusId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getSnombre() == castOther.getSnombre()) || (this.getSnombre() != null
						&& castOther.getSnombre() != null && this.getSnombre().equals(castOther.getSnombre())))
				&& ((this.getSdescripcion() == castOther.getSdescripcion())
						|| (this.getSdescripcion() != null && castOther.getSdescripcion() != null
								&& this.getSdescripcion().equals(castOther.getSdescripcion())))
				&& ((this.getSdescripcionCorta() == castOther.getSdescripcionCorta())
						|| (this.getSdescripcionCorta() != null && castOther.getSdescripcionCorta() != null
								&& this.getSdescripcionCorta().equals(castOther.getSdescripcionCorta())))
				&& (this.getUsercreate() == castOther.getUsercreate())
				&& ((this.getFechacreate() == castOther.getFechacreate())
						|| (this.getFechacreate() != null && castOther.getFechacreate() != null
								&& this.getFechacreate().equals(castOther.getFechacreate())))
				&& ((this.getUsermod() == castOther.getUsermod()) || (this.getUsermod() != null
						&& castOther.getUsermod() != null && this.getUsermod().equals(castOther.getUsermod())))
				&& ((this.getFechamod() == castOther.getFechamod()) || (this.getFechamod() != null
						&& castOther.getFechamod() != null && this.getFechamod().equals(castOther.getFechamod())))
				&& ((this.getUserdel() == castOther.getUserdel()) || (this.getUserdel() != null
						&& castOther.getUserdel() != null && this.getUserdel().equals(castOther.getUserdel())))
				&& ((this.getFechadel() == castOther.getFechadel()) || (this.getFechadel() != null
						&& castOther.getFechadel() != null && this.getFechadel().equals(castOther.getFechadel())))
				&& (this.getStatus() == castOther.getStatus())
				&& ((this.getOrden() == castOther.getOrden()) || (this.getOrden() != null
						&& castOther.getOrden() != null && this.getOrden().equals(castOther.getOrden())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getSnombre() == null ? 0 : this.getSnombre().hashCode());
		result = 37 * result + (getSdescripcion() == null ? 0 : this.getSdescripcion().hashCode());
		result = 37 * result + (getSdescripcionCorta() == null ? 0 : this.getSdescripcionCorta().hashCode());
		result = 37 * result + this.getUsercreate();
		result = 37 * result + (getFechacreate() == null ? 0 : this.getFechacreate().hashCode());
		result = 37 * result + (getUsermod() == null ? 0 : this.getUsermod().hashCode());
		result = 37 * result + (getFechamod() == null ? 0 : this.getFechamod().hashCode());
		result = 37 * result + (getUserdel() == null ? 0 : this.getUserdel().hashCode());
		result = 37 * result + (getFechadel() == null ? 0 : this.getFechadel().hashCode());
		result = 37 * result + this.getStatus();
		result = 37 * result + (getOrden() == null ? 0 : this.getOrden().hashCode());
		return result;
	}

}
