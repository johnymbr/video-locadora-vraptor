package br.com.teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.entity.Client;

@SuppressWarnings("deprecation")
public class TestClient {

	public static void main(String[] args) {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Client client = new Client();
		client.setName("Johny");
		
		Transaction tx = session.beginTransaction();
		session.save(client);
		tx.commit();
	}

}
