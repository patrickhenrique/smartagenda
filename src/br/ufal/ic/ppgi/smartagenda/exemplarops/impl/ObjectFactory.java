package br.ufal.ic.ppgi.smartagenda.exemplarops.impl;

import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IManager;

/**
 * @desc Classe responsável pela criação de instâncias de classes de
 *       implementação
 * @author Joao Miguel e Edival Junior
 *
 */
class ObjectFactory {
	IManager manager;
	BaixarExemplar baixarExemplar;
	ConsultarExemplar consultarExemplar;
	GerenciarExemplar gerenciarExemplar;

	/**
	 * @desc Criacao de um novo exemplar na instanciação da factory
	 * @param manager
	 */
	ObjectFactory(IManager manager) {
		this.manager = manager;
	}

	/**
	 * @desc Cria um novo baixarExemplar com base no manager
	 * @param manager
	 * @return
	 */
	BaixarExemplar createBaixarExemplar() {
		BaixarExemplar exemplar = new BaixarExemplar(this.manager);
		return exemplar;
	}

	/**
	 * @desc Cria um novo consultarExemplar com base no manager
	 * @return
	 */
	ConsultarExemplar createConsultarExemplar() {
		ConsultarExemplar exemplar = new ConsultarExemplar(this.manager);
		return exemplar;
	}

	/**
	 * @desc Cria um novo gerenciarExemplar com base no manager
	 * @return
	 */
	GerenciarExemplar createGerenciarExemplar() {
		GerenciarExemplar exemplar = new GerenciarExemplar(this.manager);
		return exemplar;
	}

}
