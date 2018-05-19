package br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov;


/**
 * Interface responsável para gerenciar os Exemplares neste caso o gerenciar é a
 * criação, atualização e remoção deixando, conforme o caso de uso, o gerenciar
 * para a interface de consulta.
 * 
 * @author Edival e Miguel Lima
 *
 */
public interface IGerenciarExemplar {
	/**
	 * @desc Salva um exemplar no acervo verificando a permissao do usuario para a
	 *       operacao
	 * @param exemplar
	 * @return Long id_exemplar cadastrato
	 */
	public Long saveExemplaraddExemplar(Long idExemplar, Long idItem, int qtdExemplar, String tipo,
			String codigoIdentificador, byte[] arquivodigital, Long idUsuario);

	/**
	 * @desc Atualiza um exemplar no acervo verificando a permissao do usuario para
	 *       a operacao
	 * @param exemplar
	 * @return boolean
	 */
	public boolean updateExemplar(Long idExemplar, Long idItem, int qtdExemplar, String tipo,
			String codigoIdentificador, byte[] arquivodigital, Long idUsuario);

	/**
	 * @desc Exclui um exemplar no acervo verificando a permissao do usuario para a
	 *       operacao
	 * @param exemplar
	 * @return boolean
	 */

	public boolean removeExemplar(Long idExemplar, Long idUsuario);

	/**
	 * @desc Marca um exemplar como disponivel verificando a permissao do usuario
	 *       para a operacao
	 * @param exemplar
	 * @return boolean
	 */
	public boolean setAvaliableExemplar(Long idExemplar, Long idUsuario);

	/**
	 * @desc Marca um exemplar como indisponivel verificando a permissao do usuario
	 *       para a operacao
	 * @param idExemplar
	 * @param idUsuario
	 * @return boolean
	 */
	public boolean setUnavaliableExemplar(Long idExemplar, Long idUsuario);
}
