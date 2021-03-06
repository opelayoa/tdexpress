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
 * Empleados generated by hbm2java
 */
@Entity
@Table(name = "empleados", catalog = "itaid")
public class Empleados implements java.io.Serializable {

	private Integer id;
	private String noEmpleado;
	private String name;
	private String puesto;
	private Integer departamentoId;
	private Date fechaIngreso;
	private Integer sucursalId;
	private String jefeInmediato;
	private String empresa;
	private String periodo;
	private String region;

	public Empleados() {
	}

	public Empleados(String noEmpleado, String name, String periodo) {
		this.noEmpleado = noEmpleado;
		this.name = name;
		this.periodo = periodo;
	}

	public Empleados(String noEmpleado, String name, String puesto, Integer departamentoId, Date fechaIngreso,
			Integer sucursalId, String jefeInmediato, String empresa, String periodo, String region) {
		this.noEmpleado = noEmpleado;
		this.name = name;
		this.puesto = puesto;
		this.departamentoId = departamentoId;
		this.fechaIngreso = fechaIngreso;
		this.sucursalId = sucursalId;
		this.jefeInmediato = jefeInmediato;
		this.empresa = empresa;
		this.periodo = periodo;
		this.region = region;
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

	@Column(name = "no_empleado", nullable = false, length = 45)
	public String getNoEmpleado() {
		return this.noEmpleado;
	}

	public void setNoEmpleado(String noEmpleado) {
		this.noEmpleado = noEmpleado;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "puesto", length = 45)
	public String getPuesto() {
		return this.puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Column(name = "departamento_id")
	public Integer getDepartamentoId() {
		return this.departamentoId;
	}

	public void setDepartamentoId(Integer departamentoId) {
		this.departamentoId = departamentoId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_ingreso", length = 19)
	public Date getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Column(name = "sucursal_id")
	public Integer getSucursalId() {
		return this.sucursalId;
	}

	public void setSucursalId(Integer sucursalId) {
		this.sucursalId = sucursalId;
	}

	@Column(name = "jefe_inmediato", length = 45)
	public String getJefeInmediato() {
		return this.jefeInmediato;
	}

	public void setJefeInmediato(String jefeInmediato) {
		this.jefeInmediato = jefeInmediato;
	}

	@Column(name = "empresa", length = 60)
	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Column(name = "periodo", nullable = false, length = 25)
	public String getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	@Column(name = "region", length = 45)
	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

}
