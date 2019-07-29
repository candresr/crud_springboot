package com.certicamara.certifactura5.front.modelo;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "tbc_facturador")
@IdClass(IdentidadFacturador.class)
public class Facturador {
//	@Id
//	@EmbeddedId
//	private FacturadorIdentity facturadorIdentity;
	
	@Id
	private String clie_tipi;
	@Id
	private String clie_iden;
	
	private String clie_esta;	
	private String clie_nombre;
	private Integer clie_diverif;
	private String clie_natura;
	private String clie_ciuu;
	private String clie_coregim;
	private String clie_resfisc;
	private String clie_codimp;
	private String clie_nomimp;
	private String clie_direccio;
	private String clie_telefon;
	private String clie_email;
	private Timestamp clie_vigcont;
	private String clie_imag;
	private String clie_ucrea;
	private Timestamp clie_fcrea;
	private String clie_uactu;
	private Timestamp clie_factu;
	
	public Facturador() {}
	
	public Facturador(String clie_tipi, String clie_iden, String clie_esta, String clie_nombre, Integer clie_diverif,
			String clie_natura, String clie_ciuu, String clie_coregim, String clie_resfisc, String clie_codimp,
			String clie_nomimp, String clie_direccio, String clie_telefon, String clie_email, Timestamp clie_vigcont,
			String clie_imag, String clie_ucrea, Timestamp clie_fcrea, String clie_uactu, Timestamp clie_factu) {
//		this.facturadorIdentity = facturadorIdentity;
		this.clie_tipi = clie_tipi;
		this.clie_iden = clie_iden;
		this.clie_esta = clie_esta;
		this.clie_nombre = clie_nombre;
		this.clie_diverif = clie_diverif;
		this.clie_natura = clie_natura;
		this.clie_ciuu = clie_ciuu;
		this.clie_coregim = clie_coregim;
		this.clie_resfisc = clie_resfisc;
		this.clie_codimp = clie_codimp;
		this.clie_nomimp = clie_nomimp;
		this.clie_direccio = clie_direccio;
		this.clie_telefon = clie_telefon;
		this.clie_email = clie_email;
		this.clie_vigcont = clie_vigcont;
		this.clie_imag = clie_imag;
		this.clie_ucrea = clie_ucrea;
		this.clie_fcrea = clie_fcrea;
		this.clie_uactu = clie_uactu;
		this.clie_factu = clie_factu;
	}

	public String getClie_tipi() {
		return clie_tipi;
	}

	public void setClie_tipi(String clie_tipi) {
		this.clie_tipi = clie_tipi;
	}

	public String getClie_iden() {
		return clie_iden;
	}

	public void setClie_iden(String clie_iden) {
		this.clie_iden = clie_iden;
	}

	public String getClie_esta() {
		return clie_esta;
	}

	public void setClie_esta(String clie_esta) {
		this.clie_esta = clie_esta;
	}

	public String getClie_nombre() {
		return clie_nombre;
	}

	public void setClie_nombre(String clie_nombre) {
		this.clie_nombre = clie_nombre;
	}

	public Integer getClie_diverif() {
		return clie_diverif;
	}

	public void setClie_diverif(Integer clie_diverif) {
		this.clie_diverif = clie_diverif;
	}

	public String getClie_natura() {
		return clie_natura;
	}

	public void setClie_natura(String clie_natura) {
		this.clie_natura = clie_natura;
	}

	public String getClie_ciuu() {
		return clie_ciuu;
	}

	public void setClie_ciuu(String clie_ciuu) {
		this.clie_ciuu = clie_ciuu;
	}

	public String getClie_coregim() {
		return clie_coregim;
	}

	public void setClie_coregim(String clie_coregim) {
		this.clie_coregim = clie_coregim;
	}

	public String getClie_resfisc() {
		return clie_resfisc;
	}

	public void setClie_resfisc(String clie_resfisc) {
		this.clie_resfisc = clie_resfisc;
	}

	public String getClie_codimp() {
		return clie_codimp;
	}

	public void setClie_codimp(String clie_codimp) {
		this.clie_codimp = clie_codimp;
	}

	public String getClie_nomimp() {
		return clie_nomimp;
	}

	public void setClie_nomimp(String clie_nomimp) {
		this.clie_nomimp = clie_nomimp;
	}

	public String getClie_direccio() {
		return clie_direccio;
	}

	public void setClie_direccio(String clie_direccio) {
		this.clie_direccio = clie_direccio;
	}

	public String getClie_telefon() {
		return clie_telefon;
	}

	public void setClie_telefon(String clie_telefon) {
		this.clie_telefon = clie_telefon;
	}

	public String getClie_email() {
		return clie_email;
	}

	public void setClie_email(String clie_email) {
		this.clie_email = clie_email;
	}

	public Timestamp getClie_vigcont() {
		return clie_vigcont;
	}

	public void setClie_vigcont(Timestamp clie_vigcont) {
		this.clie_vigcont = clie_vigcont;
	}

	public String getClie_imag() {
		return clie_imag;
	}

	public void setClie_imag(String clie_imag) {
		this.clie_imag = clie_imag;
	}

	public String getClie_ucrea() {
		return clie_ucrea;
	}

	public void setClie_ucrea(String clie_ucrea) {
		this.clie_ucrea = clie_ucrea;
	}

	public Timestamp getClie_fcrea() {
		return clie_fcrea;
	}

	public void setClie_fcrea(Timestamp clie_fcrea) {
		this.clie_fcrea = clie_fcrea;
	}

	public String getClie_uactu() {
		return clie_uactu;
	}

	public void setClie_uactu(String clie_uactu) {
		this.clie_uactu = clie_uactu;
	}

	public Timestamp getClie_factu() {
		return clie_factu;
	}

	public void setClie_factu(Timestamp clie_factu) {
		this.clie_factu = clie_factu;
	}

	@Override
	public String toString() {
		return "Facturador [clie_tipi=" + clie_tipi + ", clie_iden=" + clie_iden + ", clie_esta=" + clie_esta
				+ ", clie_nombre=" + clie_nombre + ", clie_diverif=" + clie_diverif + ", clie_natura=" + clie_natura
				+ ", clie_ciuu=" + clie_ciuu + ", clie_coregim=" + clie_coregim + ", clie_resfisc=" + clie_resfisc
				+ ", clie_codimp=" + clie_codimp + ", clie_nomimp=" + clie_nomimp + ", clie_direccio=" + clie_direccio
				+ ", clie_telefon=" + clie_telefon + ", clie_email=" + clie_email + ", clie_vigcont=" + clie_vigcont
				+ ", clie_imag=" + clie_imag + ", clie_ucrea=" + clie_ucrea + ", clie_fcrea=" + clie_fcrea
				+ ", clie_uactu=" + clie_uactu + ", clie_factu=" + clie_factu + "]";
	}

//	public FacturadorIdentity getFacturadorIdentity() {
//		return facturadorIdentity;
//	}
//
//	public void setFacturadorIdentity(FacturadorIdentity facturadorIdentity) {
//		this.facturadorIdentity = facturadorIdentity;
//	}

	
	
}
