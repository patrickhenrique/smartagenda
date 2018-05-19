package br.ufal.ic.ppgi.smartagenda.exemplarmgt.impl;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.req.IPersistenceReq;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ExemplarDT;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ItemDT;

/**
 * Responsável pelas modificacoes e consultas de exemplares
 * 
 * @author João Miguel e Edival Junior
 *
 */
class ExemplarController {

	IManager manager;

	ExemplarController(IManager manager) {
		this.manager = manager;

	}

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
	Long addExemplar(Long idExemplar, Long idItem, int qtdExemplar, String tipo, String codigoIndentificador,
			byte[] arquivodigital) {
		ExemplarDT exemplarDt = new ExemplarDT();
		exemplarDt.idExemplar = idExemplar;
		exemplarDt.idItem = idItem;
		exemplarDt.qtdExemplar = qtdExemplar;
		exemplarDt.tipo = tipo;
		exemplarDt.codigoIndentificador = codigoIndentificador;
		exemplarDt.arquivodigital = arquivodigital;

		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		return req.save(exemplarDt);

	}

	/**
	 * @desc Edita os atributos de um exemplar
	 * @param idExemplar
	 * @param idItem
	 * @param qtdExemplar
	 * @param tipo
	 * @param codigoIndentificador
	 * @param arquivodigital
	 * @return
	 */
	Boolean editExemplar(Long idExemplar, Long idItem, int qtdExemplar, String tipo, String codigoIndentificador,
			byte[] arquivodigital) {
		ExemplarDT exemplarDt = new ExemplarDT();
		exemplarDt.idExemplar = idExemplar;
		exemplarDt.idItem = idItem;
		exemplarDt.qtdExemplar = qtdExemplar;
		exemplarDt.tipo = tipo;
		exemplarDt.codigoIndentificador = codigoIndentificador;
		exemplarDt.arquivodigital = arquivodigital;

		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		Boolean result = req.update(exemplarDt);

		return result;
	}

	/**
	 * @desc Apaga um exemplar com base do idExemplar informado
	 * @param idExemplar
	 * @return
	 */
	boolean deleteExemplar(Long idExemplar) {

		ExemplarDT exemplarDt = new ExemplarDT();
		exemplarDt.idExemplar = idExemplar;
		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");
		return req.remove(exemplarDt);

	}

	/**
	 * @desc Lista todos os exemplares de determinado item
	 * @param Long
	 *            idItem
	 * @return List<ExemplarDt>
	 */
	List<ExemplarDT> getListExemplarItem(Long idItem) {

		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		List<ExemplarDT> list = req.list(idItem);
		return list;

	}

	/**
	 * @desc Retorna um exemplar com base no id informado
	 * @param idExemplar
	 * @return ExemplarDt
	 */
	ExemplarDT getExemplar(Long idExemplar) {
		ExemplarDT exemplarDt = new ExemplarDT();
		exemplarDt.idExemplar = idExemplar;
		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		exemplarDt = req.get(idExemplar);
		return exemplarDt;
	}

	/**
	 * @desc Faz a pesquisa por meio de um exemplar fornecido e retorna uma lista de
	 *       exemplares encontrados
	 * @param ExemplarDT
	 *            exemplar
	 * @return List<ExemplarDT>
	 */
	List<ExemplarDT> searchExemplar(ExemplarDT exemplar) {
		ExemplarDT exemplarDt = new ExemplarDT();
		exemplarDt.idExemplar = exemplar.idExemplar;
		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		List<ExemplarDT> exemplarList = req.search(exemplarDt);
		return exemplarList;
	}

	/**
	 * @desc Faz a busca de exemplares a partir de um idItem informado
	 * @param Long
	 *            idItem
	 * @return List<ExemplarDT>
	 */
	List<ExemplarDT> searchExemplar(Long idItem) {
		ExemplarDT exemplarDt = new ExemplarDT();
		exemplarDt.idItem = idItem;
		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		List<ExemplarDT> exemplarList = req.search(exemplarDt.idItem);
		return exemplarList;
	}

	/**
	 * @desc Faz a busca de exemplares a partir de um codigo identificador do
	 *       exemplar informado
	 * @param String
	 *            codigoIdentificador
	 * @return List<ExemplarDT>
	 */
	List<ExemplarDT> searchExemplar(String codigoIdentificador) {
		ExemplarDT exemplarDt = new ExemplarDT();
		exemplarDt.codigoIndentificador = codigoIdentificador;
		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		List<ExemplarDT> exemplarList = req.search(exemplarDt.codigoIndentificador);
		return exemplarList;
	}

	/**
	 * @desc Faz a busca de exemplares a partir de um codigo identificador do
	 *       exemplar informado
	 * @param ItemDT
	 *            item
	 * @return List<ExemplarDT>
	 */
	List<ExemplarDT> searchExemplar(ItemDT item) {

		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		List<ExemplarDT> exemplarList = req.search(item);
		return exemplarList;
	}

	/**
	 * @desc Faz a busca de exemplares a partir de um item e de um tipo de exemplar
	 *       informado
	 * @param ItemDT
	 *            item
	 * @param String
	 *            tipo
	 * @return List<ExemplarDT>
	 */
	List<ExemplarDT> searchExemplar(ItemDT item, String tipo) {
		ExemplarDT exemplarDt = new ExemplarDT();
		exemplarDt.idItem = item.idItem;
		exemplarDt.tipo = tipo;
		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		List<ExemplarDT> exemplarList = req.search(item, exemplarDt.tipo);
		return exemplarList;
	}

}
