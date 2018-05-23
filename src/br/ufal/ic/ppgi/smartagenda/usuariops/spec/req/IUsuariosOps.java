package br.ufal.ic.ppgi.smartagenda.usuariops.spec.req;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.usuarioops.spec.dt.usuarioOpsDT;
import br.ufal.ic.ppgi.smartagenda.usuarioops.spec.dt.ItemOpsDT;

/**
 * @desc Interface do usuarioMgt para o uso das funcionalidades do Mgt
 * 
 * @author Glevson
 *
 */
public interface IUsuariosOps {

	/**
	 * @desc Faz a adição de um usuario
	 * @param idusuario
	 * @param idItem
	 * @param qtdusuario
	 * @param tipo
	 * @param codigoIdentificador
	 * @param arquivodigital
	 * @return
	 */
	Long addusuario(UsuariosOpsDT usuario);

	/**
	 * @desc Edita os atributos de um usuario
	 * @param idusuario
	 * @param idItem
	 * @param qtdusuario
	 * @param tipo
	 * @param codigoIdentificador
	 * @param arquivodigital
	 * @return
	 */
	boolean editusuario(UsuariosOpsDT usuario);

	/**
	 * @desc Apaga um usuario com base do idusuario informado
	 * @param idusuario
	 * @return
	 */
	boolean deleteusuario(Long idusuario);

	/**
	 * @desc Seta o usuario como disponivel
	 * @param idusuario
	 * @return
	 */
	boolean setAvaliable(Long idusuario);

	/**
	 * @desc Seta o usuario como indisponivel
	 * @param idusuario
	 * @return
	 */
	boolean setUnavaliable(Long idusuario);

	/**
	 * @desc Lista todos os usuarioes de determinado item
	 * @param idItem
	 * @return List<usuarioOpsDT>
	 */
	List<UsuariosOpsDT> getListusuarioItem(Long idItem);

	/**
	 * @desc Retorna um usuario com base no id informado
	 * @param idusuario
	 * @return usuarioOpsDT
	 */
	UsuariosOpsDT getusuario(Long idusuario);

	/**
	 * @desc Retorna um usuario com base no codigo identificador
	 * @param codigoIdentificador
	 * @return
	 */
	UsuariosOpsDT getusuario(String codigoIdentificador);

	/**
	 * @desc Retorna um usuario somente se ele for de determinado tipo de midia
	 * @param idusuario
	 * @param tipo
	 * @return
	 */
	UsuariosOpsDT getusuarioByTipo(Long idusuario, String tipo);

	/**
	 * @desc Faz a pesquisa por meio de um usuario fornecido e retorna uma lista de
	 *       usuarioes encontrados
	 * @param UsuariosOpsDT
	 *            usuario
	 * @return List<usuarioOpsDT>
	 */
	List<UsuariosOpsDT> searchusuario(UsuariosOpsDT usuario);

	/**
	 * @desc Faz a busca de usuarioes a partir de um idItem informado
	 * @param Long
	 *            idItem
	 * @return List<usuarioOpsDT>
	 */
	List<UsuariosOpsDT> searchusuario(Long idItem);

	/**
	 * @desc Faz a busca de usuarioes a partir de um codigo identificador do
	 *       usuario informado
	 * @param String
	 *            codigoIdentificador
	 * @return List<usuarioOpsDT>
	 */
	List<UsuariosOpsDT> searchusuario(String codigoIdentificador);

	/**
	 * @desc Faz a busca de usuarioes a partir de um codigo identificador do
	 *       usuario informado
	 * @param ItemDT
	 *            item
	 * @return List<usuarioOpsDT>
	 */
	List<UsuariosOpsDT> searchusuario(ItemOpsDT item);

	/**
	 * @desc Faz a busca de usuarioes a partir de um item e de um tipo de usuario
	 *       informado
	 * @param ItemDT
	 *            item
	 * @param String
	 *            tipo
	 * @return List<usuarioOpsDT>
	 */
	List<UsuariosOpsDT> searchusuario(Long idItem, String tipo);
}
