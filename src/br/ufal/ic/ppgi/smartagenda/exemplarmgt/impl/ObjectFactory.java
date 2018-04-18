package br.ufal.ic.ppgi.smartagenda.exemplarmgt.impl;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IManager;

/**
 * @desc Classe responsável pela criação de instâncias de classes de
 *       implementação
 * @author Joao Miguel e Edival Junior
 *
 */
class ObjectFactory {
	IManager manager;
	ExemplarController exemplarController;

	/**
	 * @desc Criacao de um novo exemplar na instanciação da factory
	 * @param manager
	 */
	ObjectFactory(IManager manager) {
		this.manager = manager;
	}

	/**
	 * @desc Cria um novo exemplarController com base no manager
	 * @param manager
	 * @return
	 */
	ExemplarController createExemplarController() {
		ExemplarController exemplarController = new ExemplarController(this.manager);
		return exemplarController;
	}

}
