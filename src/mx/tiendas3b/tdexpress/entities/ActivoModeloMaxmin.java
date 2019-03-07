package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:16:53 AM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
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
 * ActivoModeloMaxmin generated by hbm2java
 */
@Entity
@Table(name = "activo_modelo_maxmin", catalog = "itaid")
public class ActivoModeloMaxmin implements java.io.Serializable {

	private Integer id;
	private int activomodeloId;
	private int sucursalId;
	private BigDecimal minimo;
	private BigDecimal existencia;
	private BigDecimal maximo;
	private int userreg;
	private Date fechareg;
	private int userdel;
	private Date fechadel;
	private boolean status;

	public ActivoModeloMaxmin() {
	}

	public ActivoModeloMaxmin(int activomodeloId, int sucursalId, BigDecimal minimo, BigDecimal existencia,
			BigDecimal maximo, int userreg, Date fechareg, int userdel, Date fechadel, boolean status) {
		this.activomodeloId = activomodeloId;
		this.sucursalId = sucursalId;
		this.minimo = minimo;
		this.existencia = existencia;
		this.maximo = maximo;
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

	@Column(name = "activomodelo_id", nullable = false)
	public int getActivomodeloId() {
		return this.activomodeloId;
	}

	public void setActivomodeloId(int activomodeloId) {
		this.activomodeloId = activomodeloId;
	}

	@Column(name = "sucursal_id", nullable = false)
	public int getSucursalId() {
		return this.sucursalId;
	}

	public void setSucursalId(int sucursalId) {
		this.sucursalId = sucursalId;
	}

	@Column(name = "minimo", nullable = false, precision = 15, scale = 4)
	public BigDecimal getMinimo() {
		return this.minimo;
	}

	public void setMinimo(BigDecimal minimo) {
		this.minimo = minimo;
	}

	@Column(name = "existencia", nullable = false, precision = 15, scale = 4)
	public BigDecimal getExistencia() {
		return this.existencia;
	}

	public void setExistencia(BigDecimal existencia) {
		this.existencia = existencia;
	}

	@Column(name = "maximo", nullable = false, precision = 15, scale = 4)
	public BigDecimal getMaximo() {
		return this.maximo;
	}

	public void setMaximo(BigDecimal maximo) {
		this.maximo = maximo;
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