package br.com.video.controller;

import br.com.caelum.vraptor.Resource;
import br.com.video.bo.InterfaceBO;
import br.com.video.bo.UserBO;
import br.com.video.entity.User;


/**
 * Classe que sera responsavel por receber requisicoes
 * referentes a usuarios.
 * @author johny
 *
 */
@Resource
public class UserController {

	// parametro que sera a referencia para o BO dos usuarios.
	private InterfaceBO<User> userBO;
	
	// CONSTRUTOR
	public UserController(InterfaceBO<User> userBO){
		this.userBO = userBO;
	}

	// METODOS GETTERS E SETTERS
	public InterfaceBO<User> getUserBO() {
		return userBO;
	}

	public void setUserBO(InterfaceBO<User> userBO) {
		this.userBO = userBO;
	}
	
	// DEMAIS METODOS
}
