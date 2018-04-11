package br.ufal.ic.ppgi.smartagenda.exemplarmgt.impl;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IManager;

class ObjectFactory {
	ExemplarController exemplarController;

	/**
	 * @desc Criacao de um novo exemplar na instanciação da factory
	 * @param manager
	 */
	public ObjectFactory() {

		this.exemplarController = this.createExemplarController();
	}


	/**
	 * @desc Cria um novo exemplarController com base no manager
	 * @param manager
	 * @return
	 */
	public ExemplarController createExemplarController() {

		IManager manager = (IManager) new Manager();
		ExemplarController exemplarController = new ExemplarController(manager);
		return exemplarController;

	}

}
