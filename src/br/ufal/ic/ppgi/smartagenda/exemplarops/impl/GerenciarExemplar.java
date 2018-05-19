package br.ufal.ic.ppgi.smartagenda.exemplarops.impl;

import java.io.Serializable;

import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ExemplarOpsDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.req.IExemplarOps;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.req.IUsuarioOps;

class GerenciarExemplar implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 670309219658176585L;
	IManager manager;

	GerenciarExemplar(IManager manager) {
		this.manager = manager;

	}

	/**
	 * @desc Faz a adição de um exemplar ao acervo
	 * @param idExemplar
	 * @param idItem
	 * @param qtdExemplar
	 * @param tipo
	 * @param codigoIdentificador
	 * @param arquivodigital
	 * @param idUsuario
	 * @return
	 */
	public Long saveExemplar(Long idExemplar, Long idItem, int qtdExemplar, String tipo, String codigoIdentificador,
			byte[] arquivodigital, Long idUsuario) {

		IUsuarioOps user = (IUsuarioOps) this.manager.getRequiredInterface("IUsuarioOps");
		boolean result = user.podeGerenciar(idUsuario);

		if (result) {

			ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
			exemplarOpsDt.idExemplar = idExemplar;
			exemplarOpsDt.idItem = idItem;
			exemplarOpsDt.qtdExemplar = qtdExemplar;
			exemplarOpsDt.tipo = tipo;
			exemplarOpsDt.codigoIdentificador = codigoIdentificador;
			exemplarOpsDt.arquivodigital = arquivodigital;

			IExemplarOps req = (IExemplarOps) this.manager.getRequiredInterface("IExemplarOps");

			Long id = req.addExemplar(exemplarOpsDt);

			return id;
		}
		return null;
	}

	/**
	 * @desc Faz a atualizacao dos dados de um exemplar ao acervo
	 * @param idExemplar
	 * @param idItem
	 * @param qtdExemplar
	 * @param tipo
	 * @param codigoIdentificador
	 * @param arquivodigital
	 * @param idUsuario
	 * @return
	 */
	public boolean updateExemplar(Long idExemplar, Long idItem, int qtdExemplar, String tipo,
			String codigoIdentificador, byte[] arquivodigital, Long idUsuario) {
		IUsuarioOps user = (IUsuarioOps) this.manager.getRequiredInterface("IUsuarioOps");
		boolean result = user.podeGerenciar(idUsuario);

		if (result) {

			ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
			exemplarOpsDt.idExemplar = idExemplar;
			exemplarOpsDt.idItem = idItem;
			exemplarOpsDt.qtdExemplar = qtdExemplar;
			exemplarOpsDt.tipo = tipo;
			exemplarOpsDt.codigoIdentificador = codigoIdentificador;
			exemplarOpsDt.arquivodigital = arquivodigital;

			IExemplarOps req = (IExemplarOps) this.manager.getRequiredInterface("IExemplarOps");

			boolean verif = req.editExemplar(exemplarOpsDt);

			return verif;
		}
		return false;
	}

	/**
	 * @desc Faz a remocao de um exemplar do acervo
	 * @param idExemplar
	 * @param idUsuario
	 * @return
	 */
	public boolean removeExemplar(Long idExemplar, Long idUsuario) {
		IUsuarioOps user = (IUsuarioOps) this.manager.getRequiredInterface("IUsuarioOps");
		boolean result = user.podeGerenciar(idUsuario);

		if (result) {

			ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
			exemplarOpsDt.idExemplar = idExemplar;

			IExemplarOps req = (IExemplarOps) this.manager.getRequiredInterface("IExemplarOps");

			boolean verif = req.deleteExemplar(exemplarOpsDt.idExemplar);

			return verif;
		}
		return false;
	}

	/**
	 * @desc Informa como disponivel para uso pelo sistema um exemplar ao acervo
	 * @param idExemplar
	 * @param idUsuario
	 * @return
	 */
	public boolean setAvaliableExemplar(Long idExemplar, Long idUsuario) {
		IUsuarioOps user = (IUsuarioOps) this.manager.getRequiredInterface("IUsuarioOps");
		boolean result = user.podeGerenciar(idUsuario);

		if (result) {

			ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
			exemplarOpsDt.idExemplar = idExemplar;

			IExemplarOps req = (IExemplarOps) this.manager.getRequiredInterface("IExemplarOps");

			boolean verif = req.setAvaliable(idExemplar);

			return verif;
		}
		return false;
	}

	/**
	 * @desc Informa como indisponivel para uso pelo sistema um exemplar ao acervo
	 * @param idExemplar
	 * @param idUsuario
	 * @return
	 */
	public boolean setUnavaliableExemplar(Long idExemplar, Long idUsuario) {
		IUsuarioOps user = (IUsuarioOps) this.manager.getRequiredInterface("IUsuarioOps");
		boolean result = user.podeGerenciar(idUsuario);

		if (result) {

			ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
			exemplarOpsDt.idExemplar = idExemplar;

			IExemplarOps req = (IExemplarOps) this.manager.getRequiredInterface("IExemplarOps");

			boolean verif = req.setUnavaliable(idExemplar);

			return verif;
		}
		return false;
	}

}
