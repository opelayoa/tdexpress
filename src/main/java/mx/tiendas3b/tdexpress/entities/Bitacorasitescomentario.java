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
 * Bitacorasitescomentario generated by hbm2java
 */
@Entity
@Table(name = "bitacorasitescomentario", catalog = "itaid")
public class Bitacorasitescomentario implements java.io.Serializable {

	private Integer idactividad;
	private int iduser;
	private Date horario;
	private int piso;
	private String comentario;
	private int usercaptura;
	private Date fechacaptura;
	private int useractualiza;
	private Date fechaauditoria;

	public Bitacorasitescomentario() {
	}

	public Bitacorasitescomentario(int iduser, Date horario, int piso, String comentario, int usercaptura,
			Date fechacaptura, int useractualiza, Date fechaauditoria) {
		this.iduser = iduser;
		this.horario = horario;
		this.piso = piso;
		this.comentario = comentario;
		this.usercaptura = usercaptura;
		this.fechacaptura = fechacaptura;
		this.useractualiza = useractualiza;
		this.fechaauditoria = fechaauditoria;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idactividad", unique = true, nullable = false)
	public Integer getIdactividad() {
		return this.idactividad;
	}

	public void setIdactividad(Integer idactividad) {
		this.idactividad = idactividad;
	}

	@Column(name = "iduser", nullable = false)
	public int getIduser() {
		return this.iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "horario", nullable = false, length = 19)
	public Date getHorario() {
		return this.horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	@Column(name = "piso", nullable = false)
	public int getPiso() {
		return this.piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	@Column(name = "comentario", nullable = false, length = 65535)
	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Column(name = "usercaptura", nullable = false)
	public int getUsercaptura() {
		return this.usercaptura;
	}

	public void setUsercaptura(int usercaptura) {
		this.usercaptura = usercaptura;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechacaptura", nullable = false, length = 19)
	public Date getFechacaptura() {
		return this.fechacaptura;
	}

	public void setFechacaptura(Date fechacaptura) {
		this.fechacaptura = fechacaptura;
	}

	@Column(name = "useractualiza", nullable = false)
	public int getUseractualiza() {
		return this.useractualiza;
	}

	public void setUseractualiza(int useractualiza) {
		this.useractualiza = useractualiza;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaauditoria", nullable = false, length = 19)
	public Date getFechaauditoria() {
		return this.fechaauditoria;
	}

	public void setFechaauditoria(Date fechaauditoria) {
		this.fechaauditoria = fechaauditoria;
	}

}
