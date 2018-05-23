package br.ufal.ic.ppgi.smartagenda.UsuarioOps.impl;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.Usuariomgt.spec.dt.UsuarioDT;
import br.ufal.ic.ppgi.smartagenda.Usuariomgt.spec.dt.ItemDT;
import br.ufal.ic.ppgi.smartagenda.Usuariomgt.spec.prov.IUsuario;
import br.ufal.ic.ppgi.smartagenda.Usuariomgt.spec.prov.IManager;

/**
 * @desc Classe que implementa uma interface provida
 * @author Glevson
 *
 */
class FacadeUsuarioController implements IUsuario {

	UsuarioController UsuarioController;

	/**
	 * @desc No construtor cria um controller para Usuario
	 */
	FacadeUsuarioController(IManager manager) {

		ObjectFactory factory = new ObjectFactory(manager);

		this.usuarioController = factory.createUsuarioController();

	}

	@Override
	public Long addUsuario(Long idUsuario, Long idItem, int qtdUsuario, String tipo, String codigoIdentificador,
			byte[] arquivodigital) {
		return this.UsuarioController.addUsuario(idUsuario, idItem, qtdUsuario, tipo, codigoIdentificador,
				arquivodigital);
	}

	@Override
	public Long addUsuario(UsuarioDT Usuario) {
		return this.UsuarioController.addUsuario(Usuario);
	}

	@Override
	public boolean editUsuario(Long idUsuario, Long idItem, int qtdUsuario, String tipo, String codigoIdentificador,
			byte[] arquivodigital) {
		return this.UsuarioController.editUsuario(idUsuario, idItem, qtdUsuario, tipo, codigoIdentificador,
				arquivodigital);
	}

	@Override
	public boolean editUsuario(UsuarioDT Usuario) {
		return this.UsuarioController.editUsuario(Usuario);
	}

	@Override
	public boolean deleteUsuario(Long idUsuario) {
		return this.UsuarioController.deleteUsuario(idUsuario);
	}

	@Override
	public List<UsuarioDT> getListUsuarioItem(Long idItem) {
		return this.UsuarioController.getListUsuarioItem(idItem);
	}

	@Override
	public UsuarioDT getUsuario(Long idUsuario) {
		return this.UsuarioController.getUsuario(idUsuario);
	}

	@Override
	public List<UsuarioDT> searchUsuario(ItemDT idItem, String tipo) {

		return this.UsuarioController.searchUsuario(idItem, tipo);
	}

	@Override
	public List<UsuarioDT> searchUsuario(UsuarioDT Usuario) {
		return this.UsuarioController.searchUsuario(Usuario);
	}

	@Override
	public List<UsuarioDT> searchUsuario(Long idItem) {
		return this.UsuarioController.searchUsuario(idItem);
	}

	@Override
	public List<UsuarioDT> searchUsuario(String codigoIdentificador) {
		return this.UsuarioController.searchUsuario(codigoIdentificador);
	}

	@Override
	public List<UsuarioDT> searchUsuario(ItemDT item) {
		return this.UsuarioController.searchUsuario(item);
	}

	@Override
	public UsuarioDT getUsuarioByTipo(Long idUsuario, String tipo) {
		return this.UsuarioController.getUsuarioByTipo(idUsuario, tipo);
	}

}
