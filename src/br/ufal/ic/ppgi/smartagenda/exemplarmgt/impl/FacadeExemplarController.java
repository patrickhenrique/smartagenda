package br.ufal.ic.ppgi.smartagenda.exemplarmgt.impl;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ExemplarDT;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IExemplar;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IManager;

/**
 * @desc Classe que implementa uma interface provida
 * @author Joao Miguel e Edival Junior
 *
 */
class FacadeExemplarController implements IExemplar {

	ExemplarController exemplarController;

	/**
	 * @desc No construtor cria um controller para exemplar
	 */
	FacadeExemplarController(IManager manager) {

		ObjectFactory factory = new ObjectFactory(manager);

		this.exemplarController = factory.createExemplarController(manager);

	}

	@Override
	public Long addExemplar(Long idExemplar, Long idItem, int qtdExemplar, String tipo, String codigoIndentificador,
			byte[] arquivodigital) {
		return this.exemplarController.addExemplar(idExemplar, idItem, qtdExemplar, tipo, codigoIndentificador,
				arquivodigital);
	}

	@Override
	public Boolean editExemplar(Long idExemplar, Long idItem, int qtdExemplar, String tipo, String codigoIndentificador,
			byte[] arquivodigital) {
		return this.exemplarController.editExemplar(idExemplar, idItem, qtdExemplar, tipo, codigoIndentificador, arquivodigital);
	}

	@Override
	public boolean deleteExemplar(Long idExemplar) {
		return this.exemplarController.deleteExemplar(idExemplar);
	}

	@Override
	public List<ExemplarDT> getListExemplarItem(Long idItem) {
		return this.exemplarController.getListExemplarItem(idItem);
	}

	@Override
	public ExemplarDT getExemplar(Long idExemplar) {
		return this.exemplarController.getExemplar(idExemplar);
	}

}
