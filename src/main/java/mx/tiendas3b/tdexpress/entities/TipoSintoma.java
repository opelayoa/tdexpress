package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TipoSintoma generated by hbm2java
 */
@Entity
@Table(name = "tipo_sintoma", catalog = "itaid")
public class TipoSintoma implements java.io.Serializable {

	private Integer id;
	private String sintoma;
	private int tipoId;
	private int sintomaId;
	private boolean status;
	private boolean renueva;

	public TipoSintoma() {
	}

	public TipoSintoma(String sintoma, int tipoId, int sintomaId, boolean status, boolean renueva) {
		this.sintoma = sintoma;
		this.tipoId = tipoId;
		this.sintomaId = sintomaId;
		this.status = status;
		this.renueva = renueva;
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

	@Column(name = "sintoma", nullable = false, length = 65535)
	public String getSintoma() {
		return this.sintoma;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

	@Column(name = "tipo_id", nullable = false)
	public int getTipoId() {
		return this.tipoId;
	}

	public void setTipoId(int tipoId) {
		this.tipoId = tipoId;
	}

	@Column(name = "sintoma_id", nullable = false)
	public int getSintomaId() {
		return this.sintomaId;
	}

	public void setSintomaId(int sintomaId) {
		this.sintomaId = sintomaId;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Column(name = "renueva", nullable = false)
	public boolean isRenueva() {
		return this.renueva;
	}

	public void setRenueva(boolean renueva) {
		this.renueva = renueva;
	}

}
