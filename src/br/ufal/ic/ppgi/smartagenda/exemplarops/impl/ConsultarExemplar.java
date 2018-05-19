package br.ufal.ic.ppgi.smartagenda.exemplarops.impl;

import java.io.Serializable;
import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ExemplarDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ExemplarOpsDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ItemOpsDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IConsultarExemplar;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.req.IExemplarOps;

class ConsultarExemplar implements Serializable {
	IManager manager;
	/**
	 * 
	 */
	private static final long serialVersionUID = 190392282141369552L;

	ConsultarExemplar(IManager manager) {
		this.manager = manager;

	}

	/**
	 * @desc Faz a busca de exemplar com base no id_exemplar informado
	 * @param idExemplar
	 * @return ExemplarOpsDT
	 */
	public ExemplarOpsDT consultarExemplar(Long idExemplar) {

		ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
		exemplarOpsDt.idExemplar = idExemplar;
		IExemplarOps req = (IExemplarOps) this.manager.getRequiredInterface("IExemplarOps");

		exemplarOpsDt = req.getExemplar(idExemplar);

		return exemplarOpsDt;
	}

	/**
	 * @desc Faz a busca de exemplar com base no codigo_identificador informado
	 * @param codigoIdentificador
	 * @return ExemplarOpsDT
	 */
	public ExemplarOpsDT consultarExemplar(String codigoIdentificador) {
		ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
		exemplarOpsDt.codigoIdentificador = codigoIdentificador;
		IExemplarOps req = (IExemplarOps) this.manager.getRequiredInterface("IExemplarOps");

		exemplarOpsDt = req.getExemplar(exemplarOpsDt.codigoIdentificador);

		return exemplarOpsDt;
	}

	/**
	 * @desc Faz a busca de exemplar com base no id_item informado
	 * @param idItem
	 * @return List<ExemplarOpsDT>
	 */
	public List<ExemplarOpsDT> consultarExemplarByItem(Long idItem) {
		ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
		exemplarOpsDt.idItem = idItem;
		IExemplarOps req = (IExemplarOps) this.manager.getRequiredInterface("IExemplarOps");

		List<ExemplarOpsDT> listExemplarDT = req.searchExemplar(exemplarOpsDt.idItem);

		return listExemplarDT;
	}

	/**
	 * @desc Faz a busca de exemplar com base no objeto item informado
	 * @param item
	 * @return List<ExemplarOpsDT>
	 */
	public List<ExemplarOpsDT> consultarExemplarByItem(ItemOpsDT item) {

		IExemplarOps req = (IExemplarOps) this.manager.getRequiredInterface("IExemplarOps");

		List<ExemplarOpsDT> listExemplarDT = req.searchExemplar(item);

		return listExemplarDT;
	}

	/**
	 * @desc Faz a busca de exemplar com base no id_item e no tipo específico
	 *       informado
	 * @param idItem
	 * @param tipo
	 * @return List<ExemplarOpsDT>
	 */
	public List<ExemplarOpsDT> consultarExemplarByTipo(Long idItem, String tipo) {
		ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
		exemplarOpsDt.idItem = idItem;
		exemplarOpsDt.tipo = tipo;
		IExemplarOps req = (IExemplarOps) this.manager.getRequiredInterface("IExemplarOps");

		List<ExemplarOpsDT> listExemplarDT = req.searchExemplar(exemplarOpsDt.idItem, exemplarOpsDt.tipo = tipo);

		return listExemplarDT;
	}

}
