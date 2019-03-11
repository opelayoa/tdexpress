package mx.tiendas3b.tdexpress.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "icon_entity", catalog = "itaid")
public class IconEntity implements java.io.Serializable {

	private int id;
	private String iconName;
	private String entityType;
	private int entityId;

	public IconEntity() {
	}

	public IconEntity(int id, String iconName, String entityType, int entityId) {
		super();
		this.id = id;
		this.iconName = iconName;
		this.entityType = entityType;
		this.entityId = entityId;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "icon_name", nullable = false, length = 100)
	public String getIconName() {
		return iconName;
	}

	public void setIconName(String iconName) {
		this.iconName = iconName;
	}

	@Column(name = "entity_type", nullable = false, length = 100)
	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	@Column(name = "entity_id", nullable = false)
	public int getEntityId() {
		return entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

}
