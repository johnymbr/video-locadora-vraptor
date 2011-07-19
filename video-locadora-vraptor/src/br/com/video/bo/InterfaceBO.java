package br.com.video.bo;

import java.util.List;

/**
 * Interface para as classes BO.
 * @author johny
 *
 * @param <T> Tipo do objeto que sera utilizado na implementacao.
 */
public interface InterfaceBO<T> {
	
	public List<T> consult(T t);
}
