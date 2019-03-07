package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:16:53 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", catalog = "itaid")
public class Usuario implements java.io.Serializable {

	private int id;
	private String apellido;
	private String nombre;
	private String login;
	private String password;
	private String email;
	private String celular;
	private String alias;
	private int departamentoId;
	private int sucursalId;
	private int perfilId;
	private boolean envioCorreo;
	private Integer userGasto;
	private Integer userCreate;
	private Date dateCreate;
	private Integer userModify;
	private Date dateModify;
	private int userId;
	private Boolean status;
	private boolean emailEvento;
	private Integer puestoId;

	public Usuario() {
	}

	public Usuario(int id, String apellido, String nombre, String login, String password, String email, String celular,
			int departamentoId, int sucursalId, int perfilId, boolean envioCorreo, int userId, boolean emailEvento) {
		this.id = id;
		this.apellido = apellido;
		this.nombre = nombre;
		this.login = login;
		this.password = password;
		this.email = email;
		this.celular = celular;
		this.departamentoId = departamentoId;
		this.sucursalId = sucursalId;
		this.perfilId = perfilId;
		this.envioCorreo = envioCorreo;
		this.userId = userId;
		this.emailEvento = emailEvento;
	}

	public Usuario(int id, String apellido, String nombre, String login, String password, String email, String celular,
			String alias, int departamentoId, int sucursalId, int perfilId, boolean envioCorreo, Integer userGasto,
			Integer userCreate, Date dateCreate, Integer userModify, Date dateModify, int userId, Boolean status,
			boolean emailEvento, Integer puestoId) {
		this.id = id;
		this.apellido = apellido;
		this.nombre = nombre;
		this.login = login;
		this.password = password;
		this.email = email;
		this.celular = celular;
		this.alias = alias;
		this.departamentoId = departamentoId;
		this.sucursalId = sucursalId;
		this.perfilId = perfilId;
		this.envioCorreo = envioCorreo;
		this.userGasto = userGasto;
		this.userCreate = userCreate;
		this.dateCreate = dateCreate;
		this.userModify = userModify;
		this.dateModify = dateModify;
		this.userId = userId;
		this.status = status;
		this.emailEvento = emailEvento;
		this.puestoId = puestoId;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "apellido", nullable = false, length = 25)
	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Column(name = "nombre", nullable = false, length = 25)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "login", nullable = false, length = 25)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "password", nullable = false, length = 32)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "email", nullable = false)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "celular", nullable = false, length = 10)
	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Column(name = "alias", length = 65535)
	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	@Column(name = "departamento_id", nullable = false)
	public int getDepartamentoId() {
		return this.departamentoId;
	}

	public void setDepartamentoId(int departamentoId) {
		this.departamentoId = departamentoId;
	}

	@Column(name = "sucursal_id", nullable = false)
	public int getSucursalId() {
		return this.sucursalId;
	}

	public void setSucursalId(int sucursalId) {
		this.sucursalId = sucursalId;
	}

	@Column(name = "perfil_id", nullable = false)
	public int getPerfilId() {
		return this.perfilId;
	}

	public void setPerfilId(int perfilId) {
		this.perfilId = perfilId;
	}

	@Column(name = "envio_correo", nullable = false)
	public boolean isEnvioCorreo() {
		return this.envioCorreo;
	}

	public void setEnvioCorreo(boolean envioCorreo) {
		this.envioCorreo = envioCorreo;
	}

	@Column(name = "user_gasto")
	public Integer getUserGasto() {
		return this.userGasto;
	}

	public void setUserGasto(Integer userGasto) {
		this.userGasto = userGasto;
	}

	@Column(name = "user_create")
	public Integer getUserCreate() {
		return this.userCreate;
	}

	public void setUserCreate(Integer userCreate) {
		this.userCreate = userCreate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_create", length = 19)
	public Date getDateCreate() {
		return this.dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	@Column(name = "user_modify")
	public Integer getUserModify() {
		return this.userModify;
	}

	public void setUserModify(Integer userModify) {
		this.userModify = userModify;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_modify", length = 19)
	public Date getDateModify() {
		return this.dateModify;
	}

	public void setDateModify(Date dateModify) {
		this.dateModify = dateModify;
	}

	@Column(name = "user_id", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "status")
	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Column(name = "email_evento", nullable = false)
	public boolean isEmailEvento() {
		return this.emailEvento;
	}

	public void setEmailEvento(boolean emailEvento) {
		this.emailEvento = emailEvento;
	}

	@Column(name = "puesto_id")
	public Integer getPuestoId() {
		return this.puestoId;
	}

	public void setPuestoId(Integer puestoId) {
		this.puestoId = puestoId;
	}

}