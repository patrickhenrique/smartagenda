package br.ufal.ic.ppgi.smartagenda.UsuarioOps.spec.prov;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.usuariormgt.spec.dt.usuariorDT;
import br.ufal.ic.ppgi.smartagenda.usuariormgt.spec.dt.ItemDT;

/**
 * @desc Interface do usuarior
 * 
 * @author Glevson
 *
 */
public interface IUsuario {

	/**
	 * @desc Faz a adição de um usuarior
	 * @param idusuarior
	 * @param idItem
	 * @param qtdusuarior
	 * @param tipo
	 * @param codigoIdentificador
	 * @param arquivodigital
	 * @return
	 */
	Long addusuarior(Long idusuarior, Long idItem, int qtdusuarior, String tipo, String codigoIdentificador,
			byte[] arquivodigital);
	/**
	 * @desc Faz a adicao de um usuarior quando recebido um objeto do tipo usuariorDt
	 * @param usuarior
	 * @return Long id_usuarior
	 */
	Long addusuarior(UsuariosDT usuarior);

	/**
	 * @desc Edita os atributos de um usuarior
	 * @param idusuarior
	 * @param idItem
	 * @param qtdusuarior
	 * @param tipo
	 * @param codigoIdentificador
	 * @param arquivodigital
	 * @return
	 */
	boolean editusuarior(Long idusuarior, Long idItem, int qtdusuarior, String tipo, String codigoIdentificador,
			byte[] arquivodigital);
	/**
	 * @desc Edita os atributos de um usuarior com  base em um objeto do tipo usuariorDt
	 * @param usuarior
	 * @return boolean
	 */
	boolean editusuarior(UsuariosDT usuarior);

	/**
	 * @desc Apaga um usuarior com base do idusuarior informado
	 * @param idusuarior
	 * @return
	 */
	boolean deleteusuarior(Long idusuarior);

	/**
	 * @desc Lista todos os usuariores de determinado item
	 * @param idItem
	 * @return List<usuariorDt>
	 */
	List<UsuariosDT> getListusuariorItem(Long idItem);

	/**
	 * @desc Retorna um usuarior com base no id informado
	 * @param idusuarior
	 * @return usuariorDt
	 */
	UsuariosDT getusuarior(Long idusuarior);

	/**
	 * @desc Retorna um usuarior somente se ele for de determinado tipo de midia
	 * @param idusuarior
	 * @param tipo
	 * @return
	 */
	UsuariosDT getusuariorByTipo(Long idusuarior, String tipo);

	/**
	 * @desc Faz a pesquisa por meio de um usuarior fornecido e retorna uma lista de
	 *       usuariores encontrados
	 * @param UsuariosDT
	 *            usuarior
	 * @return List<usuariorDT>
	 */
	List<UsuariosDT> searchusuarior(UsuariosDT usuarior);

	/**
	 * @desc Faz a busca de usuariores a partir de um idItem informado
	 * @param Long
	 *            idItem
	 * @return List<usuariorDT>
	 */
	List<UsuariosDT> searchusuarior(Long idItem);

	/**
	 * @desc Faz a busca de usuariores a partir de um codigo identificador do
	 *       usuarior informado
	 * @param String
	 *            codigoIdentificador
	 * @return List<usuariorDT>
	 */
	List<UsuariosDT> searchusuarior(String codigoIdentificador);

	/**
	 * @desc Faz a busca de usuariores a partir de um codigo identificador do
	 *       usuarior informado
	 * @param ItemDT
	 *            item
	 * @return List<usuariorDT>
	 */
	List<UsuariosDT> searchusuarior(ItemDT item);

	/**
	 * @desc Faz a busca de usuariores a partir de um item e de um tipo de usuarior
	 *       informado
	 * @param ItemDT
	 *            item
	 * @param String
	 *            tipo
	 * @return List<usuariorDT>
	 */
	List<UsuariosDT> searchusuarior(ItemDT item, String tipo);
}
