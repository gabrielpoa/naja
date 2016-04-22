package br.com.naja.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Perfil  implements Serializable {

	private static final long serialVersionUID = 3277217181973046535L;

	@Id
	@Column(name = "id_role")
	private Integer idPerfil;
	
	@Column(name = "role")
	private String permissao;
	
	@Column(name = "description")
	private String descricao;

	
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


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}




}
