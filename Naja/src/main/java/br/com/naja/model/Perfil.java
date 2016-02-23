package br.com.naja.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles_permission")
public class Perfil  implements Serializable {

	private static final long serialVersionUID = 3277217181973046535L;

	@Id
	@Column(name = "id_roles_permission")
	private Integer idPerfil;
	
	@Column(name = "permission")
	private String permissao;
	
	@Column(name = "roleName")
	private String perfil;

	
	public Perfil() {
		super();
	}


	public Integer getIdPerfil() {
		return idPerfil;
	}


	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}


	public String getPermissao() {
		return permissao;
	}


	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}


	public String getPerfil() {
		return perfil;
	}


	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

}
