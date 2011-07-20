package br.com.video.factory;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;
import br.com.video.bo.UserBO;
import br.com.video.dao.InterfaceDAO;
import br.com.video.dao.UserDAO;

@Component
public class CreateUserBO implements ComponentFactory<UserBO> {

	private final UserDAO userDao;
	
	public CreateUserBO(UserDAO userDao) {
		System.out.println("Construi o CreateUserBO");
		this.userDao = userDao;
	}

	@Override
	public UserBO getInstance() {
		return new UserBO(userDao);
	}

}
