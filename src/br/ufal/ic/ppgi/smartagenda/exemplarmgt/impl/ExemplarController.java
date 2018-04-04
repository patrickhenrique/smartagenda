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

	boolean addExemplar(Long idItem, Long qtdExemplar, String tipo, String codigoIndentificador,
			byte[] arquivodigital) {

		return true;
	}

	long editExemplar(Long idExemplar, Long idItem, int qtdExemplar, String tipo, String codigoIndentificador,
			byte[] arquivodigital) {
		ExemplarDt exemplarDt = new ExemplarDt();
		exemplarDt.idexemplar = idExemplar;
		exemplarDt.idItem = idItem;
		exemplarDt.qtdExemplar = qtdExemplar;
		exemplarDt.tipo = tipo;
		exemplarDt.codigoIndentificador = codigoIndentificador;
		exemplarDt.arquivodigital = arquivodigital;

		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");
		req.update(exemplarDt);

		return idExemplar;
	}

	/**
	 * 
	 * @param idExemplar
	 * @return
	 */
	boolean deleteExemplar(Long idExemplar) {

		ExemplarDt exemplarDt = new ExemplarDt();
		exemplarDt.idexemplar = idExemplar;
		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");
		req.remove(exemplarDt);

		return true;
	}

	List<ExemplarDt> getExemplar(Long idItem) {
		
		ExemplarDt exemplarDt = new ExemplarDt();
		exemplarDt.idexemplar = idExemplar;
		IPersistenceReq req = (IPersistenceReq) this.manager.getRequiredInterface("IPersistenceReq");
		req.remove(exemplarDt);
		
		
		

	}

	

}
