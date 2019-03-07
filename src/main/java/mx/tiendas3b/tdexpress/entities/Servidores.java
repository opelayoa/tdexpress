package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Servidores generated by hbm2java
 */
@Entity
@Table(name = "servidores", catalog = "itaid")
public class Servidores implements java.io.Serializable {

	private ServidoresId id;

	public Servidores() {
	}

	public Servidores(ServidoresId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id", nullable = false)),
			@AttributeOverride(name = "nombre", column = @Column(name = "nombre", nullable = false)),
			@AttributeOverride(name = "descripcion", column = @Column(name = "descripcion", nullable = false, length = 65535)),
			@AttributeOverride(name = "usercreate", column = @Column(name = "usercreate", nullable = false)),
			@AttributeOverride(name = "fechacreate", column = @Column(name = "fechacreate", nullable = false, length = 19)),
			@AttributeOverride(name = "usermod", column = @Column(name = "usermod", nullable = false)),
			@AttributeOverride(name = "fechamod", column = @Column(name = "fechamod", nullable = false, length = 19)),
			@AttributeOverride(name = "userdel", column = @Column(name = "userdel", nullable = false)),
			@AttributeOverride(name = "fechadel", column = @Column(name = "fechadel", nullable = false, length = 19)),
			@AttributeOverride(name = "status", column = @Column(name = "status", nullable = false)) })
	public ServidoresId getId() {
		return this.id;
	}

	public void setId(ServidoresId id) {
		this.id = id;
	}

}