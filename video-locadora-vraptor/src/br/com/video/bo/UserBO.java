package br.com.video.bo;

import java.util.List;

import br.com.video.dao.InterfaceDAO;
import br.com.video.entity.User;

/**
 * Classe que sera responsavel pelas regras de negocio
 * dos usuarios
 * @author johny
 *
 */
public class UserBO implements InterfaceBO<User> {

	private InterfaceDAO<User> userDao;
	
	// CONSTRUTOR
	public UserBO(InterfaceDAO<User> userDao){
		this.userDao = userDao;
	}
	
	// METODO GETTERS E SETTERS
	public InterfaceDAO<User> getUserDao() {
		return userDao;
	}

	public void setUserDao(InterfaceDAO<User> userDao) {
		this.userDao = userDao;
	}

	// DEMAIS METODOS
	@Override
	public List<User> consult(User user) {
		return null;
	}
}
