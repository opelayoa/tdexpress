package mx.tiendas3b.tdexpress.entities;
// Generated 6/03/2019 08:16:53 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PbcatcolId generated by hbm2java
 */
@Embeddable
public class PbcatcolId implements java.io.Serializable {

	private String pbcTnam;
	private Integer pbcTid;
	private String pbcOwnr;
	private String pbcCnam;
	private Short pbcCid;
	private String pbcLabl;
	private Short pbcLpos;
	private String pbcHdr;
	private Short pbcHpos;
	private Short pbcJtfy;
	private String pbcMask;
	private Short pbcCase;
	private Short pbcHght;
	private Short pbcWdth;
	private String pbcPtrn;
	private Character pbcBmap;
	private String pbcInit;
	private String pbcCmnt;
	private String pbcEdit;
	private String pbcTag;

	public PbcatcolId() {
	}

	public PbcatcolId(String pbcTnam, String pbcOwnr, String pbcCnam) {
		this.pbcTnam = pbcTnam;
		this.pbcOwnr = pbcOwnr;
		this.pbcCnam = pbcCnam;
	}

	public PbcatcolId(String pbcTnam, Integer pbcTid, String pbcOwnr, String pbcCnam, Short pbcCid, String pbcLabl,
			Short pbcLpos, String pbcHdr, Short pbcHpos, Short pbcJtfy, String pbcMask, Short pbcCase, Short pbcHght,
			Short pbcWdth, String pbcPtrn, Character pbcBmap, String pbcInit, String pbcCmnt, String pbcEdit,
			String pbcTag) {
		this.pbcTnam = pbcTnam;
		this.pbcTid = pbcTid;
		this.pbcOwnr = pbcOwnr;
		this.pbcCnam = pbcCnam;
		this.pbcCid = pbcCid;
		this.pbcLabl = pbcLabl;
		this.pbcLpos = pbcLpos;
		this.pbcHdr = pbcHdr;
		this.pbcHpos = pbcHpos;
		this.pbcJtfy = pbcJtfy;
		this.pbcMask = pbcMask;
		this.pbcCase = pbcCase;
		this.pbcHght = pbcHght;
		this.pbcWdth = pbcWdth;
		this.pbcPtrn = pbcPtrn;
		this.pbcBmap = pbcBmap;
		this.pbcInit = pbcInit;
		this.pbcCmnt = pbcCmnt;
		this.pbcEdit = pbcEdit;
		this.pbcTag = pbcTag;
	}

	@Column(name = "pbc_tnam", nullable = false, length = 193)
	public String getPbcTnam() {
		return this.pbcTnam;
	}

	public void setPbcTnam(String pbcTnam) {
		this.pbcTnam = pbcTnam;
	}

	@Column(name = "pbc_tid")
	public Integer getPbcTid() {
		return this.pbcTid;
	}

	public void setPbcTid(Integer pbcTid) {
		this.pbcTid = pbcTid;
	}

	@Column(name = "pbc_ownr", nullable = false, length = 193)
	public String getPbcOwnr() {
		return this.pbcOwnr;
	}

	public void setPbcOwnr(String pbcOwnr) {
		this.pbcOwnr = pbcOwnr;
	}

	@Column(name = "pbc_cnam", nullable = false, length = 193)
	public String getPbcCnam() {
		return this.pbcCnam;
	}

	public void setPbcCnam(String pbcCnam) {
		this.pbcCnam = pbcCnam;
	}

	@Column(name = "pbc_cid")
	public Short getPbcCid() {
		return this.pbcCid;
	}

	public void setPbcCid(Short pbcCid) {
		this.pbcCid = pbcCid;
	}

	@Column(name = "pbc_labl", length = 254)
	public String getPbcLabl() {
		return this.pbcLabl;
	}

	public void setPbcLabl(String pbcLabl) {
		this.pbcLabl = pbcLabl;
	}

	@Column(name = "pbc_lpos")
	public Short getPbcLpos() {
		return this.pbcLpos;
	}

	public void setPbcLpos(Short pbcLpos) {
		this.pbcLpos = pbcLpos;
	}

	@Column(name = "pbc_hdr", length = 254)
	public String getPbcHdr() {
		return this.pbcHdr;
	}

	public void setPbcHdr(String pbcHdr) {
		this.pbcHdr = pbcHdr;
	}

	@Column(name = "pbc_hpos")
	public Short getPbcHpos() {
		return this.pbcHpos;
	}

	public void setPbcHpos(Short pbcHpos) {
		this.pbcHpos = pbcHpos;
	}

	@Column(name = "pbc_jtfy")
	public Short getPbcJtfy() {
		return this.pbcJtfy;
	}

	public void setPbcJtfy(Short pbcJtfy) {
		this.pbcJtfy = pbcJtfy;
	}

	@Column(name = "pbc_mask", length = 31)
	public String getPbcMask() {
		return this.pbcMask;
	}

	public void setPbcMask(String pbcMask) {
		this.pbcMask = pbcMask;
	}

	@Column(name = "pbc_case")
	public Short getPbcCase() {
		return this.pbcCase;
	}

	public void setPbcCase(Short pbcCase) {
		this.pbcCase = pbcCase;
	}

	@Column(name = "pbc_hght")
	public Short getPbcHght() {
		return this.pbcHght;
	}

	public void setPbcHght(Short pbcHght) {
		this.pbcHght = pbcHght;
	}

	@Column(name = "pbc_wdth")
	public Short getPbcWdth() {
		return this.pbcWdth;
	}

	public void setPbcWdth(Short pbcWdth) {
		this.pbcWdth = pbcWdth;
	}

	@Column(name = "pbc_ptrn", length = 31)
	public String getPbcPtrn() {
		return this.pbcPtrn;
	}

	public void setPbcPtrn(String pbcPtrn) {
		this.pbcPtrn = pbcPtrn;
	}

	@Column(name = "pbc_bmap", length = 1)
	public Character getPbcBmap() {
		return this.pbcBmap;
	}

	public void setPbcBmap(Character pbcBmap) {
		this.pbcBmap = pbcBmap;
	}

	@Column(name = "pbc_init", length = 254)
	public String getPbcInit() {
		return this.pbcInit;
	}

	public void setPbcInit(String pbcInit) {
		this.pbcInit = pbcInit;
	}

	@Column(name = "pbc_cmnt", length = 254)
	public String getPbcCmnt() {
		return this.pbcCmnt;
	}

	public void setPbcCmnt(String pbcCmnt) {
		this.pbcCmnt = pbcCmnt;
	}

	@Column(name = "pbc_edit", length = 31)
	public String getPbcEdit() {
		return this.pbcEdit;
	}

	public void setPbcEdit(String pbcEdit) {
		this.pbcEdit = pbcEdit;
	}

	@Column(name = "pbc_tag", length = 254)
	public String getPbcTag() {
		return this.pbcTag;
	}

	public void setPbcTag(String pbcTag) {
		this.pbcTag = pbcTag;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PbcatcolId))
			return false;
		PbcatcolId castOther = (PbcatcolId) other;

		return ((this.getPbcTnam() == castOther.getPbcTnam()) || (this.getPbcTnam() != null
				&& castOther.getPbcTnam() != null && this.getPbcTnam().equals(castOther.getPbcTnam())))
				&& ((this.getPbcTid() == castOther.getPbcTid()) || (this.getPbcTid() != null
						&& castOther.getPbcTid() != null && this.getPbcTid().equals(castOther.getPbcTid())))
				&& ((this.getPbcOwnr() == castOther.getPbcOwnr()) || (this.getPbcOwnr() != null
						&& castOther.getPbcOwnr() != null && this.getPbcOwnr().equals(castOther.getPbcOwnr())))
				&& ((this.getPbcCnam() == castOther.getPbcCnam()) || (this.getPbcCnam() != null
						&& castOther.getPbcCnam() != null && this.getPbcCnam().equals(castOther.getPbcCnam())))
				&& ((this.getPbcCid() == castOther.getPbcCid()) || (this.getPbcCid() != null
						&& castOther.getPbcCid() != null && this.getPbcCid().equals(castOther.getPbcCid())))
				&& ((this.getPbcLabl() == castOther.getPbcLabl()) || (this.getPbcLabl() != null
						&& castOther.getPbcLabl() != null && this.getPbcLabl().equals(castOther.getPbcLabl())))
				&& ((this.getPbcLpos() == castOther.getPbcLpos()) || (this.getPbcLpos() != null
						&& castOther.getPbcLpos() != null && this.getPbcLpos().equals(castOther.getPbcLpos())))
				&& ((this.getPbcHdr() == castOther.getPbcHdr()) || (this.getPbcHdr() != null
						&& castOther.getPbcHdr() != null && this.getPbcHdr().equals(castOther.getPbcHdr())))
				&& ((this.getPbcHpos() == castOther.getPbcHpos()) || (this.getPbcHpos() != null
						&& castOther.getPbcHpos() != null && this.getPbcHpos().equals(castOther.getPbcHpos())))
				&& ((this.getPbcJtfy() == castOther.getPbcJtfy()) || (this.getPbcJtfy() != null
						&& castOther.getPbcJtfy() != null && this.getPbcJtfy().equals(castOther.getPbcJtfy())))
				&& ((this.getPbcMask() == castOther.getPbcMask()) || (this.getPbcMask() != null
						&& castOther.getPbcMask() != null && this.getPbcMask().equals(castOther.getPbcMask())))
				&& ((this.getPbcCase() == castOther.getPbcCase()) || (this.getPbcCase() != null
						&& castOther.getPbcCase() != null && this.getPbcCase().equals(castOther.getPbcCase())))
				&& ((this.getPbcHght() == castOther.getPbcHght()) || (this.getPbcHght() != null
						&& castOther.getPbcHght() != null && this.getPbcHght().equals(castOther.getPbcHght())))
				&& ((this.getPbcWdth() == castOther.getPbcWdth()) || (this.getPbcWdth() != null
						&& castOther.getPbcWdth() != null && this.getPbcWdth().equals(castOther.getPbcWdth())))
				&& ((this.getPbcPtrn() == castOther.getPbcPtrn()) || (this.getPbcPtrn() != null
						&& castOther.getPbcPtrn() != null && this.getPbcPtrn().equals(castOther.getPbcPtrn())))
				&& ((this.getPbcBmap() == castOther.getPbcBmap()) || (this.getPbcBmap() != null
						&& castOther.getPbcBmap() != null && this.getPbcBmap().equals(castOther.getPbcBmap())))
				&& ((this.getPbcInit() == castOther.getPbcInit()) || (this.getPbcInit() != null
						&& castOther.getPbcInit() != null && this.getPbcInit().equals(castOther.getPbcInit())))
				&& ((this.getPbcCmnt() == castOther.getPbcCmnt()) || (this.getPbcCmnt() != null
						&& castOther.getPbcCmnt() != null && this.getPbcCmnt().equals(castOther.getPbcCmnt())))
				&& ((this.getPbcEdit() == castOther.getPbcEdit()) || (this.getPbcEdit() != null
						&& castOther.getPbcEdit() != null && this.getPbcEdit().equals(castOther.getPbcEdit())))
				&& ((this.getPbcTag() == castOther.getPbcTag()) || (this.getPbcTag() != null
						&& castOther.getPbcTag() != null && this.getPbcTag().equals(castOther.getPbcTag())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPbcTnam() == null ? 0 : this.getPbcTnam().hashCode());
		result = 37 * result + (getPbcTid() == null ? 0 : this.getPbcTid().hashCode());
		result = 37 * result + (getPbcOwnr() == null ? 0 : this.getPbcOwnr().hashCode());
		result = 37 * result + (getPbcCnam() == null ? 0 : this.getPbcCnam().hashCode());
		result = 37 * result + (getPbcCid() == null ? 0 : this.getPbcCid().hashCode());
		result = 37 * result + (getPbcLabl() == null ? 0 : this.getPbcLabl().hashCode());
		result = 37 * result + (getPbcLpos() == null ? 0 : this.getPbcLpos().hashCode());
		result = 37 * result + (getPbcHdr() == null ? 0 : this.getPbcHdr().hashCode());
		result = 37 * result + (getPbcHpos() == null ? 0 : this.getPbcHpos().hashCode());
		result = 37 * result + (getPbcJtfy() == null ? 0 : this.getPbcJtfy().hashCode());
		result = 37 * result + (getPbcMask() == null ? 0 : this.getPbcMask().hashCode());
		result = 37 * result + (getPbcCase() == null ? 0 : this.getPbcCase().hashCode());
		result = 37 * result + (getPbcHght() == null ? 0 : this.getPbcHght().hashCode());
		result = 37 * result + (getPbcWdth() == null ? 0 : this.getPbcWdth().hashCode());
		result = 37 * result + (getPbcPtrn() == null ? 0 : this.getPbcPtrn().hashCode());
		result = 37 * result + (getPbcBmap() == null ? 0 : this.getPbcBmap().hashCode());
		result = 37 * result + (getPbcInit() == null ? 0 : this.getPbcInit().hashCode());
		result = 37 * result + (getPbcCmnt() == null ? 0 : this.getPbcCmnt().hashCode());
		result = 37 * result + (getPbcEdit() == null ? 0 : this.getPbcEdit().hashCode());
		result = 37 * result + (getPbcTag() == null ? 0 : this.getPbcTag().hashCode());
		return result;
	}

}
