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
 * Gastos generated by hbm2java
 */
@Entity
@Table(name = "gastos", catalog = "itaid")
public class Gastos implements java.io.Serializable {

	private Integer id;
	private int headerGastoId;
	private int categoriaId;
	private int conceptoId;
	private int userid;
	private Boolean recibo;
	private String comentarios;
	private Date fechaGasto;
	private Date fechaCaptura;
	private double monto;
	private double impuestos;
	private double total;
	private Integer lineas;
	private boolean status;

	public Gastos() {
	}

	public Gastos(int headerGastoId, int categoriaId, int conceptoId, int userid, String comentarios, Date fechaGasto,
			Date fechaCaptura, double monto, double impuestos, double total, boolean status) {
		this.headerGastoId = headerGastoId;
		this.categoriaId = categoriaId;
		this.conceptoId = conceptoId;
		this.userid = userid;
		this.comentarios = comentarios;
		this.fechaGasto = fechaGasto;
		this.fechaCaptura = fechaCaptura;
		this.monto = monto;
		this.impuestos = impuestos;
		this.total = total;
		this.status = status;
	}

	public Gastos(int headerGastoId, int categoriaId, int conceptoId, int userid, Boolean recibo, String comentarios,
			Date fechaGasto, Date fechaCaptura, double monto, double impuestos, double total, Integer lineas,
			boolean status) {
		this.headerGastoId = headerGastoId;
		this.categoriaId = categoriaId;
		this.conceptoId = conceptoId;
		this.userid = userid;
		this.recibo = recibo;
		this.comentarios = comentarios;
		this.fechaGasto = fechaGasto;
		this.fechaCaptura = fechaCaptura;
		this.monto = monto;
		this.impuestos = impuestos;
		this.total = total;
		this.lineas = lineas;
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

	@Column(name = "categoria_id", nullable = false)
	public int getCategoriaId() {
		return this.categoriaId;
	}

	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
	}

	@Column(name = "concepto_id", nullable = false)
	public int getConceptoId() {
		return this.conceptoId;
	}

	public void setConceptoId(int conceptoId) {
		this.conceptoId = conceptoId;
	}

	@Column(name = "userid", nullable = false)
	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Column(name = "recibo")
	public Boolean getRecibo() {
		return this.recibo;
	}

	public void setRecibo(Boolean recibo) {
		this.recibo = recibo;
	}

	@Column(name = "comentarios", nullable = false, length = 65535)
	public String getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_gasto", nullable = false, length = 10)
	public Date getFechaGasto() {
		return this.fechaGasto;
	}

	public void setFechaGasto(Date fechaGasto) {
		this.fechaGasto = fechaGasto;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_captura", nullable = false, length = 10)
	public Date getFechaCaptura() {
		return this.fechaCaptura;
	}

	public void setFechaCaptura(Date fechaCaptura) {
		this.fechaCaptura = fechaCaptura;
	}

	@Column(name = "monto", nullable = false, precision = 22, scale = 0)
	public double getMonto() {
		return this.monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Column(name = "impuestos", nullable = false, precision = 22, scale = 0)
	public double getImpuestos() {
		return this.impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Column(name = "total", nullable = false, precision = 22, scale = 0)
	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Column(name = "lineas")
	public Integer getLineas() {
		return this.lineas;
	}

	public void setLineas(Integer lineas) {
		this.lineas = lineas;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
