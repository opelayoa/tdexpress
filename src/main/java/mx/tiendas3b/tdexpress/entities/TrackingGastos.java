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
 * TrackingGastos generated by hbm2java
 */
@Entity
@Table(name = "tracking_gastos", catalog = "itaid")
public class TrackingGastos implements java.io.Serializable {

	private Integer id;
	private int gastoId;
	private int userid;
	private int useridEnvio;
	private Date fecha;
	private boolean status;

	public TrackingGastos() {
	}

	public TrackingGastos(int gastoId, int userid, int useridEnvio, Date fecha, boolean status) {
		this.gastoId = gastoId;
		this.userid = userid;
		this.useridEnvio = useridEnvio;
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

	@Column(name = "gasto_id", nullable = false)
	public int getGastoId() {
		return this.gastoId;
	}

	public void setGastoId(int gastoId) {
		this.gastoId = gastoId;
	}

	@Column(name = "userid", nullable = false)
	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Column(name = "userid_envio", nullable = false)
	public int getUseridEnvio() {
		return this.useridEnvio;
	}

	public void setUseridEnvio(int useridEnvio) {
		this.useridEnvio = useridEnvio;
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
