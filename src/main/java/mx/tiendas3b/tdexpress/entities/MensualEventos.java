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
 * MensualEventos generated by hbm2java
 */
@Entity
@Table(name = "mensual_eventos", catalog = "itaid")
public class MensualEventos implements java.io.Serializable {

	private Integer id;
	private int headerEventoId;
	private String mes;
	private Date fechaInicio;
	private Date fechaFin;
	private Date fechahora;
	private boolean status;

	public MensualEventos() {
	}

	public MensualEventos(int headerEventoId, String mes, Date fechaInicio, Date fechaFin, Date fechahora,
			boolean status) {
		this.headerEventoId = headerEventoId;
		this.mes = mes;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
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

	@Column(name = "header_evento_id", nullable = false)
	public int getHeaderEventoId() {
		return this.headerEventoId;
	}

	public void setHeaderEventoId(int headerEventoId) {
		this.headerEventoId = headerEventoId;
	}

	@Column(name = "mes", nullable = false)
	public String getMes() {
		return this.mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_inicio", nullable = false, length = 10)
	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_fin", nullable = false, length = 10)
	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
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
