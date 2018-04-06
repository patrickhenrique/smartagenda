package br.ufal.ic.ppgi.smartagenda.exemplarmgt.impl;

import java.io.Serializable;
import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.req.IPersistenceReq;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ExemplarDt;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ItemDt;

/**
 * Responsável pela criacao de um exemplar
 * 
 * @author João Miguel e Edival
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
		ExemplarDt exemplarDt = new ExemplarDt();
		exemplarDt.idExemplar = idExemplar;
		exemplarDt.idItem = idItem;
		exemplarDt.qtdExemplar = qtdExemplar;
		exemplarDt.tipoExemplar = tipo;
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
		ExemplarDt exemplarDt = new ExemplarDt();
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

		ExemplarDt exemplarDt = new ExemplarDt();
		exemplarDt.idExemplar = idExemplar;
		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");
		return req.remove(exemplarDt);

	}

	/**
	 * @desc Lista todos os exemplares de determinado item
	 * @param idItem
	 * @return List<ExemplarDt>
	 */
	List<ExemplarDt> getListExemplarItem(Long idItem) {

		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		List<ExemplarDt> list = req.list(idItem);
		return list;

	}

	/**
	 * @desc Retorna um exemplar com base no id informado
	 * @param idExemplar
	 * @return ExemplarDt
	 */
	ExemplarDt getExemplar(Long idExemplar) {
		ExemplarDt exemplarDt = new ExemplarDt();
		exemplarDt.idExemplar = idExemplar;
		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");

		exemplarDt = req.get(idExemplar);
		return exemplarDt;
	}

}
