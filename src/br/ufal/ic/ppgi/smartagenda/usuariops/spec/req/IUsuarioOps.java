package br.ufal.ic.ppgi.smartagenda.usuariops.spec.req;


import br.ufal.ic.ppgi.smartagenda.usuariosops.spec.dt.UsuarioOpsDT;

/**
 * @desc Interface do usuariosMgt para o uso das funcionalidades do Mgt
 * 
 * @author Glevson
 *
 */
public interface IUsuarioOps {

	/**
	 * @desc Faz a adição de um usuarios
	 * @param idusuarios
	 * @param idItem
	 * @param qtdusuarios
	 * @param tipo
	 * @param codigoIdentificador
	 * @param arquivodigital
	 * @return
	 */
	UsuarioOpsDT getUsuario(Long idUsuario);

	boolean podeBaixar(Long idUsuario, Long idusuarios);
	
	boolean podeInteragir(Long idUsuario, Long idusuarios);

	boolean podeConsultar(Long idUsuario, Long idusuarios);

	boolean podeGerenciar(Long idUsuario);

	String getPermissaoUsuario(Long idUsuario);
	
	String getTipoUsuario (Long idUsuario); 
	
	
	

}
