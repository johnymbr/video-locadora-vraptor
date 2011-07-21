package br.com.video.dao;

import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.com.video.entity.User;

/**
 * Classe que sera responsavel pela persistencia 
 * de usuarios.
 * @author johny
 *
 */
@Component
public class UserDAO implements InterfaceDAO<User> {

	private final Session session;

	public UserDAO(Session session) {
		this.session = session;
	}
	
}