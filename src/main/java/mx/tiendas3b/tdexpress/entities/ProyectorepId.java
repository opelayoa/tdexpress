package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProyectorepId generated by hbm2java
 */
@Embeddable
public class ProyectorepId implements java.io.Serializable {

	private int id;
	private String proyecto;
	private String fase;
	private String tarea;
	private String descripcion;
	private String entregable;
	private String prioridad;
	private Date fechafinact;
	private short avance;
	private String observaciones;
	private String categoria;
	private String estado;
	private String tecnico;

	public ProyectorepId() {
	}

	public ProyectorepId(int id, String proyecto, String fase, String tarea, String descripcion, String prioridad,
			Date fechafinact, short avance, String estado) {
		this.id = id;
		this.proyecto = proyecto;
		this.fase = fase;
		this.tarea = tarea;
		this.descripcion = descripcion;
		this.prioridad = prioridad;
		this.fechafinact = fechafinact;
		this.avance = avance;
		this.estado = estado;
	}

	public ProyectorepId(int id, String proyecto, String fase, String tarea, String descripcion, String entregable,
			String prioridad, Date fechafinact, short avance, String observaciones, String categoria, String estado,
			String tecnico) {
		this.id = id;
		this.proyecto = proyecto;
		this.fase = fase;
		this.tarea = tarea;
		this.descripcion = descripcion;
		this.entregable = entregable;
		this.prioridad = prioridad;
		this.fechafinact = fechafinact;
		this.avance = avance;
		this.observaciones = observaciones;
		this.categoria = categoria;
		this.estado = estado;
		this.tecnico = tecnico;
	}

	@Column(name = "id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "proyecto", nullable = false, length = 30)
	public String getProyecto() {
		return this.proyecto;
	}

	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}

	@Column(name = "fase", nullable = false, length = 30)
	public String getFase() {
		return this.fase;
	}

	public void setFase(String fase) {
		this.fase = fase;
	}

	@Column(name = "tarea", nullable = false, length = 50)
	public String getTarea() {
		return this.tarea;
	}

	public void setTarea(String tarea) {
		this.tarea = tarea;
	}

	@Column(name = "descripcion", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "entregable", length = 35)
	public String getEntregable() {
		return this.entregable;
	}

	public void setEntregable(String entregable) {
		this.entregable = entregable;
	}

	@Column(name = "prioridad", nullable = false, length = 5)
	public String getPrioridad() {
		return this.prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	@Column(name = "fechafinact", nullable = false, length = 10)
	public Date getFechafinact() {
		return this.fechafinact;
	}

	public void setFechafinact(Date fechafinact) {
		this.fechafinact = fechafinact;
	}

	@Column(name = "avance", nullable = false, precision = 3, scale = 0)
	public short getAvance() {
		return this.avance;
	}

	public void setAvance(short avance) {
		this.avance = avance;
	}

	@Column(name = "observaciones")
	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Column(name = "categoria", length = 10)
	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Column(name = "estado", nullable = false, length = 20)
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Column(name = "tecnico", length = 51)
	public String getTecnico() {
		return this.tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProyectorepId))
			return false;
		ProyectorepId castOther = (ProyectorepId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getProyecto() == castOther.getProyecto()) || (this.getProyecto() != null
						&& castOther.getProyecto() != null && this.getProyecto().equals(castOther.getProyecto())))
				&& ((this.getFase() == castOther.getFase()) || (this.getFase() != null && castOther.getFase() != null
						&& this.getFase().equals(castOther.getFase())))
				&& ((this.getTarea() == castOther.getTarea()) || (this.getTarea() != null
						&& castOther.getTarea() != null && this.getTarea().equals(castOther.getTarea())))
				&& ((this.getDescripcion() == castOther.getDescripcion())
						|| (this.getDescripcion() != null && castOther.getDescripcion() != null
								&& this.getDescripcion().equals(castOther.getDescripcion())))
				&& ((this.getEntregable() == castOther.getEntregable()) || (this.getEntregable() != null
						&& castOther.getEntregable() != null && this.getEntregable().equals(castOther.getEntregable())))
				&& ((this.getPrioridad() == castOther.getPrioridad()) || (this.getPrioridad() != null
						&& castOther.getPrioridad() != null && this.getPrioridad().equals(castOther.getPrioridad())))
				&& ((this.getFechafinact() == castOther.getFechafinact())
						|| (this.getFechafinact() != null && castOther.getFechafinact() != null
								&& this.getFechafinact().equals(castOther.getFechafinact())))
				&& (this.getAvance() == castOther.getAvance())
				&& ((this.getObservaciones() == castOther.getObservaciones())
						|| (this.getObservaciones() != null && castOther.getObservaciones() != null
								&& this.getObservaciones().equals(castOther.getObservaciones())))
				&& ((this.getCategoria() == castOther.getCategoria()) || (this.getCategoria() != null
						&& castOther.getCategoria() != null && this.getCategoria().equals(castOther.getCategoria())))
				&& ((this.getEstado() == castOther.getEstado()) || (this.getEstado() != null
						&& castOther.getEstado() != null && this.getEstado().equals(castOther.getEstado())))
				&& ((this.getTecnico() == castOther.getTecnico()) || (this.getTecnico() != null
						&& castOther.getTecnico() != null && this.getTecnico().equals(castOther.getTecnico())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getProyecto() == null ? 0 : this.getProyecto().hashCode());
		result = 37 * result + (getFase() == null ? 0 : this.getFase().hashCode());
		result = 37 * result + (getTarea() == null ? 0 : this.getTarea().hashCode());
		result = 37 * result + (getDescripcion() == null ? 0 : this.getDescripcion().hashCode());
		result = 37 * result + (getEntregable() == null ? 0 : this.getEntregable().hashCode());
		result = 37 * result + (getPrioridad() == null ? 0 : this.getPrioridad().hashCode());
		result = 37 * result + (getFechafinact() == null ? 0 : this.getFechafinact().hashCode());
		result = 37 * result + this.getAvance();
		result = 37 * result + (getObservaciones() == null ? 0 : this.getObservaciones().hashCode());
		result = 37 * result + (getCategoria() == null ? 0 : this.getCategoria().hashCode());
		result = 37 * result + (getEstado() == null ? 0 : this.getEstado().hashCode());
		result = 37 * result + (getTecnico() == null ? 0 : this.getTecnico().hashCode());
		return result;
	}

}