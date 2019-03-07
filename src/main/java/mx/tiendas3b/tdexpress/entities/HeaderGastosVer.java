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
 * HeaderGastosVer generated by hbm2java
 */
@Entity
@Table(name = "header_gastos_ver", catalog = "itaid")
public class HeaderGastosVer implements java.io.Serializable {

	private Integer id;
	private int headerGastoId;
	private int userid;
	private Date fecha;
	private boolean status;

	public HeaderGastosVer() {
	}

	public HeaderGastosVer(int headerGastoId, int userid, Date fecha, boolean status) {
		this.headerGastoId = headerGastoId;
		this.userid = userid;
		this.fecha = fecha;
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

	@Column(name = "header_gasto_id", nullable = false)
	public int getHeaderGastoId() {
		return this.headerGastoId;
	}

	public void setHeaderGastoId(int headerGastoId) {
		this.headerGastoId = headerGastoId;
	}

	@Column(name = "userid", nullable = false)
	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", nullable = false, length = 19)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
