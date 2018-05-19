package br.ufal.ic.ppgi.smartagenda.exemplarops.impl;

import java.io.Serializable;


import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ExemplarOpsDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.req.IExemplarOps;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.req.IUsuarioOps;

class BaixarExemplar implements Serializable {

	IManager manager;
	/**
	 * 
	 */
	private static final long serialVersionUID = -5062650595888618960L;

	BaixarExemplar(IManager manager) {
		this.manager = manager;

	}

	/**
	 * @desc Verifica no componente usuario se esse pode baixar o exemplar
	 *       solicitado e retorna o arquivo se for autorizado a fazer o download
	 * @param idExemplar
	 * @param idUsuario
	 * @return byte[]
	 */
	public byte[] baixarExemplar(Long idExemplar, Long idUsuario) {
		IUsuarioOps user = (IUsuarioOps) this.manager.getRequiredInterface("IUsuarioOps");
		boolean result = user.podeBaixar(idUsuario, idExemplar);

		if (result) {

			ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
			exemplarOpsDt.idExemplar = idExemplar;
			IExemplarOps req = (IExemplarOps) this.manager.getRequiredInterface("IExemplarOps");

			exemplarOpsDt = req.getExemplar(exemplarOpsDt.idExemplar);

			return exemplarOpsDt.arquivodigital;
		}
		return null;

	}

	/**
	 * @desc Verifica se o user pode visualizar uma exemplar se for uma imagem
	 * @param idExemplar
	 * @param idUsuario
	 * @return byte[]
	 */
	public byte[] visualizarExemplar(Long idExemplar, Long idUsuario) {
		IUsuarioOps user = (IUsuarioOps) this.manager.getRequiredInterface("IUsuarioOps");
		boolean result = user.podeInteragir(idUsuario, idExemplar);

		if (result) {

			ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
			exemplarOpsDt.idExemplar = idExemplar;
			IExemplarOps req = (IExemplarOps) this.manager.getRequiredInterface("IExemplarOps");

			exemplarOpsDt = req.getExemplarByTipo(idExemplar, "image");

			return exemplarOpsDt.arquivodigital;
		}
		return null;
	}

	/**
	 * @desc Verifica se o user pode reproduzir o exemplar se for um video
	 * @param idExemplar
	 * @param idUsuario
	 * @return byte[]
	 */
	public byte[] reproduzirVideoExemplar(Long idExemplar, Long idUsuario) {
		IUsuarioOps user = (IUsuarioOps) this.manager.getRequiredInterface("IUsuarioOps");
		boolean result = user.podeInteragir(idUsuario, idExemplar);

		if (result) {

			ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
			exemplarOpsDt.idExemplar = idExemplar;
			IExemplarOps req = (IExemplarOps) this.manager.getRequiredInterface("IExemplarOps");

			exemplarOpsDt = req.getExemplarByTipo(idExemplar, "video");

			return exemplarOpsDt.arquivodigital;
		}
		return null;
	}

	/**
	 * @desc Verifica se o user pode ouvir um exemplar se estiver no formato audio
	 * @param idExemplar
	 * @param idUsuario
	 * @return byte[]
	 */
	public byte[] reproduzirAudioExemplar(Long idExemplar, Long idUsuario) {
		IUsuarioOps user = (IUsuarioOps) this.manager.getRequiredInterface("IUsuarioOps");
		boolean result = user.podeInteragir(idUsuario, idExemplar);

		if (result) {

			ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
			exemplarOpsDt.idExemplar = idExemplar;
			IExemplarOps req = (IExemplarOps) this.manager.getRequiredInterface("IExemplarOps");

			exemplarOpsDt = req.getExemplarByTipo(idExemplar, "audio");

			return exemplarOpsDt.arquivodigital;
		}
		return null;
	}

	/**
	 * @desc Verifica se o user pode exibir o conteudo de um exemplar se for em
	 *       ebook
	 * @param idExemplar
	 * @param idUsuario
	 * @return byte[]
	 */
	public byte[] exibirExemplar(Long idExemplar, Long idUsuario) {
		IUsuarioOps user = (IUsuarioOps) this.manager.getRequiredInterface("IUsuarioOps");
		boolean result = user.podeInteragir(idUsuario, idExemplar);

		if (result) {

			ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
			exemplarOpsDt.idExemplar = idExemplar;
			IExemplarOps req = (IExemplarOps) this.manager.getRequiredInterface("IExemplarOps");

			exemplarOpsDt = req.getExemplarByTipo(idExemplar, "ebook");

			return exemplarOpsDt.arquivodigital;
		}
		return null;
	}

}
