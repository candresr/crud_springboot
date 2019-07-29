package com.certicamara.certifactura5.front.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class IdentidadFacturador implements Serializable {

	private static final long serialVersionUID = 1L;
	@NotNull
	private String clie_tipi;
	@NotNull
	private String clie_iden;
	
	public IdentidadFacturador() {}

	public IdentidadFacturador(String clie_tipi, String clie_iden) {
		this.clie_tipi = clie_tipi;
		this.clie_iden = clie_iden;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clie_iden == null) ? 0 : clie_iden.hashCode());
		result = prime * result + ((clie_tipi == null) ? 0 : clie_tipi.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IdentidadFacturador other = (IdentidadFacturador) obj;
		if (clie_iden == null) {
			if (other.clie_iden != null)
				return false;
		} else if (!clie_iden.equals(other.clie_iden))
			return false;
		if (clie_tipi == null) {
			if (other.clie_tipi != null)
				return false;
		} else if (!clie_tipi.equals(other.clie_tipi))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FacturadorIdentity [clie_tipi=" + clie_tipi + ", clie_iden=" + clie_iden + "]";
	}
	
}
