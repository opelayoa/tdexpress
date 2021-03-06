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
 * Bitacorasitesmanto generated by hbm2java
 */
@Entity
@Table(name = "bitacorasitesmanto", catalog = "itaid")
public class Bitacorasitesmanto implements java.io.Serializable {

	private Integer id;
	private int piso;
	private Date fechamanto;
	private String comentario;
	private int user;
	private Date fechacaptura;
	private String comentariomanto;
	private Integer usermodify;
	private Integer estatus;

	public Bitacorasitesmanto() {
	}

	public Bitacorasitesmanto(int piso, Date fechamanto, String comentario, int user, Date fechacaptura) {
		this.piso = piso;
		this.fechamanto = fechamanto;
		this.comentario = comentario;
		this.user = user;
		this.fechacaptura = fechacaptura;
	}

	public Bitacorasitesmanto(int piso, Date fechamanto, String comentario, int user, Date fechacaptura,
			String comentariomanto, Integer usermodify, Integer estatus) {
		this.piso = piso;
		this.fechamanto = fechamanto;
		this.comentario = comentario;
		this.user = user;
		this.fechacaptura = fechacaptura;
		this.comentariomanto = comentariomanto;
		this.usermodify = usermodify;
		this.estatus = estatus;
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

	@Column(name = "piso", nullable = false)
	public int getPiso() {
		return this.piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechamanto", nullable = false, length = 19)
	public Date getFechamanto() {
		return this.fechamanto;
	}

	public void setFechamanto(Date fechamanto) {
		this.fechamanto = fechamanto;
	}

	@Column(name = "comentario", nullable = false)
	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Column(name = "user", nullable = false)
	public int getUser() {
		return this.user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechacaptura", nullable = false, length = 19)
	public Date getFechacaptura() {
		return this.fechacaptura;
	}

	public void setFechacaptura(Date fechacaptura) {
		this.fechacaptura = fechacaptura;
	}

	@Column(name = "comentariomanto")
	public String getComentariomanto() {
		return this.comentariomanto;
	}

	public void setComentariomanto(String comentariomanto) {
		this.comentariomanto = comentariomanto;
	}

	@Column(name = "usermodify")
	public Integer getUsermodify() {
		return this.usermodify;
	}

	public void setUsermodify(Integer usermodify) {
		this.usermodify = usermodify;
	}

	@Column(name = "estatus")
	public Integer getEstatus() {
		return this.estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

}
