package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:17:38 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PbcatvldId generated by hbm2java
 */
@Embeddable
public class PbcatvldId implements java.io.Serializable {

	private String pbvName;
	private String pbvVald;
	private Short pbvType;
	private Integer pbvCntr;
	private String pbvMsg;

	public PbcatvldId() {
	}

	public PbcatvldId(String pbvName) {
		this.pbvName = pbvName;
	}

	public PbcatvldId(String pbvName, String pbvVald, Short pbvType, Integer pbvCntr, String pbvMsg) {
		this.pbvName = pbvName;
		this.pbvVald = pbvVald;
		this.pbvType = pbvType;
		this.pbvCntr = pbvCntr;
		this.pbvMsg = pbvMsg;
	}

	@Column(name = "pbv_name", unique = true, nullable = false, length = 30)
	public String getPbvName() {
		return this.pbvName;
	}

	public void setPbvName(String pbvName) {
		this.pbvName = pbvName;
	}

	@Column(name = "pbv_vald", length = 254)
	public String getPbvVald() {
		return this.pbvVald;
	}

	public void setPbvVald(String pbvVald) {
		this.pbvVald = pbvVald;
	}

	@Column(name = "pbv_type")
	public Short getPbvType() {
		return this.pbvType;
	}

	public void setPbvType(Short pbvType) {
		this.pbvType = pbvType;
	}

	@Column(name = "pbv_cntr")
	public Integer getPbvCntr() {
		return this.pbvCntr;
	}

	public void setPbvCntr(Integer pbvCntr) {
		this.pbvCntr = pbvCntr;
	}

	@Column(name = "pbv_msg", length = 254)
	public String getPbvMsg() {
		return this.pbvMsg;
	}

	public void setPbvMsg(String pbvMsg) {
		this.pbvMsg = pbvMsg;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PbcatvldId))
			return false;
		PbcatvldId castOther = (PbcatvldId) other;

		return ((this.getPbvName() == castOther.getPbvName()) || (this.getPbvName() != null
				&& castOther.getPbvName() != null && this.getPbvName().equals(castOther.getPbvName())))
				&& ((this.getPbvVald() == castOther.getPbvVald()) || (this.getPbvVald() != null
						&& castOther.getPbvVald() != null && this.getPbvVald().equals(castOther.getPbvVald())))
				&& ((this.getPbvType() == castOther.getPbvType()) || (this.getPbvType() != null
						&& castOther.getPbvType() != null && this.getPbvType().equals(castOther.getPbvType())))
				&& ((this.getPbvCntr() == castOther.getPbvCntr()) || (this.getPbvCntr() != null
						&& castOther.getPbvCntr() != null && this.getPbvCntr().equals(castOther.getPbvCntr())))
				&& ((this.getPbvMsg() == castOther.getPbvMsg()) || (this.getPbvMsg() != null
						&& castOther.getPbvMsg() != null && this.getPbvMsg().equals(castOther.getPbvMsg())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPbvName() == null ? 0 : this.getPbvName().hashCode());
		result = 37 * result + (getPbvVald() == null ? 0 : this.getPbvVald().hashCode());
		result = 37 * result + (getPbvType() == null ? 0 : this.getPbvType().hashCode());
		result = 37 * result + (getPbvCntr() == null ? 0 : this.getPbvCntr().hashCode());
		result = 37 * result + (getPbvMsg() == null ? 0 : this.getPbvMsg().hashCode());
		return result;
	}

}
