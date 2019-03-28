package mx.tiendas3b.tdexpress.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

import com.fasterxml.jackson.annotation.JsonFormat;

@NamedNativeQuery(name = "TicketInfo.getTicketInfoById", 
query = "select ticket.id, estado.nombre as estado, ticket.vencido, ticket.fechaaperturaf as fecha_apertura, ticket.fechasolucionf as fecha_solucion, \r\n" + 
		"	    ticket.leyenda, concat(solicitante.apellido, ', ', solicitante.nombre) as solicitante,\r\n" + 
		"       concat(tecnico.apellido, ', ', tecnico.nombre) as tecnico, categoria.descripcion as categoria,\r\n" + 
		"       tipo.nombre as tipo, ts.sintoma as sintoma, sd.diagnostico as diagnostico, \r\n" + 
		"       concat(lugar.numero3b, ' - ', lugar.nombre) as lugar, solucion.nombre as solucion, \r\n" + 
		"       ticket.solucionremota as solucion_remota, po.nombre as posible_origen, \r\n" + 
		"       ticket.fechaactualizacionf as fecha_actualizacion, concat(eu.apellido, ', ', eu.nombre) as esperando_usuario, \r\n" + 
		"       proveedor.razonsocial as esperando_proveedor, motivo.descripcion as improcedente_motivo, \r\n" + 
		"       ticket.fechacierref as fecha_cierre, ticket.observaciones, \r\n" + 
		"       concat(capturista.apellido, ', ', capturista.nombre) as capturista, ticket.correo as correo_manual, \r\n" + 
		"       sp.nombre as status_proyecto\r\n" + 
		"from ticket\r\n" + 
		"left join estado on ticket.estado_id = estado.id\r\n" + 
		"left join usuario solicitante on ticket.solicitante_id = solicitante.id\r\n" + 
		"left join usuario tecnico on ticket.tecnico_id = tecnico.id\r\n" + 
		"left join ticket_categoria categoria on ticket.categoria = categoria.id\r\n" + 
		"left join tipotd tipo on ticket.tipo = tipo.id\r\n" + 
		"left join tipo_sintoma ts on ticket.sintoma_id = ts.id\r\n" + 
		"left join sintoma_diagnostico sd on ticket.diagnostico_id = sd.id\r\n" + 
		"left join sucursal lugar on ticket.lugar_id = lugar.id\r\n" + 
		"left join solucionestandard solucion on ticket.solucionestandard_id = solucion.id\r\n" + 
		"left join posibleorigen po on ticket.posibleorigen_id = po.id\r\n" + 
		"left join usuario eu on ticket.espera_usuario_id = eu.id\r\n" + 
		"left join proveedor on ticket.espera_proveedor_id = proveedor.id\r\n" + 
		"left join imp_cat_motivo motivo on ticket.imp_motivo_id = motivo.id\r\n" + 
		"left join usuario capturista on ticket.capturista_id = capturista.id\r\n" + 
		"left join status_proyectos sp on ticket.statusp_id = sp.id\r\n" + 
		"where ticket.id = ?1", resultClass = TicketInfo.class)
@Entity
public class TicketInfo {
	@Id
	private Integer id;
	private String estado;
	private String vencido;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date fechaApertura;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date fechaSolucion;
	private String leyenda;
	private String solicitante;
	private String tecnico;
	private String categoria;
	private String tipo;
	private String sintoma;
	private String diagnostico;
	private String lugar;
	private String solucion;
	private boolean solucionRemota;
	private String posibleOrigen;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date fechaActualizacion;
	private String esperandoUsuario;
	private String esperandoProveedor;
	private String improcedenteMotivo;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date fechaCierre;
	private String observaciones;
	private String capturista;
	private boolean correoManual;
	private String statusProyecto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String nombre) {
		this.estado = nombre;
	}

	public String getVencido() {
		return vencido;
	}

	public void setVencido(String vencido) {
		this.vencido = vencido;
	}

	public Date getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public Date getFechaSolucion() {
		return fechaSolucion;
	}

	public void setFechaSolucion(Date fechaSolucion) {
		this.fechaSolucion = fechaSolucion;
	}

	public String getLeyenda() {
		return leyenda;
	}

	public void setLeyenda(String leyenda) {
		this.leyenda = leyenda;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSintoma() {
		return sintoma;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getSolucion() {
		return solucion;
	}

	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}

	public boolean isSolucionRemota() {
		return solucionRemota;
	}

	public void setSolucionRemota(boolean solucionRemota) {
		this.solucionRemota = solucionRemota;
	}

	public String getPosibleOrigen() {
		return posibleOrigen;
	}

	public void setPosibleOrigen(String posibleOrigen) {
		this.posibleOrigen = posibleOrigen;
	}

	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public String getEsperandoUsuario() {
		return esperandoUsuario;
	}

	public void setEsperandoUsuario(String esperandoUsuario) {
		this.esperandoUsuario = esperandoUsuario;
	}

	public String getEsperandoProveedor() {
		return esperandoProveedor;
	}

	public void setEsperandoProveedor(String esperandoProveedor) {
		this.esperandoProveedor = esperandoProveedor;
	}

	public String getImprocedenteMotivo() {
		return improcedenteMotivo;
	}

	public void setImprocedenteMotivo(String improcedenteMotivo) {
		this.improcedenteMotivo = improcedenteMotivo;
	}

	public Date getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(Date fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getCapturista() {
		return capturista;
	}

	public void setCapturista(String capturista) {
		this.capturista = capturista;
	}

	public boolean isCorreoManual() {
		return correoManual;
	}

	public void setCorreoManual(boolean correoManual) {
		this.correoManual = correoManual;
	}

	public String getStatusProyecto() {
		return statusProyecto;
	}

	public void setStatusProyecto(String statusProyecto) {
		this.statusProyecto = statusProyecto;
	}

}
