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
 * LogAplicacion generated by hbm2java
 */
@Entity
@Table(name = "log_aplicacion", catalog = "itaid")
public class LogAplicacion implements java.io.Serializable {

	private Integer id;
	private int aplicacionId;
	private String pantalla;
	private String tiempo;
	private String registro;
	private String comentario;
	private int userid;
	private Date fecha;

	public LogAplicacion() {
	}

	public LogAplicacion(int aplicacionId, String pantalla, String tiempo, String registro, String comentario,
			int userid, Date fecha) {
		this.aplicacionId = aplicacionId;
		this.pantalla = pantalla;
		this.tiempo = tiempo;
		this.registro = registro;
		this.comentario = comentario;
		this.userid = userid;
		this.fecha = fecha;
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

	@Column(name = "aplicacion_id", nullable = false)
	public int getAplicacionId() {
		return this.aplicacionId;
	}

	public void setAplicacionId(int aplicacionId) {
		this.aplicacionId = aplicacionId;
	}

	@Column(name = "pantalla", nullable = false)
	public String getPantalla() {
		return this.pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	@Column(name = "tiempo", nullable = false, length = 20)
	public String getTiempo() {
		return this.tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	@Column(name = "registro", nullable = false)
	public String getRegistro() {
		return this.registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	@Column(name = "comentario", nullable = false, length = 65535)
	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Column(name = "userid", nullable = false)
	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", nullable = false, length = 19)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
