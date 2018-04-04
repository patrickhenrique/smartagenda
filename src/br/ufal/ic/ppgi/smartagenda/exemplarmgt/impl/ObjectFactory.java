package br.ufal.ic.ppgi.smartagenda.exemplarmgt.impl;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IManager;

class ObjectFactory {
	Exemplar exemplar;

	/**
	 * @desc Criacao de um novo exemplar na instanciação da factory
	 * @param manager
	 */
	public ObjectFactory(IManager manager) {

		this.exemplar = this.createExemplar(manager);
	}

	/**
	 * @desc Criação da factory sem criação concomitante de exemplar
	 */
	public ObjectFactory() {

	}

	/**
	 * @desc Cria um novo exemplar retornando ao método
	 * @param manager
	 * @return
	 */
	public Exemplar createExemplar(IManager manager) {

		Exemplar exemplar = new Exemplar(manager);
		return exemplar;

	}

}
