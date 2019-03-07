package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * RelacionTipoSintomaDiagnostico generated by hbm2java
 */
@Entity
@Table(name = "relacion_tipo_sintoma_diagnostico", catalog = "itaid")
public class RelacionTipoSintomaDiagnostico implements java.io.Serializable {

	private Integer id;
	private int tipoId;
	private String tipo;
	private int sintomaId;
	private String sintoma;
	private int diagnosticoId;
	private String diagnostico;

	public RelacionTipoSintomaDiagnostico() {
	}

	public RelacionTipoSintomaDiagnostico(int tipoId, String tipo, int sintomaId, String sintoma, int diagnosticoId,
			String diagnostico) {
		this.tipoId = tipoId;
		this.tipo = tipo;
		this.sintomaId = sintomaId;
		this.sintoma = sintoma;
		this.diagnosticoId = diagnosticoId;
		this.diagnostico = diagnostico;
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

	@Column(name = "tipo_id", nullable = false)
	public int getTipoId() {
		return this.tipoId;
	}

	public void setTipoId(int tipoId) {
		this.tipoId = tipoId;
	}

	@Column(name = "tipo", nullable = false, length = 65535)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(name = "sintoma_id", nullable = false)
	public int getSintomaId() {
		return this.sintomaId;
	}

	public void setSintomaId(int sintomaId) {
		this.sintomaId = sintomaId;
	}

	@Column(name = "sintoma", nullable = false, length = 65535)
	public String getSintoma() {
		return this.sintoma;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

	@Column(name = "diagnostico_id", nullable = false)
	public int getDiagnosticoId() {
		return this.diagnosticoId;
	}

	public void setDiagnosticoId(int diagnosticoId) {
		this.diagnosticoId = diagnosticoId;
	}

	@Column(name = "diagnostico", nullable = false, length = 65535)
	public String getDiagnostico() {
		return this.diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

}