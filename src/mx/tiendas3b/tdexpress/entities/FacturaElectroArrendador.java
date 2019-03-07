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
 * FacturaElectroArrendador generated by hbm2java
 */
@Entity
@Table(name = "factura_electro_arrendador", catalog = "itaid")
public class FacturaElectroArrendador implements java.io.Serializable {

	private Integer id;
	private int arrendadoresId;
	private String folio;
	private String serie;
	private Date fechaFactura;
	private String sello;
	private String formaPago;
	private String numCertificado;
	private String certificado;
	private String moneda;
	private String tipoComprobante;
	private String metodoPago;
	private String lugarExpedicion;
	private BigDecimal subtotal;
	private BigDecimal descuento;
	private BigDecimal total;
	private String rfcEmisor;
	private String nombreEmisor;
	private String calleEmisor;
	private String numExtEmisor;
	private String numIntEmisor;
	private String coloniaEmisor;
	private String localidadEmisor;
	private String municipioEmisor;
	private String estadoEmisor;
	private String paisEmisor;
	private String codigoPostalEmisor;
	private String rfcTtb;
	private String nombreTtb;
	private String calleTtb;
	private String numExtTtb;
	private String numIntTtb;
	private String coloniaTtb;
	private String localidadTtb;
	private String paisTtb;
	private String codigoPostalTtb;
	private String cantidad;
	private String descripcion;
	private BigDecimal valorUnitario;
	private BigDecimal importe;
	private BigDecimal importeIvaRetenido;
	private BigDecimal importeIsrRetenido;
	private BigDecimal importeIvaTrasladado;
	private Date fechaTimbrado;
	private String selloCfd;
	private String numCertificadoSat;
	private String selloSat;
	private String uuid;
	private Date fechaRecibo;
	private int estadoRentasId;
	private String ruta;
	private String comentarios;
	private String rfcTercero;
	private String nombreTercero;
	private String calleTercero;
	private String numExtTercero;
	private String numIntTercero;
	private String coloniaTercero;
	private String localidadTercero;
	private String municipioTercero;
	private String estadoTercero;
	private String paisTercero;
	private String codigoPostalTercero;
	private String regimen;
	private Integer impresion;
	private Date fechaImpresion;
	private String correo;
	private BigDecimal impIvaRetCalc;
	private BigDecimal impIvaTrasCalc;
	private BigDecimal impIsrRetCalc;
	private BigDecimal totalCalc;

	public FacturaElectroArrendador() {
	}

	public FacturaElectroArrendador(int arrendadoresId, Date fechaFactura, String sello, BigDecimal subtotal,
			BigDecimal total, String rfcEmisor, String nombreEmisor, String calleEmisor, String rfcTtb,
			String nombreTtb, String calleTtb, String cantidad, String descripcion, BigDecimal valorUnitario,
			BigDecimal importe, Date fechaTimbrado, String selloCfd, String numCertificadoSat, String selloSat,
			String uuid, Date fechaRecibo, int estadoRentasId) {
		this.arrendadoresId = arrendadoresId;
		this.fechaFactura = fechaFactura;
		this.sello = sello;
		this.subtotal = subtotal;
		this.total = total;
		this.rfcEmisor = rfcEmisor;
		this.nombreEmisor = nombreEmisor;
		this.calleEmisor = calleEmisor;
		this.rfcTtb = rfcTtb;
		this.nombreTtb = nombreTtb;
		this.calleTtb = calleTtb;
		this.cantidad = cantidad;
		this.descripcion = descripcion;
		this.valorUnitario = valorUnitario;
		this.importe = importe;
		this.fechaTimbrado = fechaTimbrado;
		this.selloCfd = selloCfd;
		this.numCertificadoSat = numCertificadoSat;
		this.selloSat = selloSat;
		this.uuid = uuid;
		this.fechaRecibo = fechaRecibo;
		this.estadoRentasId = estadoRentasId;
	}

	public FacturaElectroArrendador(int arrendadoresId, String folio, String serie, Date fechaFactura, String sello,
			String formaPago, String numCertificado, String certificado, String moneda, String tipoComprobante,
			String metodoPago, String lugarExpedicion, BigDecimal subtotal, BigDecimal descuento, BigDecimal total,
			String rfcEmisor, String nombreEmisor, String calleEmisor, String numExtEmisor, String numIntEmisor,
			String coloniaEmisor, String localidadEmisor, String municipioEmisor, String estadoEmisor,
			String paisEmisor, String codigoPostalEmisor, String rfcTtb, String nombreTtb, String calleTtb,
			String numExtTtb, String numIntTtb, String coloniaTtb, String localidadTtb, String paisTtb,
			String codigoPostalTtb, String cantidad, String descripcion, BigDecimal valorUnitario, BigDecimal importe,
			BigDecimal importeIvaRetenido, BigDecimal importeIsrRetenido, BigDecimal importeIvaTrasladado,
			Date fechaTimbrado, String selloCfd, String numCertificadoSat, String selloSat, String uuid,
			Date fechaRecibo, int estadoRentasId, String ruta, String comentarios, String rfcTercero,
			String nombreTercero, String calleTercero, String numExtTercero, String numIntTercero,
			String coloniaTercero, String localidadTercero, String municipioTercero, String estadoTercero,
			String paisTercero, String codigoPostalTercero, String regimen, Integer impresion, Date fechaImpresion,
			String correo, BigDecimal impIvaRetCalc, BigDecimal impIvaTrasCalc, BigDecimal impIsrRetCalc,
			BigDecimal totalCalc) {
		this.arrendadoresId = arrendadoresId;
		this.folio = folio;
		this.serie = serie;
		this.fechaFactura = fechaFactura;
		this.sello = sello;
		this.formaPago = formaPago;
		this.numCertificado = numCertificado;
		this.certificado = certificado;
		this.moneda = moneda;
		this.tipoComprobante = tipoComprobante;
		this.metodoPago = metodoPago;
		this.lugarExpedicion = lugarExpedicion;
		this.subtotal = subtotal;
		this.descuento = descuento;
		this.total = total;
		this.rfcEmisor = rfcEmisor;
		this.nombreEmisor = nombreEmisor;
		this.calleEmisor = calleEmisor;
		this.numExtEmisor = numExtEmisor;
		this.numIntEmisor = numIntEmisor;
		this.coloniaEmisor = coloniaEmisor;
		this.localidadEmisor = localidadEmisor;
		this.municipioEmisor = municipioEmisor;
		this.estadoEmisor = estadoEmisor;
		this.paisEmisor = paisEmisor;
		this.codigoPostalEmisor = codigoPostalEmisor;
		this.rfcTtb = rfcTtb;
		this.nombreTtb = nombreTtb;
		this.calleTtb = calleTtb;
		this.numExtTtb = numExtTtb;
		this.numIntTtb = numIntTtb;
		this.coloniaTtb = coloniaTtb;
		this.localidadTtb = localidadTtb;
		this.paisTtb = paisTtb;
		this.codigoPostalTtb = codigoPostalTtb;
		this.cantidad = cantidad;
		this.descripcion = descripcion;
		this.valorUnitario = valorUnitario;
		this.importe = importe;
		this.importeIvaRetenido = importeIvaRetenido;
		this.importeIsrRetenido = importeIsrRetenido;
		this.importeIvaTrasladado = importeIvaTrasladado;
		this.fechaTimbrado = fechaTimbrado;
		this.selloCfd = selloCfd;
		this.numCertificadoSat = numCertificadoSat;
		this.selloSat = selloSat;
		this.uuid = uuid;
		this.fechaRecibo = fechaRecibo;
		this.estadoRentasId = estadoRentasId;
		this.ruta = ruta;
		this.comentarios = comentarios;
		this.rfcTercero = rfcTercero;
		this.nombreTercero = nombreTercero;
		this.calleTercero = calleTercero;
		this.numExtTercero = numExtTercero;
		this.numIntTercero = numIntTercero;
		this.coloniaTercero = coloniaTercero;
		this.localidadTercero = localidadTercero;
		this.municipioTercero = municipioTercero;
		this.estadoTercero = estadoTercero;
		this.paisTercero = paisTercero;
		this.codigoPostalTercero = codigoPostalTercero;
		this.regimen = regimen;
		this.impresion = impresion;
		this.fechaImpresion = fechaImpresion;
		this.correo = correo;
		this.impIvaRetCalc = impIvaRetCalc;
		this.impIvaTrasCalc = impIvaTrasCalc;
		this.impIsrRetCalc = impIsrRetCalc;
		this.totalCalc = totalCalc;
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

	@Column(name = "arrendadores_id", nullable = false)
	public int getArrendadoresId() {
		return this.arrendadoresId;
	}

	public void setArrendadoresId(int arrendadoresId) {
		this.arrendadoresId = arrendadoresId;
	}

	@Column(name = "folio", length = 20)
	public String getFolio() {
		return this.folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	@Column(name = "serie", length = 25)
	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_factura", nullable = false, length = 10)
	public Date getFechaFactura() {
		return this.fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	@Column(name = "sello", nullable = false, length = 65535)
	public String getSello() {
		return this.sello;
	}

	public void setSello(String sello) {
		this.sello = sello;
	}

	@Column(name = "forma_pago", length = 100)
	public String getFormaPago() {
		return this.formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	@Column(name = "num_certificado", length = 45)
	public String getNumCertificado() {
		return this.numCertificado;
	}

	public void setNumCertificado(String numCertificado) {
		this.numCertificado = numCertificado;
	}

	@Column(name = "certificado", length = 65535)
	public String getCertificado() {
		return this.certificado;
	}

	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}

	@Column(name = "moneda", length = 25)
	public String getMoneda() {
		return this.moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	@Column(name = "tipo_comprobante", length = 25)
	public String getTipoComprobante() {
		return this.tipoComprobante;
	}

	public void setTipoComprobante(String tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}

	@Column(name = "metodo_pago", length = 150)
	public String getMetodoPago() {
		return this.metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	@Column(name = "lugar_expedicion", length = 65535)
	public String getLugarExpedicion() {
		return this.lugarExpedicion;
	}

	public void setLugarExpedicion(String lugarExpedicion) {
		this.lugarExpedicion = lugarExpedicion;
	}

	@Column(name = "subtotal", nullable = false, precision = 10)
	public BigDecimal getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	@Column(name = "descuento", precision = 10)
	public BigDecimal getDescuento() {
		return this.descuento;
	}

	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}

	@Column(name = "total", nullable = false, precision = 10)
	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@Column(name = "rfc_emisor", nullable = false, length = 25)
	public String getRfcEmisor() {
		return this.rfcEmisor;
	}

	public void setRfcEmisor(String rfcEmisor) {
		this.rfcEmisor = rfcEmisor;
	}

	@Column(name = "nombre_emisor", nullable = false, length = 250)
	public String getNombreEmisor() {
		return this.nombreEmisor;
	}

	public void setNombreEmisor(String nombreEmisor) {
		this.nombreEmisor = nombreEmisor;
	}

	@Column(name = "calle_emisor", nullable = false, length = 150)
	public String getCalleEmisor() {
		return this.calleEmisor;
	}

	public void setCalleEmisor(String calleEmisor) {
		this.calleEmisor = calleEmisor;
	}

	@Column(name = "num_ext_emisor", length = 20)
	public String getNumExtEmisor() {
		return this.numExtEmisor;
	}

	public void setNumExtEmisor(String numExtEmisor) {
		this.numExtEmisor = numExtEmisor;
	}

	@Column(name = "num_int_emisor", length = 20)
	public String getNumIntEmisor() {
		return this.numIntEmisor;
	}

	public void setNumIntEmisor(String numIntEmisor) {
		this.numIntEmisor = numIntEmisor;
	}

	@Column(name = "colonia_emisor", length = 45)
	public String getColoniaEmisor() {
		return this.coloniaEmisor;
	}

	public void setColoniaEmisor(String coloniaEmisor) {
		this.coloniaEmisor = coloniaEmisor;
	}

	@Column(name = "localidad_emisor", length = 45)
	public String getLocalidadEmisor() {
		return this.localidadEmisor;
	}

	public void setLocalidadEmisor(String localidadEmisor) {
		this.localidadEmisor = localidadEmisor;
	}

	@Column(name = "municipio_emisor", length = 45)
	public String getMunicipioEmisor() {
		return this.municipioEmisor;
	}

	public void setMunicipioEmisor(String municipioEmisor) {
		this.municipioEmisor = municipioEmisor;
	}

	@Column(name = "estado_emisor", length = 45)
	public String getEstadoEmisor() {
		return this.estadoEmisor;
	}

	public void setEstadoEmisor(String estadoEmisor) {
		this.estadoEmisor = estadoEmisor;
	}

	@Column(name = "pais_emisor", length = 25)
	public String getPaisEmisor() {
		return this.paisEmisor;
	}

	public void setPaisEmisor(String paisEmisor) {
		this.paisEmisor = paisEmisor;
	}

	@Column(name = "codigo_postal_emisor", length = 25)
	public String getCodigoPostalEmisor() {
		return this.codigoPostalEmisor;
	}

	public void setCodigoPostalEmisor(String codigoPostalEmisor) {
		this.codigoPostalEmisor = codigoPostalEmisor;
	}

	@Column(name = "rfc_ttb", nullable = false, length = 25)
	public String getRfcTtb() {
		return this.rfcTtb;
	}

	public void setRfcTtb(String rfcTtb) {
		this.rfcTtb = rfcTtb;
	}

	@Column(name = "nombre_ttb", nullable = false, length = 250)
	public String getNombreTtb() {
		return this.nombreTtb;
	}

	public void setNombreTtb(String nombreTtb) {
		this.nombreTtb = nombreTtb;
	}

	@Column(name = "calle_ttb", nullable = false, length = 150)
	public String getCalleTtb() {
		return this.calleTtb;
	}

	public void setCalleTtb(String calleTtb) {
		this.calleTtb = calleTtb;
	}

	@Column(name = "num_ext_ttb", length = 20)
	public String getNumExtTtb() {
		return this.numExtTtb;
	}

	public void setNumExtTtb(String numExtTtb) {
		this.numExtTtb = numExtTtb;
	}

	@Column(name = "num_int_ttb", length = 40)
	public String getNumIntTtb() {
		return this.numIntTtb;
	}

	public void setNumIntTtb(String numIntTtb) {
		this.numIntTtb = numIntTtb;
	}

	@Column(name = "colonia_ttb", length = 45)
	public String getColoniaTtb() {
		return this.coloniaTtb;
	}

	public void setColoniaTtb(String coloniaTtb) {
		this.coloniaTtb = coloniaTtb;
	}

	@Column(name = "localidad_ttb", length = 25)
	public String getLocalidadTtb() {
		return this.localidadTtb;
	}

	public void setLocalidadTtb(String localidadTtb) {
		this.localidadTtb = localidadTtb;
	}

	@Column(name = "pais_ttb", length = 25)
	public String getPaisTtb() {
		return this.paisTtb;
	}

	public void setPaisTtb(String paisTtb) {
		this.paisTtb = paisTtb;
	}

	@Column(name = "codigo_postal_ttb", length = 25)
	public String getCodigoPostalTtb() {
		return this.codigoPostalTtb;
	}

	public void setCodigoPostalTtb(String codigoPostalTtb) {
		this.codigoPostalTtb = codigoPostalTtb;
	}

	@Column(name = "cantidad", nullable = false, length = 25)
	public String getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	@Column(name = "descripcion", nullable = false, length = 65535)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "valor_unitario", nullable = false, precision = 10)
	public BigDecimal getValorUnitario() {
		return this.valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	@Column(name = "importe", nullable = false, precision = 10)
	public BigDecimal getImporte() {
		return this.importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	@Column(name = "importe_iva_retenido", precision = 10)
	public BigDecimal getImporteIvaRetenido() {
		return this.importeIvaRetenido;
	}

	public void setImporteIvaRetenido(BigDecimal importeIvaRetenido) {
		this.importeIvaRetenido = importeIvaRetenido;
	}

	@Column(name = "importe_isr_retenido", precision = 10)
	public BigDecimal getImporteIsrRetenido() {
		return this.importeIsrRetenido;
	}

	public void setImporteIsrRetenido(BigDecimal importeIsrRetenido) {
		this.importeIsrRetenido = importeIsrRetenido;
	}

	@Column(name = "importe_iva_trasladado", precision = 10)
	public BigDecimal getImporteIvaTrasladado() {
		return this.importeIvaTrasladado;
	}

	public void setImporteIvaTrasladado(BigDecimal importeIvaTrasladado) {
		this.importeIvaTrasladado = importeIvaTrasladado;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_timbrado", nullable = false, length = 19)
	public Date getFechaTimbrado() {
		return this.fechaTimbrado;
	}

	public void setFechaTimbrado(Date fechaTimbrado) {
		this.fechaTimbrado = fechaTimbrado;
	}

	@Column(name = "sello_CFD", nullable = false, length = 65535)
	public String getSelloCfd() {
		return this.selloCfd;
	}

	public void setSelloCfd(String selloCfd) {
		this.selloCfd = selloCfd;
	}

	@Column(name = "num_certificado_sat", nullable = false, length = 100)
	public String getNumCertificadoSat() {
		return this.numCertificadoSat;
	}

	public void setNumCertificadoSat(String numCertificadoSat) {
		this.numCertificadoSat = numCertificadoSat;
	}

	@Column(name = "sello_sat", nullable = false, length = 65535)
	public String getSelloSat() {
		return this.selloSat;
	}

	public void setSelloSat(String selloSat) {
		this.selloSat = selloSat;
	}

	@Column(name = "uuid", nullable = false, length = 200)
	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_recibo", nullable = false, length = 19)
	public Date getFechaRecibo() {
		return this.fechaRecibo;
	}

	public void setFechaRecibo(Date fechaRecibo) {
		this.fechaRecibo = fechaRecibo;
	}

	@Column(name = "estado_rentas_id", nullable = false)
	public int getEstadoRentasId() {
		return this.estadoRentasId;
	}

	public void setEstadoRentasId(int estadoRentasId) {
		this.estadoRentasId = estadoRentasId;
	}

	@Column(name = "ruta", length = 500)
	public String getRuta() {
		return this.ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	@Column(name = "comentarios")
	public String getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Column(name = "rfc_tercero", length = 45)
	public String getRfcTercero() {
		return this.rfcTercero;
	}

	public void setRfcTercero(String rfcTercero) {
		this.rfcTercero = rfcTercero;
	}

	@Column(name = "nombre_tercero", length = 250)
	public String getNombreTercero() {
		return this.nombreTercero;
	}

	public void setNombreTercero(String nombreTercero) {
		this.nombreTercero = nombreTercero;
	}

	@Column(name = "calle_tercero", length = 150)
	public String getCalleTercero() {
		return this.calleTercero;
	}

	public void setCalleTercero(String calleTercero) {
		this.calleTercero = calleTercero;
	}

	@Column(name = "num_ext_tercero", length = 20)
	public String getNumExtTercero() {
		return this.numExtTercero;
	}

	public void setNumExtTercero(String numExtTercero) {
		this.numExtTercero = numExtTercero;
	}

	@Column(name = "num_int_tercero", length = 20)
	public String getNumIntTercero() {
		return this.numIntTercero;
	}

	public void setNumIntTercero(String numIntTercero) {
		this.numIntTercero = numIntTercero;
	}

	@Column(name = "colonia_tercero", length = 45)
	public String getColoniaTercero() {
		return this.coloniaTercero;
	}

	public void setColoniaTercero(String coloniaTercero) {
		this.coloniaTercero = coloniaTercero;
	}

	@Column(name = "localidad_tercero", length = 45)
	public String getLocalidadTercero() {
		return this.localidadTercero;
	}

	public void setLocalidadTercero(String localidadTercero) {
		this.localidadTercero = localidadTercero;
	}

	@Column(name = "municipio_tercero", length = 45)
	public String getMunicipioTercero() {
		return this.municipioTercero;
	}

	public void setMunicipioTercero(String municipioTercero) {
		this.municipioTercero = municipioTercero;
	}

	@Column(name = "estado_tercero", length = 45)
	public String getEstadoTercero() {
		return this.estadoTercero;
	}

	public void setEstadoTercero(String estadoTercero) {
		this.estadoTercero = estadoTercero;
	}

	@Column(name = "pais_tercero", length = 45)
	public String getPaisTercero() {
		return this.paisTercero;
	}

	public void setPaisTercero(String paisTercero) {
		this.paisTercero = paisTercero;
	}

	@Column(name = "codigo_postal_tercero", length = 45)
	public String getCodigoPostalTercero() {
		return this.codigoPostalTercero;
	}

	public void setCodigoPostalTercero(String codigoPostalTercero) {
		this.codigoPostalTercero = codigoPostalTercero;
	}

	@Column(name = "regimen", length = 250)
	public String getRegimen() {
		return this.regimen;
	}

	public void setRegimen(String regimen) {
		this.regimen = regimen;
	}

	@Column(name = "impresion")
	public Integer getImpresion() {
		return this.impresion;
	}

	public void setImpresion(Integer impresion) {
		this.impresion = impresion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_impresion", length = 19)
	public Date getFechaImpresion() {
		return this.fechaImpresion;
	}

	public void setFechaImpresion(Date fechaImpresion) {
		this.fechaImpresion = fechaImpresion;
	}

	@Column(name = "correo", length = 200)
	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Column(name = "imp_iva_ret_calc", precision = 10)
	public BigDecimal getImpIvaRetCalc() {
		return this.impIvaRetCalc;
	}

	public void setImpIvaRetCalc(BigDecimal impIvaRetCalc) {
		this.impIvaRetCalc = impIvaRetCalc;
	}

	@Column(name = "imp_iva_tras_calc", precision = 10)
	public BigDecimal getImpIvaTrasCalc() {
		return this.impIvaTrasCalc;
	}

	public void setImpIvaTrasCalc(BigDecimal impIvaTrasCalc) {
		this.impIvaTrasCalc = impIvaTrasCalc;
	}

	@Column(name = "imp_isr_ret_calc", precision = 10)
	public BigDecimal getImpIsrRetCalc() {
		return this.impIsrRetCalc;
	}

	public void setImpIsrRetCalc(BigDecimal impIsrRetCalc) {
		this.impIsrRetCalc = impIsrRetCalc;
	}

	@Column(name = "total_calc", precision = 10)
	public BigDecimal getTotalCalc() {
		return this.totalCalc;
	}

	public void setTotalCalc(BigDecimal totalCalc) {
		this.totalCalc = totalCalc;
	}

}
