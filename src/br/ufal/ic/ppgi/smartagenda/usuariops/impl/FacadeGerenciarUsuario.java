package br.ufal.ic.ppgi.smartagenda.usuariops.impl;

import br.ufal.ic.ppgi.smartagenda.usuarioops.spec.prov.IGerenciarusuario;
import br.ufal.ic.ppgi.smartagenda.usuarioops.spec.prov.IManager;

public class FacadeGerenciarUsuario implements IGerenciarusuario {

	Gerenciarusuario usuario;

	/**
	 * @desc No construtor cria um controller para usuario
	 */
	FacadeGerenciarUsuario (IManager manager) {

		ObjectFactory factory = new ObjectFactory(manager);

		this.usuario = factory.createGerenciarusuario();

	}


	@Override
	public boolean setAvaliableusuario(Long idusuario, Long idUsuario) {
		return this.usuario.setAvaliableusuario(idusuario, idUsuario);
	}

	@Override
	public boolean setUnavaliableusuario(Long idusuario, Long idUsuario) {
		return this.usuario.setUnavaliableusuario(idusuario, idUsuario);
	}

	@Override
	public Long saveusuarioaddusuario(Long idusuario, Long idItem, int qtdusuario, String tipo,
			String codigoIdentificador, byte[] arquivodigital, Long idUsuario) {
		return this.usuario.saveusuario(idusuario, idItem, qtdusuario, tipo, codigoIdentificador, arquivodigital, idUsuario);
	}

	@Override
	public boolean updateusuario(Long idusuario, Long idItem, int qtdusuario, String tipo,
			String codigoIdentificador, byte[] arquivodigital, Long idUsuario) {
		return this.usuario.updateusuario(idusuario, idItem, qtdusuario, tipo, codigoIdentificador, arquivodigital, idUsuario);
	}

	@Override
	public boolean removeusuario(Long idusuario, Long idUsuario) {
		// TODO Auto-generated method stub
		return false;
	}


}
