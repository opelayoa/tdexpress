package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:16:53 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * GastosAutorizadores generated by hbm2java
 */
@Entity
@Table(name = "gastos_autorizadores", catalog = "itaid")
public class GastosAutorizadores implements java.io.Serializable {

	private int id;
	private int respAreaId;
	private int respFinancieroId;
	private int areaId;

	public GastosAutorizadores() {
	}

	public GastosAutorizadores(int id, int respAreaId, int respFinancieroId, int areaId) {
		this.id = id;
		this.respAreaId = respAreaId;
		this.respFinancieroId = respFinancieroId;
		this.areaId = areaId;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "resp_area_id", nullable = false)
	public int getRespAreaId() {
		return this.respAreaId;
	}

	public void setRespAreaId(int respAreaId) {
		this.respAreaId = respAreaId;
	}

	@Column(name = "resp_financiero_id", nullable = false)
	public int getRespFinancieroId() {
		return this.respFinancieroId;
	}

	public void setRespFinancieroId(int respFinancieroId) {
		this.respFinancieroId = respFinancieroId;
	}

	@Column(name = "area_id", nullable = false)
	public int getAreaId() {
		return this.areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

}