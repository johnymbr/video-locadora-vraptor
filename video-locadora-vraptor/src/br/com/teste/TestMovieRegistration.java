package br.com.teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import br.com.entity.MovieRegistration;

/**
 * 
 * @author Eduardo Moreira Vilarinho
 *
 */

public class TestMovieRegistration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		/*MovieRegistration movie_registration = new MovieRegistration();
		movie_registration.setOriginalTitle("Harry Potter and the Deathly Hallows: Part 2");
		movie_registration.setPortugueseTitle("Harry Potter e as Relíquias da Morte - Parte 2");
		movie_registration.setDirector("David Yates");
		movie_registration.setActors("Daniel Radcliffe, Emma Watson, Rupert Grint, Alan Rickman");
		movie_registration.setDuration("130 min");
		movie_registration.setGenre("Aventura");
		movie_registration.setSinopse("Harry Potter (Daniel Radcliffe) e seus amigos Rony Weasley (Rupert Grint) e Hermione Granger (Emma Watson) seguem à procura das horcruxes. O objetivo do trio é encontrá-las e, em seguida, destruí-las, de forma a eliminar lorde Voldemort (Ralph Fiennes) de uma vez por todas. Com a ajuda do duende Grampo (Warwick Davis), eles entram no banco Gringotes de forma a invadir o cofre de Bellatrix Lestrange (Helena Bonham Carter). De lá retornam ao castelo de Hogwarts, onde precisam encontrar mais uma horcrux. Paralelamente, Voldemort prepara o ataque definitivo ao castelo.");
		*/
		Transaction tx = session.beginTransaction();
		//session.save(movie_registration);
		tx.commit();
	}

}
