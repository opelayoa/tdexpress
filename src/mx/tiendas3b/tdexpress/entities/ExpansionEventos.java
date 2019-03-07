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
 * ExpansionEventos generated by hbm2java
 */
@Entity
@Table(name = "expansion_eventos", catalog = "itaid")
public class ExpansionEventos implements java.io.Serializable {

	private Integer id;
	private int tclave;
	private String store;
	private Date firmaContrato;
	private Date entrega3b;
	private String renovacion;
	private String vigencia;
	private int anoVencimiento;
	private int avisoDias;
	private String propietario;

	public ExpansionEventos() {
	}

	public ExpansionEventos(int tclave, String store, Date firmaContrato, Date entrega3b, String renovacion,
			String vigencia, int anoVencimiento, int avisoDias, String propietario) {
		this.tclave = tclave;
		this.store = store;
		this.firmaContrato = firmaContrato;
		this.entrega3b = entrega3b;
		this.renovacion = renovacion;
		this.vigencia = vigencia;
		this.anoVencimiento = anoVencimiento;
		this.avisoDias = avisoDias;
		this.propietario = propietario;
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

	@Column(name = "tclave", nullable = false)
	public int getTclave() {
		return this.tclave;
	}

	public void setTclave(int tclave) {
		this.tclave = tclave;
	}

	@Column(name = "store", nullable = false)
	public String getStore() {
		return this.store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "firma_contrato", nullable = false, length = 10)
	public Date getFirmaContrato() {
		return this.firmaContrato;
	}

	public void setFirmaContrato(Date firmaContrato) {
		this.firmaContrato = firmaContrato;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "entrega_3b", nullable = false, length = 10)
	public Date getEntrega3b() {
		return this.entrega3b;
	}

	public void setEntrega3b(Date entrega3b) {
		this.entrega3b = entrega3b;
	}

	@Column(name = "renovacion", nullable = false)
	public String getRenovacion() {
		return this.renovacion;
	}

	public void setRenovacion(String renovacion) {
		this.renovacion = renovacion;
	}

	@Column(name = "vigencia", nullable = false)
	public String getVigencia() {
		return this.vigencia;
	}

	public void setVigencia(String vigencia) {
		this.vigencia = vigencia;
	}

	@Column(name = "ano_vencimiento", nullable = false)
	public int getAnoVencimiento() {
		return this.anoVencimiento;
	}

	public void setAnoVencimiento(int anoVencimiento) {
		this.anoVencimiento = anoVencimiento;
	}

	@Column(name = "aviso_dias", nullable = false)
	public int getAvisoDias() {
		return this.avisoDias;
	}

	public void setAvisoDias(int avisoDias) {
		this.avisoDias = avisoDias;
	}

	@Column(name = "propietario", nullable = false)
	public String getPropietario() {
		return this.propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

}
