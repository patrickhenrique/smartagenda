package br.ufal.ic.ppgi.smartagenda.usuariops.impl;

import java.io.Serializable;

import br.ufal.ic.ppgi.smartagenda.usuarioops.spec.dt.usuarioOpsDT;
import br.ufal.ic.ppgi.smartagenda.usuarioops.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.usuarioops.spec.req.IusuarioOps;
import br.ufal.ic.ppgi.smartagenda.usuarioops.spec.req.IUsuarioOps;

class GerenciarUsuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 670309219658176585L;
	IManager manager;

	GerenciarUsuario(IManager manager) {
		this.manager = manager;

	}

	/**
	 * @desc Faz a adição de um usuario ao acervo
	 * @param idusuario
	 * @param idItem
	 * @param qtdusuario
	 * @param tipo
	 * @param codigoIdentificador
	 * @param arquivodigital
	 * @param idUsuario
	 * @return
	 */
	public Long saveusuario(Long idusuario, Long idItem, int qtdusuario, String tipo, String codigoIdentificador,
			byte[] arquivodigital, Long idUsuario) {

		IUsuarioOps user = (IUsuarioOps) this.manager.getRequiredInterface("IUsuarioOps");
		boolean result = user.podeGerenciar(idUsuario);

		if (result) {

			usuarioOpsDT usuarioOpsDt = new usuarioOpsDT();
			usuarioOpsDt.idusuario = idusuario;
			usuarioOpsDt.idItem = idItem;
			usuarioOpsDt.qtdusuario = qtdusuario;
			usuarioOpsDt.tipo = tipo;
			usuarioOpsDt.codigoIdentificador = codigoIdentificador;
			usuarioOpsDt.arquivodigital = arquivodigital;

			IusuarioOps req = (IusuarioOps) this.manager.getRequiredInterface("IusuarioOps");

			Long id = req.addusuario(usuarioOpsDt);

			return id;
		}
		return null;
	}

	/**
	 * @desc Faz a atualizacao dos dados de um usuario ao acervo
	 * @param idusuario
	 * @param idItem
	 * @param qtdusuario
	 * @param tipo
	 * @param codigoIdentificador
	 * @param arquivodigital
	 * @param idUsuario
	 * @return
	 */
	public boolean updateusuario(Long idusuario, Long idItem, int qtdusuario, String tipo,
			String codigoIdentificador, byte[] arquivodigital, Long idUsuario) {
		IUsuarioOps user = (IUsuarioOps) this.manager.getRequiredInterface("IUsuarioOps");
		boolean result = user.podeGerenciar(idUsuario);

		if (result) {

			usuarioOpsDT usuarioOpsDt = new usuarioOpsDT();
			usuarioOpsDt.idusuario = idusuario;
			usuarioOpsDt.idItem = idItem;
			usuarioOpsDt.qtdusuario = qtdusuario;
			usuarioOpsDt.tipo = tipo;
			usuarioOpsDt.codigoIdentificador = codigoIdentificador;
			usuarioOpsDt.arquivodigital = arquivodigital;

			IusuarioOps req = (IusuarioOps) this.manager.getRequiredInterface("IusuarioOps");

			boolean verif = req.editusuario(usuarioOpsDt);

			return verif;
		}
		return false;
	}

	/**
	 * @desc Faz a remocao de um usuario do acervo
	 * @param idusuario
	 * @param idUsuario
	 * @return
	 */
	public boolean removeusuario(Long idusuario, Long idUsuario) {
		IUsuarioOps user = (IUsuarioOps) this.manager.getRequiredInterface("IUsuarioOps");
		boolean result = user.podeGerenciar(idUsuario);

		if (result) {

			usuarioOpsDT usuarioOpsDt = new usuarioOpsDT();
			usuarioOpsDt.idusuario = idusuario;

			IusuarioOps req = (IusuarioOps) this.manager.getRequiredInterface("IusuarioOps");

			boolean verif = req.deleteusuario(usuarioOpsDt.idusuario);

			return verif;
		}
		return false;
	}

	/**
	 * @desc Informa como disponivel para uso pelo sistema um usuario ao acervo
	 * @param idusuario
	 * @param idUsuario
	 * @return
	 */
	public boolean setAvaliableusuario(Long idusuario, Long idUsuario) {
		IUsuarioOps user = (IUsuarioOps) this.manager.getRequiredInterface("IUsuarioOps");
		boolean result = user.podeGerenciar(idUsuario);

		if (result) {

			usuarioOpsDT usuarioOpsDt = new usuarioOpsDT();
			usuarioOpsDt.idusuario = idusuario;

			IusuarioOps req = (IusuarioOps) this.manager.getRequiredInterface("IusuarioOps");

			boolean verif = req.setAvaliable(idusuario);

			return verif;
		}
		return false;
	}

	/**
	 * @desc Informa como indisponivel para uso pelo sistema um usuario ao acervo
	 * @param idusuario
	 * @param idUsuario
	 * @return
	 */
	public boolean setUnavaliableusuario(Long idusuario, Long idUsuario) {
		IUsuarioOps user = (IUsuarioOps) this.manager.getRequiredInterface("IUsuarioOps");
		boolean result = user.podeGerenciar(idUsuario);

		if (result) {

			usuarioOpsDT usuarioOpsDt = new usuarioOpsDT();
			usuarioOpsDt.idusuario = idusuario;

			IusuarioOps req = (IusuarioOps) this.manager.getRequiredInterface("IusuarioOps");

			boolean verif = req.setUnavaliable(idusuario);

			return verif;
		}
		return false;
	}

}
