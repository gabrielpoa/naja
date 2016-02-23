package br.com.naja.mb;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import br.com.naja.bo.SegurancaBO;
import br.com.naja.model.Usuario;
import br.com.naja.util.Sessao;

@ManagedBean
@ViewScoped
public class SegurancaMB {

	@Inject
	SegurancaBO seguranca;
	
	private Usuario usuario;
	
	private String email;
	private String senha;
	
	@PostConstruct
	public void init () {
	    this.email = "";
	    this.senha = "";
	}	
	
	public String doLogin() {
		
		Sessao sessao = seguranca.login(new Usuario(this.email, this.senha)); 
		//Sessao sessao = seguranca.login(usuario);
		
		if (sessao.getMensagem().getCod() > 0) { 
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(sessao.getMensagem().getTexto())); 
			return null;
		} 
		
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("sessao", sessao);
		return "/webapp/principal"; 
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
