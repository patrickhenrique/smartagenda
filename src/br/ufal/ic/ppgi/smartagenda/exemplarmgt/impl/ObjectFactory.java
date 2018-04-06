package br.ufal.ic.ppgi.smartagenda.exemplarmgt.impl;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IManager;

class ObjectFactory {
	ExemplarController exemplar;

	/**
	 * @desc Criacao de um novo exemplar na instanciação da factory
	 * @param manager
	 */
	public ObjectFactory() {

		this.exemplar = this.createExemplar();
	}


	/**
	 * @desc Cria um novo exemplar retornando ao método
	 * @param manager
	 * @return
	 */
	public ExemplarController createExemplar() {

		IManager manager = new Manager();
		ExemplarController exemplar = new ExemplarController(manager);
		return exemplar;

	}

}
