package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Bitacorasitesactividades generated by hbm2java
 */
@Entity
@Table(name = "bitacorasitesactividades", catalog = "itaid")
public class Bitacorasitesactividades implements java.io.Serializable {

	private BitacorasitesactividadesId id;
	private String comentPiso;
	private int usercaptura;
	private Date fechacaptura;
	private int useracturaliza;
	private Date fechaauditoria;

	public Bitacorasitesactividades() {
	}

	public Bitacorasitesactividades(BitacorasitesactividadesId id, String comentPiso, int usercaptura,
			Date fechacaptura, int useracturaliza, Date fechaauditoria) {
		this.id = id;
		this.comentPiso = comentPiso;
		this.usercaptura = usercaptura;
		this.fechacaptura = fechacaptura;
		this.useracturaliza = useracturaliza;
		this.fechaauditoria = fechaauditoria;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idactividad", column = @Column(name = "idactividad", nullable = false)),
			@AttributeOverride(name = "idSite", column = @Column(name = "idSite", nullable = false)) })
	public BitacorasitesactividadesId getId() {
		return this.id;
	}

	public void setId(BitacorasitesactividadesId id) {
		this.id = id;
	}

	@Column(name = "comentPiso", nullable = false, length = 250)
	public String getComentPiso() {
		return this.comentPiso;
	}

	public void setComentPiso(String comentPiso) {
		this.comentPiso = comentPiso;
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

	@Column(name = "useracturaliza", nullable = false)
	public int getUseracturaliza() {
		return this.useracturaliza;
	}

	public void setUseracturaliza(int useracturaliza) {
		this.useracturaliza = useracturaliza;
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
