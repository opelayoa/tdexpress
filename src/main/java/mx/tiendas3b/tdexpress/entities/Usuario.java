package mx.tiendas3b.tdexpress.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "usuario")
public class Usuario {
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "login")
	private String login;
	@Column(name = "password")
	private String password;
	@Column(name = "email")
	private String email;
	@Column(name = "celular")
	private String celular;
	@Column(name = "alias")
	private String alias;
	@Column(name = "departamento_id")
	private Integer departamentoId;
	@Column(name = "sucursal_id")
	private Integer sucursalId;
	@Column(name = "perfil_id")
	private Integer perfilId;
	@Column(name = "envio_correo")
	private Integer envioCorreo;
	@Column(name = "user_gasto")
	private Integer userGasto;
	@Column(name = "user_create")
	private Integer userCreate;
	@Column(name = "date_create")
	private Date dateCreate;
	@Column(name = "user_modify")
	private Integer userModify;
	@Column(name = "date_modify")
	private Date dateModify;
	@Column(name = "user_id")
	private Integer userId;
	@Column(name = "status")
	private Integer status;
	@Column(name = "email_evento")
	private Integer emailEvento;
	@Column(name = "puesto_id")
	private Integer puestoId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Integer getDepartamentoId() {
		return departamentoId;
	}

	public void setDepartamentoId(Integer departamentoId) {
		this.departamentoId = departamentoId;
	}

	public Integer getSucursalId() {
		return sucursalId;
	}

	public void setSucursalId(Integer sucursalId) {
		this.sucursalId = sucursalId;
	}

	public Integer getPerfilId() {
		return perfilId;
	}

	public void setPerfilId(Integer perfilId) {
		this.perfilId = perfilId;
	}

	public Integer getEnvioCorreo() {
		return envioCorreo;
	}

	public void setEnvioCorreo(Integer envioCorreo) {
		this.envioCorreo = envioCorreo;
	}

	public Integer getUserGasto() {
		return userGasto;
	}

	public void setUserGasto(Integer userGasto) {
		this.userGasto = userGasto;
	}

	public Integer getUserCreate() {
		return userCreate;
	}

	public void setUserCreate(Integer userCreate) {
		this.userCreate = userCreate;
	}

	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	public Integer getUserModify() {
		return userModify;
	}

	public void setUserModify(Integer userModify) {
		this.userModify = userModify;
	}

	public Date getDateModify() {
		return dateModify;
	}

	public void setDateModify(Date dateModify) {
		this.dateModify = dateModify;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getEmailEvento() {
		return emailEvento;
	}

	public void setEmailEvento(Integer emailEvento) {
		this.emailEvento = emailEvento;
	}

	public Integer getPuestoId() {
		return puestoId;
	}

	public void setPuestoId(Integer puestoId) {
		this.puestoId = puestoId;
	}

}
