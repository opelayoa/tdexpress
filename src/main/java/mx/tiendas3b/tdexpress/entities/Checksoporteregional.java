package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Checksoporteregional generated by hbm2java
 */
@Entity
@Table(name = "checksoporteregional", catalog = "itaid", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class Checksoporteregional implements java.io.Serializable {

	private ChecksoporteregionalId id;
	private int id_1;
	private String asunto;
	private Integer status;
	private String hora;
	private String comentario;
	private String usuario;

	public Checksoporteregional() {
	}

	public Checksoporteregional(ChecksoporteregionalId id, int id_1) {
		this.id = id;
		this.id_1 = id_1;
	}

	public Checksoporteregional(ChecksoporteregionalId id, int id_1, String asunto, Integer status, String hora,
			String comentario, String usuario) {
		this.id = id;
		this.id_1 = id_1;
		this.asunto = asunto;
		this.status = status;
		this.hora = hora;
		this.comentario = comentario;
		this.usuario = usuario;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "servidor", column = @Column(name = "servidor", nullable = false, length = 20)),
			@AttributeOverride(name = "fecha", column = @Column(name = "fecha", nullable = false, length = 10)),
			@AttributeOverride(name = "region", column = @Column(name = "region", nullable = false, length = 5)) })
	public ChecksoporteregionalId getId() {
		return this.id;
	}

	public void setId(ChecksoporteregionalId id) {
		this.id = id;
	}

	@Column(name = "id", unique = true, nullable = false)
	public int getId_1() {
		return this.id_1;
	}

	public void setId_1(int id_1) {
		this.id_1 = id_1;
	}

	@Column(name = "asunto", length = 50)
	public String getAsunto() {
		return this.asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	@Column(name = "STATUS")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "hora", length = 20)
	public String getHora() {
		return this.hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	@Column(name = "comentario", length = 200)
	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Column(name = "usuario", length = 50)
	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
