package br.com.video.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@Component
public class CreateSession implements ComponentFactory<Session> {
	
	private final SessionFactory factory;
	
	public CreateSession(SessionFactory factory) {
		this.factory = factory;
	}
	
	@Override
	public Session getInstance() {
		return factory.openSession();
	}

}
