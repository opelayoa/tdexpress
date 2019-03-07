package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ServidoresId generated by hbm2java
 */
@Embeddable
public class ServidoresId implements java.io.Serializable {

	private int id;
	private String nombre;
	private String descripcion;
	private int usercreate;
	private Date fechacreate;
	private int usermod;
	private Date fechamod;
	private int userdel;
	private Date fechadel;
	private byte status;

	public ServidoresId() {
	}

	public ServidoresId(int id, String nombre, String descripcion, int usercreate, Date fechacreate, int usermod,
			Date fechamod, int userdel, Date fechadel, byte status) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.usercreate = usercreate;
		this.fechacreate = fechacreate;
		this.usermod = usermod;
		this.fechamod = fechamod;
		this.userdel = userdel;
		this.fechadel = fechadel;
		this.status = status;
	}

	@Column(name = "id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion", nullable = false, length = 65535)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "usercreate", nullable = false)
	public int getUsercreate() {
		return this.usercreate;
	}

	public void setUsercreate(int usercreate) {
		this.usercreate = usercreate;
	}

	@Column(name = "fechacreate", nullable = false, length = 19)
	public Date getFechacreate() {
		return this.fechacreate;
	}

	public void setFechacreate(Date fechacreate) {
		this.fechacreate = fechacreate;
	}

	@Column(name = "usermod", nullable = false)
	public int getUsermod() {
		return this.usermod;
	}

	public void setUsermod(int usermod) {
		this.usermod = usermod;
	}

	@Column(name = "fechamod", nullable = false, length = 19)
	public Date getFechamod() {
		return this.fechamod;
	}

	public void setFechamod(Date fechamod) {
		this.fechamod = fechamod;
	}

	@Column(name = "userdel", nullable = false)
	public int getUserdel() {
		return this.userdel;
	}

	public void setUserdel(int userdel) {
		this.userdel = userdel;
	}

	@Column(name = "fechadel", nullable = false, length = 19)
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ServidoresId))
			return false;
		ServidoresId castOther = (ServidoresId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getNombre() == castOther.getNombre()) || (this.getNombre() != null
						&& castOther.getNombre() != null && this.getNombre().equals(castOther.getNombre())))
				&& ((this.getDescripcion() == castOther.getDescripcion())
						|| (this.getDescripcion() != null && castOther.getDescripcion() != null
								&& this.getDescripcion().equals(castOther.getDescripcion())))
				&& (this.getUsercreate() == castOther.getUsercreate())
				&& ((this.getFechacreate() == castOther.getFechacreate())
						|| (this.getFechacreate() != null && castOther.getFechacreate() != null
								&& this.getFechacreate().equals(castOther.getFechacreate())))
				&& (this.getUsermod() == castOther.getUsermod())
				&& ((this.getFechamod() == castOther.getFechamod()) || (this.getFechamod() != null
						&& castOther.getFechamod() != null && this.getFechamod().equals(castOther.getFechamod())))
				&& (this.getUserdel() == castOther.getUserdel())
				&& ((this.getFechadel() == castOther.getFechadel()) || (this.getFechadel() != null
						&& castOther.getFechadel() != null && this.getFechadel().equals(castOther.getFechadel())))
				&& (this.getStatus() == castOther.getStatus());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getNombre() == null ? 0 : this.getNombre().hashCode());
		result = 37 * result + (getDescripcion() == null ? 0 : this.getDescripcion().hashCode());
		result = 37 * result + this.getUsercreate();
		result = 37 * result + (getFechacreate() == null ? 0 : this.getFechacreate().hashCode());
		result = 37 * result + this.getUsermod();
		result = 37 * result + (getFechamod() == null ? 0 : this.getFechamod().hashCode());
		result = 37 * result + this.getUserdel();
		result = 37 * result + (getFechadel() == null ? 0 : this.getFechadel().hashCode());
		result = 37 * result + this.getStatus();
		return result;
	}

}
