package br.com.video.factory;

import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;
import br.com.video.dao.UserDAO;

@Component
public class CreateUserDAO implements ComponentFactory<UserDAO> {

	private final Session session;
	
	public CreateUserDAO(Session session) {
		System.out.println("Construi o CreateUserDAO");
		this.session = session;
	}

	@Override
	public UserDAO getInstance() {
		return new UserDAO(session);
	}

}