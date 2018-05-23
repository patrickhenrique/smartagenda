package br.ufal.ic.ppgi.smartagenda.UsuarioOps.impl;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.usuariomgt.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.usuariomgt.spec.req.IPersistenceReq;
import br.ufal.ic.ppgi.smartagenda.usuariomgt.spec.dt.usuarioDT;
import br.ufal.ic.ppgi.smartagenda.usuariomgt.spec.dt.ItemDT;

/**
 * Responsável pelas modificacoes e consultas de usuarioes
 * 
 * @author Glevson
 *
 */
class UsuarioController {

	IManager manager;

	UsuarioController(IManager manager) {
		this.manager = manager;

	}

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
	Long addusuario(Long idusuario, Long idItem, int qtdusuario, String tipo, String codigoIdentificador,
			byte[] arquivodigital) {
		usuarioDT usuarioDt = new usuarioDT();
		usuarioDt.idusuario = idusuario;
		usuarioDt.idItem = idItem;
		usuarioDt.qtdusuario = qtdusuario;
		usuarioDt.tipo = tipo;
		usuarioDt.codigoIdentificador = codigoIdentificador;
		usuarioDt.arquivodigital = arquivodigital;

		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		return req.save(usuarioDt);

	}

	/**
	 * @desc Faz a adição de um usuario
	 * @param usuario
	 * @return
	 */
	Long addusuario(usuarioDT usuario) {

		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		return req.save(usuario);

	}
	/**
	 * @desc Faz a adição de um usuario
	 * @param usuario
	 * @return
	 */
	boolean editusuario(usuarioDT usuario) {

		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		boolean result = req.update(usuario);

		return result;

	}

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
	boolean editusuario(Long idusuario, Long idItem, int qtdusuario, String tipo, String codigoIdentificador,
			byte[] arquivodigital) {
		usuarioDT usuarioDt = new usuarioDT();
		usuarioDt.idusuario = idusuario;
		usuarioDt.idItem = idItem;
		usuarioDt.qtdusuario = qtdusuario;
		usuarioDt.tipo = tipo;
		usuarioDt.codigoIdentificador = codigoIdentificador;
		usuarioDt.arquivodigital = arquivodigital;

		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		Boolean result = req.update(usuarioDt);

		return result;
	}

	/**
	 * @desc Apaga um usuario com base do idusuario informado
	 * @param idusuario
	 * @return
	 */
	boolean deleteusuario(Long idusuario) {

		usuarioDT usuarioDt = new usuarioDT();
		usuarioDt.idusuario = idusuario;
		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");
		return req.remove(usuarioDt);

	}

	/**
	 * @desc Lista todos os usuarioes de determinado item
	 * @param Long
	 *            idItem
	 * @return List<usuarioDt>
	 */
	List<usuarioDT> getListusuarioItem(Long idItem) {

		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		List<usuarioDT> list = req.list(idItem);
		return list;

	}

	/**
	 * @desc Retorna um usuario com base no id informado
	 * @param idusuario
	 * @return usuarioDt
	 */
	usuarioDT getusuario(Long idusuario) {
		usuarioDT usuarioDt = new usuarioDT();
		usuarioDt.idusuario = idusuario;
		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		usuarioDt = req.get(idusuario);
		return usuarioDt;
	}

	/**
	 * 
	 * @param idusuario
	 * @param tipo
	 * @return
	 */
	usuarioDT getusuarioByTipo(Long idusuario, String tipo) {

		usuarioDT usuarioDt = new usuarioDT();
		usuarioDt.idusuario = idusuario;
		usuarioDt.tipo = tipo;
		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		usuarioDt = req.get(idusuario, tipo);

		return usuarioDt;
	}

	/**
	 * @desc Faz a pesquisa por meio de um usuario fornecido e retorna uma lista de
	 *       usuarioes encontrados
	 * @param usuarioDT
	 *            usuario
	 * @return List<usuarioDT>
	 */
	List<usuarioDT> searchusuario(usuarioDT usuario) {
		usuarioDT usuarioDt = new usuarioDT();
		usuarioDt.idusuario = usuario.idusuario;
		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		List<usuarioDT> usuarioList = req.search(usuarioDt);
		return usuarioList;
	}

	/**
	 * @desc Faz a busca de usuarioes a partir de um idItem informado
	 * @param Long
	 *            idItem
	 * @return List<usuarioDT>
	 */
	List<usuarioDT> searchusuario(Long idItem) {
		usuarioDT usuarioDt = new usuarioDT();
		usuarioDt.idItem = idItem;
		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		List<usuarioDT> usuarioList = req.search(usuarioDt.idItem);
		return usuarioList;
	}

	/**
	 * @desc Faz a busca de usuarioes a partir de um codigo identificador do
	 *       usuario informado
	 * @param String
	 *            codigoIdentificador
	 * @return List<usuarioDT>
	 */
	List<usuarioDT> searchusuario(String codigoIdentificador) {
		usuarioDT usuarioDt = new usuarioDT();
		usuarioDt.codigoIdentificador = codigoIdentificador;
		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		List<usuarioDT> usuarioList = req.search(usuarioDt.codigoIdentificador);
		return usuarioList;
	}

	/**
	 * @desc Faz a busca de usuarioes a partir de um codigo identificador do
	 *       usuario informado
	 * @param ItemDT
	 *            item
	 * @return List<usuarioDT>
	 */
	List<usuarioDT> searchusuario(ItemDT item) {

		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		List<usuarioDT> usuarioList = req.search(item);
		return usuarioList;
	}

	/**
	 * @desc Faz a busca de usuarioes a partir de um item e de um tipo de usuario
	 *       informado
	 * @param ItemDT
	 *            item
	 * @param String
	 *            tipo
	 * @return List<usuarioDT>
	 */
	List<usuarioDT> searchusuario(ItemDT item, String tipo) {
		usuarioDT usuarioDt = new usuarioDT();
		usuarioDt.idItem = item.idItem;
		usuarioDt.tipo = tipo;
		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		List<usuarioDT> usuarioList = req.search(item, usuarioDt.tipo);
		return usuarioList;
	}

}
