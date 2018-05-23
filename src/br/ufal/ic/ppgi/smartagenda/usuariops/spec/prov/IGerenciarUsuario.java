package br.ufal.ic.ppgi.smartagenda.usuariops.spec.prov;


/**
 * Interface responsável para gerenciar os usuarioes neste caso o gerenciar é a
 * criação, atualização e remoção deixando, conforme o caso de uso, o gerenciar
 * para a interface de consulta.
 * 
 * @author Glevson
 *
 */
public interface IGerenciarUsuario {
	/**
	 * @desc Salva um usuario no acervo verificando a permissao do usuario para a
	 *       operacao
	 * @param usuario
	 * @return Long id_usuario cadastrato
	 */
	public Long saveusuarioaddusuario(Long idusuario, Long idItem, int qtdusuario, String tipo,
			String codigoIdentificador, byte[] arquivodigital, Long idUsuario);

	/**
	 * @desc Atualiza um usuario no acervo verificando a permissao do usuario para
	 *       a operacao
	 * @param usuario
	 * @return boolean
	 */
	public boolean updateusuario(Long idusuario, Long idItem, int qtdusuario, String tipo,
			String codigoIdentificador, byte[] arquivodigital, Long idUsuario);

	/**
	 * @desc Exclui um usuario no acervo verificando a permissao do usuario para a
	 *       operacao
	 * @param usuario
	 * @return boolean
	 */

	public boolean removeusuario(Long idusuario, Long idUsuario);

	/**
	 * @desc Marca um usuario como disponivel verificando a permissao do usuario
	 *       para a operacao
	 * @param usuario
	 * @return boolean
	 */
	public boolean setAvaliableusuario(Long idusuario, Long idUsuario);

	/**
	 * @desc Marca um usuario como indisponivel verificando a permissao do usuario
	 *       para a operacao
	 * @param idusuario
	 * @param idUsuario
	 * @return boolean
	 */
	public boolean setUnavaliableusuario(Long idusuario, Long idUsuario);
}
