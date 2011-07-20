package br.com.video.dao;

import org.hibernate.Session;

import br.com.video.entity.User;

/**
 * Classe que sera responsavel pela persistencia 
 * de usuarios.
 * @author johny
 *
 */
public class UserDAO implements InterfaceDAO<User> {

	private final Session session;

	public UserDAO(Session session) {
		System.out.println("Construi o UserDAO");
		this.session = session;
	}
	
}