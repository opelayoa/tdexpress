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
 * Solicitud generated by hbm2java
 */
@Entity
@Table(name = "solicitud", catalog = "itaid")
public class Solicitud implements java.io.Serializable {

	private Integer id;
	private int proveedorId;
	private int headerPedidoId;
	private double monto;
	private Date fechaLimite;
	private String conCargoA;
	private int departamentoId;
	private String chequeTrans;
	private int conceptoId;
	private String factura;
	private int ticketId;
	private int solicitanteId;
	private Integer puestoSolicitanteId;
	private int autorizaId;
	private Integer puestoAutorizaId;
	private Integer tipoMonedaId;
	private boolean status;
	private String comentarioConcepto;
	private int usercreate;
	private Date fechacreate;
	private Integer usermod;
	private Date fechamod;
	private Integer userdel;
	private Date fechadel;

	public Solicitud() {
	}

	public Solicitud(int proveedorId, int headerPedidoId, double monto, Date fechaLimite, String conCargoA,
			int departamentoId, String chequeTrans, int conceptoId, String factura, int ticketId, int solicitanteId,
			int autorizaId, boolean status, int usercreate, Date fechacreate) {
		this.proveedorId = proveedorId;
		this.headerPedidoId = headerPedidoId;
		this.monto = monto;
		this.fechaLimite = fechaLimite;
		this.conCargoA = conCargoA;
		this.departamentoId = departamentoId;
		this.chequeTrans = chequeTrans;
		this.conceptoId = conceptoId;
		this.factura = factura;
		this.ticketId = ticketId;
		this.solicitanteId = solicitanteId;
		this.autorizaId = autorizaId;
		this.status = status;
		this.usercreate = usercreate;
		this.fechacreate = fechacreate;
	}

	public Solicitud(int proveedorId, int headerPedidoId, double monto, Date fechaLimite, String conCargoA,
			int departamentoId, String chequeTrans, int conceptoId, String factura, int ticketId, int solicitanteId,
			Integer puestoSolicitanteId, int autorizaId, Integer puestoAutorizaId, Integer tipoMonedaId, boolean status,
			String comentarioConcepto, int usercreate, Date fechacreate, Integer usermod, Date fechamod,
			Integer userdel, Date fechadel) {
		this.proveedorId = proveedorId;
		this.headerPedidoId = headerPedidoId;
		this.monto = monto;
		this.fechaLimite = fechaLimite;
		this.conCargoA = conCargoA;
		this.departamentoId = departamentoId;
		this.chequeTrans = chequeTrans;
		this.conceptoId = conceptoId;
		this.factura = factura;
		this.ticketId = ticketId;
		this.solicitanteId = solicitanteId;
		this.puestoSolicitanteId = puestoSolicitanteId;
		this.autorizaId = autorizaId;
		this.puestoAutorizaId = puestoAutorizaId;
		this.tipoMonedaId = tipoMonedaId;
		this.status = status;
		this.comentarioConcepto = comentarioConcepto;
		this.usercreate = usercreate;
		this.fechacreate = fechacreate;
		this.usermod = usermod;
		this.fechamod = fechamod;
		this.userdel = userdel;
		this.fechadel = fechadel;
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

	@Column(name = "proveedor_id", nullable = false)
	public int getProveedorId() {
		return this.proveedorId;
	}

	public void setProveedorId(int proveedorId) {
		this.proveedorId = proveedorId;
	}

	@Column(name = "header_pedido_id", nullable = false)
	public int getHeaderPedidoId() {
		return this.headerPedidoId;
	}

	public void setHeaderPedidoId(int headerPedidoId) {
		this.headerPedidoId = headerPedidoId;
	}

	@Column(name = "monto", nullable = false, precision = 22, scale = 0)
	public double getMonto() {
		return this.monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_limite", nullable = false, length = 10)
	public Date getFechaLimite() {
		return this.fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	@Column(name = "con_cargo_a", nullable = false, length = 30)
	public String getConCargoA() {
		return this.conCargoA;
	}

	public void setConCargoA(String conCargoA) {
		this.conCargoA = conCargoA;
	}

	@Column(name = "departamento_id", nullable = false)
	public int getDepartamentoId() {
		return this.departamentoId;
	}

	public void setDepartamentoId(int departamentoId) {
		this.departamentoId = departamentoId;
	}

	@Column(name = "cheque_trans", nullable = false, length = 128)
	public String getChequeTrans() {
		return this.chequeTrans;
	}

	public void setChequeTrans(String chequeTrans) {
		this.chequeTrans = chequeTrans;
	}

	@Column(name = "concepto_id", nullable = false)
	public int getConceptoId() {
		return this.conceptoId;
	}

	public void setConceptoId(int conceptoId) {
		this.conceptoId = conceptoId;
	}

	@Column(name = "factura", nullable = false, length = 10)
	public String getFactura() {
		return this.factura;
	}

	public void setFactura(String factura) {
		this.factura = factura;
	}

	@Column(name = "ticket_id", nullable = false)
	public int getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	@Column(name = "solicitante_id", nullable = false)
	public int getSolicitanteId() {
		return this.solicitanteId;
	}

	public void setSolicitanteId(int solicitanteId) {
		this.solicitanteId = solicitanteId;
	}

	@Column(name = "puesto_solicitante_id")
	public Integer getPuestoSolicitanteId() {
		return this.puestoSolicitanteId;
	}

	public void setPuestoSolicitanteId(Integer puestoSolicitanteId) {
		this.puestoSolicitanteId = puestoSolicitanteId;
	}

	@Column(name = "autoriza_id", nullable = false)
	public int getAutorizaId() {
		return this.autorizaId;
	}

	public void setAutorizaId(int autorizaId) {
		this.autorizaId = autorizaId;
	}

	@Column(name = "puesto_autoriza_id")
	public Integer getPuestoAutorizaId() {
		return this.puestoAutorizaId;
	}

	public void setPuestoAutorizaId(Integer puestoAutorizaId) {
		this.puestoAutorizaId = puestoAutorizaId;
	}

	@Column(name = "tipo_moneda_id")
	public Integer getTipoMonedaId() {
		return this.tipoMonedaId;
	}

	public void setTipoMonedaId(Integer tipoMonedaId) {
		this.tipoMonedaId = tipoMonedaId;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Column(name = "comentario_concepto", length = 65535)
	public String getComentarioConcepto() {
		return this.comentarioConcepto;
	}

	public void setComentarioConcepto(String comentarioConcepto) {
		this.comentarioConcepto = comentarioConcepto;
	}

	@Column(name = "usercreate", nullable = false)
	public int getUsercreate() {
		return this.usercreate;
	}

	public void setUsercreate(int usercreate) {
		this.usercreate = usercreate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechacreate", nullable = false, length = 19)
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechamod", length = 19)
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechadel", length = 19)
	public Date getFechadel() {
		return this.fechadel;
	}

	public void setFechadel(Date fechadel) {
		this.fechadel = fechadel;
	}

}
