package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:16:53 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ActivoModeloProveedor generated by hbm2java
 */
@Entity
@Table(name = "activo_modelo_proveedor", catalog = "itaid")
public class ActivoModeloProveedor implements java.io.Serializable {

	private Integer id;
	private int activomodeloId;
	private int proveedorId;
	private float costo;
	private int tipomonedaId;
	private boolean status;

	public ActivoModeloProveedor() {
	}

	public ActivoModeloProveedor(int activomodeloId, int proveedorId, float costo, int tipomonedaId, boolean status) {
		this.activomodeloId = activomodeloId;
		this.proveedorId = proveedorId;
		this.costo = costo;
		this.tipomonedaId = tipomonedaId;
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

	@Column(name = "activomodelo_id", nullable = false)
	public int getActivomodeloId() {
		return this.activomodeloId;
	}

	public void setActivomodeloId(int activomodeloId) {
		this.activomodeloId = activomodeloId;
	}

	@Column(name = "proveedor_id", nullable = false)
	public int getProveedorId() {
		return this.proveedorId;
	}

	public void setProveedorId(int proveedorId) {
		this.proveedorId = proveedorId;
	}

	@Column(name = "costo", nullable = false, precision = 12, scale = 0)
	public float getCosto() {
		return this.costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	@Column(name = "tipomoneda_id", nullable = false)
	public int getTipomonedaId() {
		return this.tipomonedaId;
	}

	public void setTipomonedaId(int tipomonedaId) {
		this.tipomonedaId = tipomonedaId;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
