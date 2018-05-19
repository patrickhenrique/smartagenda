package br.ufal.ic.ppgi.smartagenda.exemplarops.spec.req;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ExemplarDT;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ItemDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ExemplarOpsDT;
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
	 * @param codigoIndentificador
	 * @param arquivodigital
	 * @return
	 */
	UsuarioOpsDT getUsuario(Long idUsuario);

	boolean podeBaixar(Long idUsuario, Long idExemplar);

	boolean podeConsultar(Long idUsuario, Long idExemplar);

	boolean podeGerenciar(Long idUsuario, Long idExemplar);

	String getPermissaoUsuario(Long idUsuario);
	
	String getTipoUsuario (Long idUsuario); 
	
	
	

}
