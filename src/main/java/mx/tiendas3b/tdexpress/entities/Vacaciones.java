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
 * Vacaciones generated by hbm2java
 */
@Entity
@Table(name = "vacaciones", catalog = "itaid")
public class Vacaciones implements java.io.Serializable {

	private Integer id;
	private String periodo;
	private Integer diasAcumulados;
	private Integer diasRestantes;
	private Integer duracion;
	private Date fechaIni;
	private Date fechaFin;
	private Integer goceSueldo;
	private String motivo;
	private String solicita;
	private String vistoBueno;
	private Date fechaAlta;
	private int empleadosId;
	private Integer managerId;

	public Vacaciones() {
	}

	public Vacaciones(Date fechaAlta, int empleadosId) {
		this.fechaAlta = fechaAlta;
		this.empleadosId = empleadosId;
	}

	public Vacaciones(String periodo, Integer diasAcumulados, Integer diasRestantes, Integer duracion, Date fechaIni,
			Date fechaFin, Integer goceSueldo, String motivo, String solicita, String vistoBueno, Date fechaAlta,
			int empleadosId, Integer managerId) {
		this.periodo = periodo;
		this.diasAcumulados = diasAcumulados;
		this.diasRestantes = diasRestantes;
		this.duracion = duracion;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.goceSueldo = goceSueldo;
		this.motivo = motivo;
		this.solicita = solicita;
		this.vistoBueno = vistoBueno;
		this.fechaAlta = fechaAlta;
		this.empleadosId = empleadosId;
		this.managerId = managerId;
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

	@Column(name = "periodo", length = 25)
	public String getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	@Column(name = "dias_acumulados")
	public Integer getDiasAcumulados() {
		return this.diasAcumulados;
	}

	public void setDiasAcumulados(Integer diasAcumulados) {
		this.diasAcumulados = diasAcumulados;
	}

	@Column(name = "dias_restantes")
	public Integer getDiasRestantes() {
		return this.diasRestantes;
	}

	public void setDiasRestantes(Integer diasRestantes) {
		this.diasRestantes = diasRestantes;
	}

	@Column(name = "duracion")
	public Integer getDuracion() {
		return this.duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_ini", length = 10)
	public Date getFechaIni() {
		return this.fechaIni;
	}

	public void setFechaIni(Date fechaIni) {
		this.fechaIni = fechaIni;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_fin", length = 10)
	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Column(name = "goce_sueldo")
	public Integer getGoceSueldo() {
		return this.goceSueldo;
	}

	public void setGoceSueldo(Integer goceSueldo) {
		this.goceSueldo = goceSueldo;
	}

	@Column(name = "motivo", length = 65535)
	public String getMotivo() {
		return this.motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	@Column(name = "solicita", length = 150)
	public String getSolicita() {
		return this.solicita;
	}

	public void setSolicita(String solicita) {
		this.solicita = solicita;
	}

	@Column(name = "vistoBueno", length = 150)
	public String getVistoBueno() {
		return this.vistoBueno;
	}

	public void setVistoBueno(String vistoBueno) {
		this.vistoBueno = vistoBueno;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_alta", nullable = false, length = 19)
	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Column(name = "empleados_id", nullable = false)
	public int getEmpleadosId() {
		return this.empleadosId;
	}

	public void setEmpleadosId(int empleadosId) {
		this.empleadosId = empleadosId;
	}

	@Column(name = "manager_id")
	public Integer getManagerId() {
		return this.managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

}
