package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Table10ResId generated by hbm2java
 */
@Embeddable
public class Table10ResId implements java.io.Serializable {

	private Integer idCategoria;
	private String categoria;
	private String idModelo;
	private String modelo;
	private String marca;
	private String serie;
	private String tagCpu;
	private String usuario;
	private String departamento;
	private String usuarioId;

	public Table10ResId() {
	}

	public Table10ResId(Integer idCategoria, String categoria, String idModelo, String modelo, String marca,
			String serie, String tagCpu, String usuario, String departamento, String usuarioId) {
		this.idCategoria = idCategoria;
		this.categoria = categoria;
		this.idModelo = idModelo;
		this.modelo = modelo;
		this.marca = marca;
		this.serie = serie;
		this.tagCpu = tagCpu;
		this.usuario = usuario;
		this.departamento = departamento;
		this.usuarioId = usuarioId;
	}

	@Column(name = "Id Categoria")
	public Integer getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	@Column(name = "Categoria", length = 26)
	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Column(name = "Id Modelo", length = 10)
	public String getIdModelo() {
		return this.idModelo;
	}

	public void setIdModelo(String idModelo) {
		this.idModelo = idModelo;
	}

	@Column(name = "Modelo", length = 23)
	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Column(name = "Marca", length = 22)
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Column(name = "Serie", length = 24)
	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	@Column(name = "Tag CPU", length = 7)
	public String getTagCpu() {
		return this.tagCpu;
	}

	public void setTagCpu(String tagCpu) {
		this.tagCpu = tagCpu;
	}

	@Column(name = "Usuario", length = 28)
	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Column(name = "Departamento", length = 8)
	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Column(name = "usuario_id", length = 8)
	public String getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Table10ResId))
			return false;
		Table10ResId castOther = (Table10ResId) other;

		return ((this.getIdCategoria() == castOther.getIdCategoria()) || (this.getIdCategoria() != null
				&& castOther.getIdCategoria() != null && this.getIdCategoria().equals(castOther.getIdCategoria())))
				&& ((this.getCategoria() == castOther.getCategoria()) || (this.getCategoria() != null
						&& castOther.getCategoria() != null && this.getCategoria().equals(castOther.getCategoria())))
				&& ((this.getIdModelo() == castOther.getIdModelo()) || (this.getIdModelo() != null
						&& castOther.getIdModelo() != null && this.getIdModelo().equals(castOther.getIdModelo())))
				&& ((this.getModelo() == castOther.getModelo()) || (this.getModelo() != null
						&& castOther.getModelo() != null && this.getModelo().equals(castOther.getModelo())))
				&& ((this.getMarca() == castOther.getMarca()) || (this.getMarca() != null
						&& castOther.getMarca() != null && this.getMarca().equals(castOther.getMarca())))
				&& ((this.getSerie() == castOther.getSerie()) || (this.getSerie() != null
						&& castOther.getSerie() != null && this.getSerie().equals(castOther.getSerie())))
				&& ((this.getTagCpu() == castOther.getTagCpu()) || (this.getTagCpu() != null
						&& castOther.getTagCpu() != null && this.getTagCpu().equals(castOther.getTagCpu())))
				&& ((this.getUsuario() == castOther.getUsuario()) || (this.getUsuario() != null
						&& castOther.getUsuario() != null && this.getUsuario().equals(castOther.getUsuario())))
				&& ((this.getDepartamento() == castOther.getDepartamento())
						|| (this.getDepartamento() != null && castOther.getDepartamento() != null
								&& this.getDepartamento().equals(castOther.getDepartamento())))
				&& ((this.getUsuarioId() == castOther.getUsuarioId()) || (this.getUsuarioId() != null
						&& castOther.getUsuarioId() != null && this.getUsuarioId().equals(castOther.getUsuarioId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdCategoria() == null ? 0 : this.getIdCategoria().hashCode());
		result = 37 * result + (getCategoria() == null ? 0 : this.getCategoria().hashCode());
		result = 37 * result + (getIdModelo() == null ? 0 : this.getIdModelo().hashCode());
		result = 37 * result + (getModelo() == null ? 0 : this.getModelo().hashCode());
		result = 37 * result + (getMarca() == null ? 0 : this.getMarca().hashCode());
		result = 37 * result + (getSerie() == null ? 0 : this.getSerie().hashCode());
		result = 37 * result + (getTagCpu() == null ? 0 : this.getTagCpu().hashCode());
		result = 37 * result + (getUsuario() == null ? 0 : this.getUsuario().hashCode());
		result = 37 * result + (getDepartamento() == null ? 0 : this.getDepartamento().hashCode());
		result = 37 * result + (getUsuarioId() == null ? 0 : this.getUsuarioId().hashCode());
		return result;
	}

}