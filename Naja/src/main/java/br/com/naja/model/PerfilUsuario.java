package br.com.naja.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_role")
public class PerfilUsuario  implements Serializable {

	private static final long serialVersionUID = 3277217181973046535L;

	@Id
	@Column(name = "id_user_role")
	private Integer idPerfilUsuario;
	
	@Column(name = "id_user")
	private Integer idUsuario;
	
	@Column(name = "id_roles_permission")
	private Integer idPerfil;

	public PerfilUsuario() {
		super();
	}

	public Integer getIdPerfilUsuario() {
		return idPerfilUsuario;
	}

	public void setIdPerfilUsuario(Integer idPerfilUsuario) {
		this.idPerfilUsuario = idPerfilUsuario;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}

	
}
