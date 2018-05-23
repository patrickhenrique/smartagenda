package br.ufal.ic.ppgi.smartagenda.usuariops.impl;

import java.io.Serializable;
import java.util.List;


import br.ufal.ic.ppgi.smartagenda.usuarioops.spec.dt.usuarioOpsDT;
import br.ufal.ic.ppgi.smartagenda.usuarioops.spec.dt.ItemOpsDT;
import br.ufal.ic.ppgi.smartagenda.usuarioops.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.usuarioops.spec.req.IusuarioOps;

class ConsultarUsuario implements Serializable {
	IManager manager;
	/**
	 * 
	 */
	private static final long serialVersionUID = 190392282141369552L;

	ConsultarUsuario(IManager manager) {
		this.manager = manager;

	}

	/**
	 * @desc Faz a busca de usuario com base no id_usuario informado
	 * @param idusuario
	 * @return usuarioOpsDT
	 */
	public usuarioOpsDT consultarusuario(Long idusuario) {

		usuarioOpsDT usuarioOpsDt = new usuarioOpsDT();
		usuarioOpsDt.idusuario = idusuario;
		IusuarioOps req = (IusuarioOps) this.manager.getRequiredInterface("IusuarioOps");

		usuarioOpsDt = req.getusuario(idusuario);

		return usuarioOpsDt;
	}

	/**
	 * @desc Faz a busca de usuario com base no codigo_identificador informado
	 * @param codigoIdentificador
	 * @return usuarioOpsDT
	 */
	public usuarioOpsDT consultarusuario(String codigoIdentificador) {
		usuarioOpsDT usuarioOpsDt = new usuarioOpsDT();
		usuarioOpsDt.codigoIdentificador = codigoIdentificador;
		IusuarioOps req = (IusuarioOps) this.manager.getRequiredInterface("IusuarioOps");

		usuarioOpsDt = req.getusuario(usuarioOpsDt.codigoIdentificador);

		return usuarioOpsDt;
	}

	/**
	 * @desc Faz a busca de usuario com base no id_item informado
	 * @param idItem
	 * @return List<usuarioOpsDT>
	 */
	public List<usuarioOpsDT> consultarusuarioByItem(Long idItem) {
		usuarioOpsDT usuarioOpsDt = new usuarioOpsDT();
		usuarioOpsDt.idItem = idItem;
		IusuarioOps req = (IusuarioOps) this.manager.getRequiredInterface("IusuarioOps");

		List<usuarioOpsDT> listusuarioDT = req.searchusuario(usuarioOpsDt.idItem);

		return listusuarioDT;
	}

	/**
	 * @desc Faz a busca de usuario com base no objeto item informado
	 * @param item
	 * @return List<usuarioOpsDT>
	 */
	public List<usuarioOpsDT> consultarusuarioByItem(ItemOpsDT item) {

		IusuarioOps req = (IusuarioOps) this.manager.getRequiredInterface("IusuarioOps");

		List<usuarioOpsDT> listusuarioDT = req.searchusuario(item);

		return listusuarioDT;
	}

	/**
	 * @desc Faz a busca de usuario com base no id_item e no tipo específico
	 *       informado
	 * @param idItem
	 * @param tipo
	 * @return List<usuarioOpsDT>
	 */
	public List<usuarioOpsDT> consultarusuarioByTipo(Long idItem, String tipo) {
		usuarioOpsDT usuarioOpsDt = new usuarioOpsDT();
		usuarioOpsDt.idItem = idItem;
		usuarioOpsDt.tipo = tipo;
		IusuarioOps req = (IusuarioOps) this.manager.getRequiredInterface("IusuarioOps");

		List<usuarioOpsDT> listusuarioDT = req.searchusuario(usuarioOpsDt.idItem, usuarioOpsDt.tipo = tipo);

		return listusuarioDT;
	}

}
