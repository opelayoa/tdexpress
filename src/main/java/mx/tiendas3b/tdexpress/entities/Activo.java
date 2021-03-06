package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

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
 * Activo generated by hbm2java
 */
@Entity
@Table(name = "activo", catalog = "itaid")
public class Activo implements java.io.Serializable {

	private Integer id;
	private int activomodeloId;
	private String serie;
	private String tag;
	private BigDecimal costo;
	private int proveedorId;
	private String factura;
	private Date fechacompra;
	private int activoestadoId;
	private String asignatarioId;
	private Date fechaasignacion;
	private String observaciones;
	private Integer headerPedidoId;
	private String especificaciones;
	private Integer ticket;
	private Integer zonaId;
	private Integer distritoId;

	public Activo() {
	}

	public Activo(int activomodeloId, BigDecimal costo, int proveedorId, String factura, Date fechacompra,
			int activoestadoId, String observaciones) {
		this.activomodeloId = activomodeloId;
		this.costo = costo;
		this.proveedorId = proveedorId;
		this.factura = factura;
		this.fechacompra = fechacompra;
		this.activoestadoId = activoestadoId;
		this.observaciones = observaciones;
	}

	public Activo(int activomodeloId, String serie, String tag, BigDecimal costo, int proveedorId, String factura,
			Date fechacompra, int activoestadoId, String asignatarioId, Date fechaasignacion, String observaciones,
			Integer headerPedidoId, String especificaciones, Integer ticket, Integer zonaId, Integer distritoId) {
		this.activomodeloId = activomodeloId;
		this.serie = serie;
		this.tag = tag;
		this.costo = costo;
		this.proveedorId = proveedorId;
		this.factura = factura;
		this.fechacompra = fechacompra;
		this.activoestadoId = activoestadoId;
		this.asignatarioId = asignatarioId;
		this.fechaasignacion = fechaasignacion;
		this.observaciones = observaciones;
		this.headerPedidoId = headerPedidoId;
		this.especificaciones = especificaciones;
		this.ticket = ticket;
		this.zonaId = zonaId;
		this.distritoId = distritoId;
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

	@Column(name = "serie", length = 24)
	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	@Column(name = "tag", length = 20)
	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Column(name = "costo", nullable = false, precision = 7)
	public BigDecimal getCosto() {
		return this.costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	@Column(name = "proveedor_id", nullable = false)
	public int getProveedorId() {
		return this.proveedorId;
	}

	public void setProveedorId(int proveedorId) {
		this.proveedorId = proveedorId;
	}

	@Column(name = "factura", nullable = false, length = 8)
	public String getFactura() {
		return this.factura;
	}

	public void setFactura(String factura) {
		this.factura = factura;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechacompra", nullable = false, length = 10)
	public Date getFechacompra() {
		return this.fechacompra;
	}

	public void setFechacompra(Date fechacompra) {
		this.fechacompra = fechacompra;
	}

	@Column(name = "activoestado_id", nullable = false)
	public int getActivoestadoId() {
		return this.activoestadoId;
	}

	public void setActivoestadoId(int activoestadoId) {
		this.activoestadoId = activoestadoId;
	}

	@Column(name = "asignatario_id", length = 5)
	public String getAsignatarioId() {
		return this.asignatarioId;
	}

	public void setAsignatarioId(String asignatarioId) {
		this.asignatarioId = asignatarioId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechaasignacion", length = 10)
	public Date getFechaasignacion() {
		return this.fechaasignacion;
	}

	public void setFechaasignacion(Date fechaasignacion) {
		this.fechaasignacion = fechaasignacion;
	}

	@Column(name = "observaciones", nullable = false)
	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Column(name = "header_pedido_id")
	public Integer getHeaderPedidoId() {
		return this.headerPedidoId;
	}

	public void setHeaderPedidoId(Integer headerPedidoId) {
		this.headerPedidoId = headerPedidoId;
	}

	@Column(name = "especificaciones", length = 65535)
	public String getEspecificaciones() {
		return this.especificaciones;
	}

	public void setEspecificaciones(String especificaciones) {
		this.especificaciones = especificaciones;
	}

	@Column(name = "ticket")
	public Integer getTicket() {
		return this.ticket;
	}

	public void setTicket(Integer ticket) {
		this.ticket = ticket;
	}

	@Column(name = "zona_id")
	public Integer getZonaId() {
		return this.zonaId;
	}

	public void setZonaId(Integer zonaId) {
		this.zonaId = zonaId;
	}

	@Column(name = "distrito_id")
	public Integer getDistritoId() {
		return this.distritoId;
	}

	public void setDistritoId(Integer distritoId) {
		this.distritoId = distritoId;
	}

}
