package br.com.video.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@Component
public class CreateSessionFactory implements ComponentFactory<SessionFactory> {

	@Override
	public SessionFactory getInstance() {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		return factory;
	}

}