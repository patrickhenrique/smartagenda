package br.ufal.ic.ppgi.smartagenda.exemplarops.spec.req;


import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.UsuarioOpsDT;

/**
 * @desc Interface do ExemplarMgt para o uso das funcionalidades do Mgt
 * 
 * @author João Miguel e Edival Junior
 *
 */
public interface IUsuarioOps {

	/**
	 * @desc Faz a adição de um exemplar
	 * @param idExemplar
	 * @param idItem
	 * @param qtdExemplar
	 * @param tipo
	 * @param codigoIdentificador
	 * @param arquivodigital
	 * @return
	 */
	UsuarioOpsDT getUsuario(Long idUsuario);

	boolean podeBaixar(Long idUsuario, Long idExemplar);
	
	boolean podeInteragir(Long idUsuario, Long idExemplar);

	boolean podeConsultar(Long idUsuario, Long idExemplar);

	boolean podeGerenciar(Long idUsuario);

	String getPermissaoUsuario(Long idUsuario);
	
	String getTipoUsuario (Long idUsuario); 
	
	
	

}
