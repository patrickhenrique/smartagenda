package br.ufal.ic.ppgi.smartagenda.exemplar.spec.prov;

import java.io.Serializable;

/**
 * Interface responsável para gerenciar os Exemplares
 * neste caso o gerenciar é a criação, atualização e remoção
 * deixando, conforme o caso de uso, o gerenciar para a interface
 * de consulta.
 * @author Edival e Miguel Lima
 *
 */
public interface IGerenciarExemplar {
	
	
	public Long saveExemplar(Serializable exemplar);
	public void updateExemplar(Serializable exemplar);
	public void removeExemplar(Serializable exemplar);
	public Object setAvaliableExemplar(Boolean exemplar);
}
