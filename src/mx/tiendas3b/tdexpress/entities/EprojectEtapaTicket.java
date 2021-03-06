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
 * EprojectEtapaTicket generated by hbm2java
 */
@Entity
@Table(name = "eproject_etapa_ticket", catalog = "itaid")
public class EprojectEtapaTicket implements java.io.Serializable {

	private Integer id;
	private int etetapaId;
	private int etticketId;
	private int usercreate;
	private Date fechacreate;
	private Integer usermod;
	private Date fechamod;
	private Integer userdel;
	private Date fechadel;
	private String status;

	public EprojectEtapaTicket() {
	}

	public EprojectEtapaTicket(int etetapaId, int etticketId, int usercreate, Date fechacreate, String status) {
		this.etetapaId = etetapaId;
		this.etticketId = etticketId;
		this.usercreate = usercreate;
		this.fechacreate = fechacreate;
		this.status = status;
	}

	public EprojectEtapaTicket(int etetapaId, int etticketId, int usercreate, Date fechacreate, Integer usermod,
			Date fechamod, Integer userdel, Date fechadel, String status) {
		this.etetapaId = etetapaId;
		this.etticketId = etticketId;
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

	@Column(name = "etetapa_id", nullable = false)
	public int getEtetapaId() {
		return this.etetapaId;
	}

	public void setEtetapaId(int etetapaId) {
		this.etetapaId = etetapaId;
	}

	@Column(name = "etticket_id", nullable = false)
	public int getEtticketId() {
		return this.etticketId;
	}

	public void setEtticketId(int etticketId) {
		this.etticketId = etticketId;
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

	@Column(name = "status", nullable = false, length = 45)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
