package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:16:53 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ActivoModelo generated by hbm2java
 */
@Entity
@Table(name = "activo_modelo", catalog = "itaid")
public class ActivoModelo implements java.io.Serializable {

	private Integer id;
	private int activocategoriaId;
	private int activomarcaId;
	private String modelo;
	private Boolean status;
	private Float costo;
	private String area;
	private String buscar;
	private Boolean series;
	private Boolean noinventario;
	private Integer proveedorId;
	private Integer tipoMonedaId;
	private int departamentoId;

	public ActivoModelo() {
	}

	public ActivoModelo(int activocategoriaId, int activomarcaId, int departamentoId) {
		this.activocategoriaId = activocategoriaId;
		this.activomarcaId = activomarcaId;
		this.departamentoId = departamentoId;
	}

	public ActivoModelo(int activocategoriaId, int activomarcaId, String modelo, Boolean status, Float costo,
			String area, String buscar, Boolean series, Boolean noinventario, Integer proveedorId, Integer tipoMonedaId,
			int departamentoId) {
		this.activocategoriaId = activocategoriaId;
		this.activomarcaId = activomarcaId;
		this.modelo = modelo;
		this.status = status;
		this.costo = costo;
		this.area = area;
		this.buscar = buscar;
		this.series = series;
		this.noinventario = noinventario;
		this.proveedorId = proveedorId;
		this.tipoMonedaId = tipoMonedaId;
		this.departamentoId = departamentoId;
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

	@Column(name = "activocategoria_id", nullable = false)
	public int getActivocategoriaId() {
		return this.activocategoriaId;
	}

	public void setActivocategoriaId(int activocategoriaId) {
		this.activocategoriaId = activocategoriaId;
	}

	@Column(name = "activomarca_id", nullable = false)
	public int getActivomarcaId() {
		return this.activomarcaId;
	}

	public void setActivomarcaId(int activomarcaId) {
		this.activomarcaId = activomarcaId;
	}

	@Column(name = "modelo", length = 20)
	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Column(name = "status")
	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Column(name = "costo", precision = 12, scale = 0)
	public Float getCosto() {
		return this.costo;
	}

	public void setCosto(Float costo) {
		this.costo = costo;
	}

	@Column(name = "area", length = 3)
	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "buscar", length = 65535)
	public String getBuscar() {
		return this.buscar;
	}

	public void setBuscar(String buscar) {
		this.buscar = buscar;
	}

	@Column(name = "series")
	public Boolean getSeries() {
		return this.series;
	}

	public void setSeries(Boolean series) {
		this.series = series;
	}

	@Column(name = "noinventario")
	public Boolean getNoinventario() {
		return this.noinventario;
	}

	public void setNoinventario(Boolean noinventario) {
		this.noinventario = noinventario;
	}

	@Column(name = "proveedor_id")
	public Integer getProveedorId() {
		return this.proveedorId;
	}

	public void setProveedorId(Integer proveedorId) {
		this.proveedorId = proveedorId;
	}

	@Column(name = "tipo_moneda_id")
	public Integer getTipoMonedaId() {
		return this.tipoMonedaId;
	}

	public void setTipoMonedaId(Integer tipoMonedaId) {
		this.tipoMonedaId = tipoMonedaId;
	}

	@Column(name = "departamento_id", nullable = false)
	public int getDepartamentoId() {
		return this.departamentoId;
	}

	public void setDepartamentoId(int departamentoId) {
		this.departamentoId = departamentoId;
	}

}
