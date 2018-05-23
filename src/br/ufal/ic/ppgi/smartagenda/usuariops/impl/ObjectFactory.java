package br.ufal.ic.ppgi.smartagenda.usuariops.impl;

import br.ufal.ic.ppgi.smartagenda.usuarioops.spec.prov.IManager;

/**
 * @desc Classe responsável pela criação de instâncias de classes de
 *       implementação
 * @author Glevson
 *
 */
class ObjectFactory {
	IManager manager;
	Baixarusuario baixarusuario;
	ConsultarUsuario consultarusuario;
	GerenciarUsuario gerenciarusuario;

	/**
	 * @desc Criacao de um novo usuario na instanciação da factory
	 * @param manager
	 */
	ObjectFactory(IManager manager) {
		this.manager = manager;
	}

	/**
	 * @desc Cria um novo baixarusuario com base no manager
	 * @param manager
	 * @return
	 */
	Baixarusuario createBaixarusuario() {
		Baixarusuario usuario = new Baixarusuario(this.manager);
		return usuario;
	}

	/**
	 * @desc Cria um novo consultarusuario com base no manager
	 * @return
	 */
	ConsultarUsuario createConsultarusuario() {
		ConsultarUsuario usuario = new ConsultarUsuario(this.manager);
		return usuario;
	}

	/**
	 * @desc Cria um novo gerenciarusuario com base no manager
	 * @return
	 */
	GerenciarUsuario createGerenciarusuario() {
		GerenciarUsuario usuario = new GerenciarUsuario(this.manager);
		return usuario;
	}

}
