package br.ufal.ic.ppgi.smartagenda.exemplarops.impl;

import java.io.Serializable;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IExemplar;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.req.IPersistenceReq;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ExemplarOpsDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IBaixarExemplar;
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
	 * 
	 * @param idExemplar
	 * @param idUsuario
	 * @return
	 */
	public byte[] baixarExemplar(Long idExemplar, Long idUsuario) {
		IUsuarioOps user = (IUsuarioOps) this.manager.getProvidedInterface("IUsuarioOps");
		boolean result = user.podeBaixar(idUsuario, idExemplar);

		if (result) {

			ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
			exemplarOpsDt.idExemplar = idExemplar;
			IExemplarOps req = (IExemplarOps) this.manager.getProvidedInterface("IExemplarOps");

			exemplarOpsDt = req.getExemplar(exemplarOpsDt.idExemplar);

			return exemplarOpsDt.arquivodigital;
		}
		return null;

	}

	/**
	 * 
	 * @param idExemplar
	 * @param idUsuario
	 * @return
	 */
	public byte[] visualizarExemplar(Long idExemplar, Long idUsuario) {
		IUsuarioOps user = (IUsuarioOps) this.manager.getProvidedInterface("IUsuarioOps");
		boolean result = user.podeBaixar(idUsuario, idExemplar);

		if (result) {

			ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
			exemplarOpsDt.idExemplar = idExemplar;
			IExemplarOps req = (IExemplarOps) this.manager.getProvidedInterface("IExemplarOps");

			exemplarOpsDt = req.getExemplar(exemplarOpsDt.idExemplar);

			return exemplarOpsDt.arquivodigital;
		}
		return null;
	}

	/**
	 * 
	 * @param idExemplar
	 * @param idUsuario
	 * @return
	 */
	public byte[] reproduzirVideoExemplar(Long idExemplar, Long idUsuario) {
		IUsuarioOps user = (IUsuarioOps) this.manager.getProvidedInterface("IUsuarioOps");
		boolean result = user.podeBaixar(idUsuario, idExemplar);

		if (result) {

			ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
			exemplarOpsDt.idExemplar = idExemplar;
			IExemplarOps req = (IExemplarOps) this.manager.getProvidedInterface("IExemplarOps");

			exemplarOpsDt = req.getExemplar(exemplarOpsDt.idExemplar);

			return exemplarOpsDt.arquivodigital;
		}
		return null;
	}

	/**
	 * 
	 * @param idExemplar
	 * @param idUsuario
	 * @return
	 */
	public byte[] reproduzirAudioExemplar(Long idExemplar, Long idUsuario) {
		IUsuarioOps user = (IUsuarioOps) this.manager.getProvidedInterface("IUsuarioOps");
		boolean result = user.podeBaixar(idUsuario, idExemplar);

		if (result) {

			ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
			exemplarOpsDt.idExemplar = idExemplar;
			IExemplarOps req = (IExemplarOps) this.manager.getProvidedInterface("IExemplarOps");

			exemplarOpsDt = req.getExemplar(exemplarOpsDt.idExemplar);

			return exemplarOpsDt.arquivodigital;
		}
		return null;
	}

	/**
	 * 
	 * @param idExemplar
	 * @param idUsuario
	 * @return
	 */
	public byte[] exibirExemplar(Long idExemplar, Long idUsuario) {
		IUsuarioOps user = (IUsuarioOps) this.manager.getProvidedInterface("IUsuarioOps");
		boolean result = user.podeBaixar(idUsuario, idExemplar);

		if (result) {

			ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
			exemplarOpsDt.idExemplar = idExemplar;
			IExemplarOps req = (IExemplarOps) this.manager.getProvidedInterface("IExemplarOps");

			exemplarOpsDt = req.getExemplar(exemplarOpsDt.idExemplar);

			return exemplarOpsDt.arquivodigital;
		}
		return null;
	}

}
