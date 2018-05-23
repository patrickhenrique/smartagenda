package br.ufal.ic.ppgi.smartagenda.usuariops.spec.prov;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.usuarioops.spec.dt.usuarioOpsDT;
import br.ufal.ic.ppgi.smartagenda.usuarioops.spec.dt.ItemOpsDT;

/**
 * 
 * @author Glevson
 *
 */
public interface IConsultarUsuario {
	/**
	 * @desc Permite a consulta das caracteristicas de um usuario informado pelo id
	 * @param idusuario
	 * @return usuarioOpsDT
	 */
	public UsuariosOpsDT consultarusuario(Long idusuario);

	/**
	 * @desc Permite a consulta das características de um usuario se for fornecido
	 *       o codigo identificador
	 * @param codigoIdentificador
	 * @return usuarioOpsDT
	 */
	public UsuariosOpsDT consultarusuario(String codigoIdentificador);

	/**
	 * @desc Permite a consutla de todos os usuarioes para um item informado pelo
	 *       id
	 * @param idItem
	 * @return List<usuarioOpsDT>
	 */
	public List<UsuariosOpsDT> consultarusuarioByItem(Long idItem);

	/**
	 * @desc Consulta os usuarioes cadastrados para um item, desde que sejam de
	 *       determinado tipo
	 * @param idItem
	 * @param tipo
	 * @return List<usuarioOpsDT>
	 */
	public List<UsuariosOpsDT> consultarusuarioByTipo(Long idItem, String tipo);
	/**
	 * 
	 * @param idItem
	 * @return
	 */
	public List<UsuariosOpsDT> consultarusuarioByItem(ItemOpsDT idItem);

}
