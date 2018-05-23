package br.ufal.ic.ppgi.smartagenda.UsuarioOps.impl;

import br.ufal.ic.ppgi.smartagenda.usuariomgt.spec.prov.IManager;

/**
 * @desc Classe responsável pela criação de instâncias de classes de
 *       implementação
 * @author Glevson
 *
 */
class ObjectFactory {
	IManager manager;
	UsuarioController usuarioController;

	/**
	 * @desc Criacao de um novo usuario na instanciação da factory
	 * @param manager
	 */
	ObjectFactory(IManager manager) {
		this.manager = manager;
	}

	/**
	 * @desc Cria um novo usuarioController com base no manager
	 * @param manager
	 * @return
	 */
	UsuarioController createusuarioController() {
		UsuarioController usuarioController = new UsuarioController(this.manager);
		return usuarioController;
	}

}
