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
 * HeaderEventos generated by hbm2java
 */
@Entity
@Table(name = "header_eventos", catalog = "itaid")
public class HeaderEventos implements java.io.Serializable {

	private Integer id;
	private int categoriaId;
	private int tipoId;
	private int encargadoId;
	private int solicitanteId;
	private String proyecto;
	private String descripcion;
	private String resultado;
	private Date fechahora;
	private boolean status;

	public HeaderEventos() {
	}

	public HeaderEventos(int categoriaId, int tipoId, int encargadoId, int solicitanteId, String proyecto,
			String descripcion, String resultado, Date fechahora, boolean status) {
		this.categoriaId = categoriaId;
		this.tipoId = tipoId;
		this.encargadoId = encargadoId;
		this.solicitanteId = solicitanteId;
		this.proyecto = proyecto;
		this.descripcion = descripcion;
		this.resultado = resultado;
		this.fechahora = fechahora;
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

	@Column(name = "categoria_id", nullable = false)
	public int getCategoriaId() {
		return this.categoriaId;
	}

	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
	}

	@Column(name = "tipo_id", nullable = false)
	public int getTipoId() {
		return this.tipoId;
	}

	public void setTipoId(int tipoId) {
		this.tipoId = tipoId;
	}

	@Column(name = "encargado_id", nullable = false)
	public int getEncargadoId() {
		return this.encargadoId;
	}

	public void setEncargadoId(int encargadoId) {
		this.encargadoId = encargadoId;
	}

	@Column(name = "solicitante_id", nullable = false)
	public int getSolicitanteId() {
		return this.solicitanteId;
	}

	public void setSolicitanteId(int solicitanteId) {
		this.solicitanteId = solicitanteId;
	}

	@Column(name = "proyecto", nullable = false)
	public String getProyecto() {
		return this.proyecto;
	}

	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}

	@Column(name = "descripcion", nullable = false, length = 65535)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "resultado", nullable = false, length = 65535)
	public String getResultado() {
		return this.resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechahora", nullable = false, length = 19)
	public Date getFechahora() {
		return this.fechahora;
	}

	public void setFechahora(Date fechahora) {
		this.fechahora = fechahora;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}