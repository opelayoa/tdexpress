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
 * Ticket generated by hbm2java
 */
@Entity
@Table(name = "ticket", catalog = "itaid")
public class Ticket implements java.io.Serializable {

	private Integer id;
	private String observaciones;
	private Byte solucionremota;
	private Date fechaapertura;
	private Date fechaactualizacion;
	private Date fechasolucion;
	private Date fechacierre;
	private int solicitanteId;
	private int lugarId;
	private int sintomaId;
	private Integer diagnosticoId;
	private Integer posibleorigenId;
	private Integer solucionestandardId;
	private int estadoId;
	private Integer tecnicoId;
	private int capturistaId;
	private Integer tipo;
	private Integer esperaUsuarioId;
	private Integer esperaProveedorId;
	private Integer impMotivoId;
	private Integer impSolucionId;
	private String archivo;
	private String leyenda;
	private Integer diasAbierto;
	private int categoria;
	private Integer statuspId;
	private String vencido;
	private byte interfaz;
	private byte hijo;
	private byte correo;
	private Date fechaaperturaf;
	private Date fechaaperturah;
	private Date fechaactualizacionf;
	private Date fechaactualizacionh;
	private Date fechacierref;
	private Date fechacierreh;
	private Date fechasolucionf;
	private Date fechasolucionh;

	public Ticket() {
	}

	public Ticket(String observaciones, Date fechaapertura, int solicitanteId, int lugarId, int sintomaId, int estadoId,
			int capturistaId, int categoria, byte interfaz, byte hijo, byte correo) {
		this.observaciones = observaciones;
		this.fechaapertura = fechaapertura;
		this.solicitanteId = solicitanteId;
		this.lugarId = lugarId;
		this.sintomaId = sintomaId;
		this.estadoId = estadoId;
		this.capturistaId = capturistaId;
		this.categoria = categoria;
		this.interfaz = interfaz;
		this.hijo = hijo;
		this.correo = correo;
	}

	public Ticket(String observaciones, Byte solucionremota, Date fechaapertura, Date fechaactualizacion,
			Date fechasolucion, Date fechacierre, int solicitanteId, int lugarId, int sintomaId, Integer diagnosticoId,
			Integer posibleorigenId, Integer solucionestandardId, int estadoId, Integer tecnicoId, int capturistaId,
			Integer tipo, Integer esperaUsuarioId, Integer esperaProveedorId, Integer impMotivoId,
			Integer impSolucionId, String archivo, String leyenda, Integer diasAbierto, int categoria,
			Integer statuspId, String vencido, byte interfaz, byte hijo, byte correo, Date fechaaperturaf,
			Date fechaaperturah, Date fechaactualizacionf, Date fechaactualizacionh, Date fechacierref,
			Date fechacierreh, Date fechasolucionf, Date fechasolucionh) {
		this.observaciones = observaciones;
		this.solucionremota = solucionremota;
		this.fechaapertura = fechaapertura;
		this.fechaactualizacion = fechaactualizacion;
		this.fechasolucion = fechasolucion;
		this.fechacierre = fechacierre;
		this.solicitanteId = solicitanteId;
		this.lugarId = lugarId;
		this.sintomaId = sintomaId;
		this.diagnosticoId = diagnosticoId;
		this.posibleorigenId = posibleorigenId;
		this.solucionestandardId = solucionestandardId;
		this.estadoId = estadoId;
		this.tecnicoId = tecnicoId;
		this.capturistaId = capturistaId;
		this.tipo = tipo;
		this.esperaUsuarioId = esperaUsuarioId;
		this.esperaProveedorId = esperaProveedorId;
		this.impMotivoId = impMotivoId;
		this.impSolucionId = impSolucionId;
		this.archivo = archivo;
		this.leyenda = leyenda;
		this.diasAbierto = diasAbierto;
		this.categoria = categoria;
		this.statuspId = statuspId;
		this.vencido = vencido;
		this.interfaz = interfaz;
		this.hijo = hijo;
		this.correo = correo;
		this.fechaaperturaf = fechaaperturaf;
		this.fechaaperturah = fechaaperturah;
		this.fechaactualizacionf = fechaactualizacionf;
		this.fechaactualizacionh = fechaactualizacionh;
		this.fechacierref = fechacierref;
		this.fechacierreh = fechacierreh;
		this.fechasolucionf = fechasolucionf;
		this.fechasolucionh = fechasolucionh;
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

	@Column(name = "observaciones", nullable = false)
	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Column(name = "solucionremota")
	public Byte getSolucionremota() {
		return this.solucionremota;
	}

	public void setSolucionremota(Byte solucionremota) {
		this.solucionremota = solucionremota;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaapertura", nullable = false, length = 19)
	public Date getFechaapertura() {
		return this.fechaapertura;
	}

	public void setFechaapertura(Date fechaapertura) {
		this.fechaapertura = fechaapertura;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaactualizacion", length = 19)
	public Date getFechaactualizacion() {
		return this.fechaactualizacion;
	}

	public void setFechaactualizacion(Date fechaactualizacion) {
		this.fechaactualizacion = fechaactualizacion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechasolucion", length = 19)
	public Date getFechasolucion() {
		return this.fechasolucion;
	}

	public void setFechasolucion(Date fechasolucion) {
		this.fechasolucion = fechasolucion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechacierre", length = 19)
	public Date getFechacierre() {
		return this.fechacierre;
	}

	public void setFechacierre(Date fechacierre) {
		this.fechacierre = fechacierre;
	}

	@Column(name = "solicitante_id", nullable = false)
	public int getSolicitanteId() {
		return this.solicitanteId;
	}

	public void setSolicitanteId(int solicitanteId) {
		this.solicitanteId = solicitanteId;
	}

	@Column(name = "lugar_id", nullable = false)
	public int getLugarId() {
		return this.lugarId;
	}

	public void setLugarId(int lugarId) {
		this.lugarId = lugarId;
	}

	@Column(name = "sintoma_id", nullable = false)
	public int getSintomaId() {
		return this.sintomaId;
	}

	public void setSintomaId(int sintomaId) {
		this.sintomaId = sintomaId;
	}

	@Column(name = "diagnostico_id")
	public Integer getDiagnosticoId() {
		return this.diagnosticoId;
	}

	public void setDiagnosticoId(Integer diagnosticoId) {
		this.diagnosticoId = diagnosticoId;
	}

	@Column(name = "posibleorigen_id")
	public Integer getPosibleorigenId() {
		return this.posibleorigenId;
	}

	public void setPosibleorigenId(Integer posibleorigenId) {
		this.posibleorigenId = posibleorigenId;
	}

	@Column(name = "solucionestandard_id")
	public Integer getSolucionestandardId() {
		return this.solucionestandardId;
	}

	public void setSolucionestandardId(Integer solucionestandardId) {
		this.solucionestandardId = solucionestandardId;
	}

	@Column(name = "estado_id", nullable = false)
	public int getEstadoId() {
		return this.estadoId;
	}

	public void setEstadoId(int estadoId) {
		this.estadoId = estadoId;
	}

	@Column(name = "tecnico_id")
	public Integer getTecnicoId() {
		return this.tecnicoId;
	}

	public void setTecnicoId(Integer tecnicoId) {
		this.tecnicoId = tecnicoId;
	}

	@Column(name = "capturista_id", nullable = false)
	public int getCapturistaId() {
		return this.capturistaId;
	}

	public void setCapturistaId(int capturistaId) {
		this.capturistaId = capturistaId;
	}

	@Column(name = "tipo")
	public Integer getTipo() {
		return this.tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	@Column(name = "espera_usuario_id")
	public Integer getEsperaUsuarioId() {
		return this.esperaUsuarioId;
	}

	public void setEsperaUsuarioId(Integer esperaUsuarioId) {
		this.esperaUsuarioId = esperaUsuarioId;
	}

	@Column(name = "espera_proveedor_id")
	public Integer getEsperaProveedorId() {
		return this.esperaProveedorId;
	}

	public void setEsperaProveedorId(Integer esperaProveedorId) {
		this.esperaProveedorId = esperaProveedorId;
	}

	@Column(name = "imp_motivo_id")
	public Integer getImpMotivoId() {
		return this.impMotivoId;
	}

	public void setImpMotivoId(Integer impMotivoId) {
		this.impMotivoId = impMotivoId;
	}

	@Column(name = "imp_solucion_id")
	public Integer getImpSolucionId() {
		return this.impSolucionId;
	}

	public void setImpSolucionId(Integer impSolucionId) {
		this.impSolucionId = impSolucionId;
	}

	@Column(name = "archivo", length = 250)
	public String getArchivo() {
		return this.archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	@Column(name = "leyenda", length = 45)
	public String getLeyenda() {
		return this.leyenda;
	}

	public void setLeyenda(String leyenda) {
		this.leyenda = leyenda;
	}

	@Column(name = "dias_abierto")
	public Integer getDiasAbierto() {
		return this.diasAbierto;
	}

	public void setDiasAbierto(Integer diasAbierto) {
		this.diasAbierto = diasAbierto;
	}

	@Column(name = "categoria", nullable = false)
	public int getCategoria() {
		return this.categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	@Column(name = "statusp_id")
	public Integer getStatuspId() {
		return this.statuspId;
	}

	public void setStatuspId(Integer statuspId) {
		this.statuspId = statuspId;
	}

	@Column(name = "vencido", length = 20)
	public String getVencido() {
		return this.vencido;
	}

	public void setVencido(String vencido) {
		this.vencido = vencido;
	}

	@Column(name = "interfaz", nullable = false)
	public byte getInterfaz() {
		return this.interfaz;
	}

	public void setInterfaz(byte interfaz) {
		this.interfaz = interfaz;
	}

	@Column(name = "hijo", nullable = false)
	public byte getHijo() {
		return this.hijo;
	}

	public void setHijo(byte hijo) {
		this.hijo = hijo;
	}

	@Column(name = "correo", nullable = false)
	public byte getCorreo() {
		return this.correo;
	}

	public void setCorreo(byte correo) {
		this.correo = correo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechaaperturaf", length = 10)
	public Date getFechaaperturaf() {
		return this.fechaaperturaf;
	}

	public void setFechaaperturaf(Date fechaaperturaf) {
		this.fechaaperturaf = fechaaperturaf;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "fechaaperturah", length = 8)
	public Date getFechaaperturah() {
		return this.fechaaperturah;
	}

	public void setFechaaperturah(Date fechaaperturah) {
		this.fechaaperturah = fechaaperturah;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechaactualizacionf", length = 10)
	public Date getFechaactualizacionf() {
		return this.fechaactualizacionf;
	}

	public void setFechaactualizacionf(Date fechaactualizacionf) {
		this.fechaactualizacionf = fechaactualizacionf;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "fechaactualizacionh", length = 8)
	public Date getFechaactualizacionh() {
		return this.fechaactualizacionh;
	}

	public void setFechaactualizacionh(Date fechaactualizacionh) {
		this.fechaactualizacionh = fechaactualizacionh;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechacierref", length = 10)
	public Date getFechacierref() {
		return this.fechacierref;
	}

	public void setFechacierref(Date fechacierref) {
		this.fechacierref = fechacierref;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "fechacierreh", length = 8)
	public Date getFechacierreh() {
		return this.fechacierreh;
	}

	public void setFechacierreh(Date fechacierreh) {
		this.fechacierreh = fechacierreh;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechasolucionf", length = 10)
	public Date getFechasolucionf() {
		return this.fechasolucionf;
	}

	public void setFechasolucionf(Date fechasolucionf) {
		this.fechasolucionf = fechasolucionf;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "fechasolucionh", length = 8)
	public Date getFechasolucionh() {
		return this.fechasolucionh;
	}

	public void setFechasolucionh(Date fechasolucionh) {
		this.fechasolucionh = fechasolucionh;
	}

}