package br.com.naja.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.naja.model.Usuario;

public class UsuarioDao {

	@PersistenceContext(unitName = "Naja")
	private EntityManager entityManager;
	
	public Usuario getUsuarioPorEmailSenha(Usuario usuario) {
		Query query = entityManager.createQuery("SELECT u FROM Usuario u "
											  + "WHERE u.email = :emailPar "
											  + "AND u.senha = :senhaPar ");
		query.setParameter("emailPar", usuario.getEmail());
		query.setParameter("senhaPar", usuario.getSenha());

		List<Usuario> usuarios = query.getResultList();
		
		if (usuarios.size() == 0)
			return new Usuario();
		
		usuario =  (Usuario) usuarios.get(0);		
	
		return usuario;
	}	
	
}
