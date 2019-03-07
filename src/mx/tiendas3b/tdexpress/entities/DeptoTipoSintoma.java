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
 * DeptoTipoSintoma generated by hbm2java
 */
@Entity
@Table(name = "depto_tipo_sintoma", catalog = "itaid")
public class DeptoTipoSintoma implements java.io.Serializable {

	private Integer id;
	private int deptoId;
	private int tsId;
	private int userreg;
	private Date fechareg;
	private int userdel;
	private Date fechadel;
	private boolean status;

	public DeptoTipoSintoma() {
	}

	public DeptoTipoSintoma(int deptoId, int tsId, int userreg, Date fechareg, int userdel, Date fechadel,
			boolean status) {
		this.deptoId = deptoId;
		this.tsId = tsId;
		this.userreg = userreg;
		this.fechareg = fechareg;
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

	@Column(name = "depto_id", nullable = false)
	public int getDeptoId() {
		return this.deptoId;
	}

	public void setDeptoId(int deptoId) {
		this.deptoId = deptoId;
	}

	@Column(name = "ts_id", nullable = false)
	public int getTsId() {
		return this.tsId;
	}

	public void setTsId(int tsId) {
		this.tsId = tsId;
	}

	@Column(name = "userreg", nullable = false)
	public int getUserreg() {
		return this.userreg;
	}

	public void setUserreg(int userreg) {
		this.userreg = userreg;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechareg", nullable = false, length = 19)
	public Date getFechareg() {
		return this.fechareg;
	}

	public void setFechareg(Date fechareg) {
		this.fechareg = fechareg;
	}

	@Column(name = "userdel", nullable = false)
	public int getUserdel() {
		return this.userdel;
	}

	public void setUserdel(int userdel) {
		this.userdel = userdel;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechadel", nullable = false, length = 19)
	public Date getFechadel() {
		return this.fechadel;
	}

	public void setFechadel(Date fechadel) {
		this.fechadel = fechadel;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
