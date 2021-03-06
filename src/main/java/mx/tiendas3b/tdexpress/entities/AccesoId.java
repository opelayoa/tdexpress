package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AccesoId generated by hbm2java
 */
@Embeddable
public class AccesoId implements java.io.Serializable {

	private String node;
	private String action;
	private int perfilId;

	public AccesoId() {
	}

	public AccesoId(String node, String action, int perfilId) {
		this.node = node;
		this.action = action;
		this.perfilId = perfilId;
	}

	@Column(name = "node", nullable = false, length = 100)
	public String getNode() {
		return this.node;
	}

	public void setNode(String node) {
		this.node = node;
	}

	@Column(name = "action", nullable = false, length = 25)
	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Column(name = "perfil_id", nullable = false)
	public int getPerfilId() {
		return this.perfilId;
	}

	public void setPerfilId(int perfilId) {
		this.perfilId = perfilId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AccesoId))
			return false;
		AccesoId castOther = (AccesoId) other;

		return ((this.getNode() == castOther.getNode()) || (this.getNode() != null && castOther.getNode() != null
				&& this.getNode().equals(castOther.getNode())))
				&& ((this.getAction() == castOther.getAction()) || (this.getAction() != null
						&& castOther.getAction() != null && this.getAction().equals(castOther.getAction())))
				&& (this.getPerfilId() == castOther.getPerfilId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNode() == null ? 0 : this.getNode().hashCode());
		result = 37 * result + (getAction() == null ? 0 : this.getAction().hashCode());
		result = 37 * result + this.getPerfilId();
		return result;
	}

}
