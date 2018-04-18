package br.ufal.ic.ppgi.smartagenda.exemplarops.impl;

import java.io.Serializable;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IExemplar;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.req.IPersistenceReq;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ExemplarOpsDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IBaixarExemplar;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.req.IExemplarOps;

class BaixarExemplar implements Serializable {

	IManager manager;
	/**
	 * 
	 */
	private static final long serialVersionUID = -5062650595888618960L;

	BaixarExemplar(IManager manager) {
		this.manager = manager;

	}

	byte[] getExemplar(Long idExemplar, String permissao, Long idUsuario) {

		return null;
	}

	// TODO ver como usar o conector na classe do componente
	public byte[] baixarExemplar(Long identificador) {

		ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
		exemplarOpsDt.idExemplar = identificador;
		IExemplarOps req = (IExemplarOps) this.manager.getProvidedInterface("IExemplarOps");

		exemplarOpsDt = req.getExemplar(exemplarOpsDt.idExemplar);

		return exemplarOpsDt.arquivodigital;

	}

	public byte[] visualizarExemplar(Long identificador) {
		// TODO Auto-generated method stub
		return null;
	}

	public byte[] reproduzirVideoExemplar(Long identificador) {
		// TODO Auto-generated method stub
		return null;
	}

	public byte[] reproduzirAudioExemplar(Long identificador) {
		// TODO Auto-generated method stub
		return null;
	}

	public byte[] exibirExemplar(Long identificador) {
		// TODO Auto-generated method stub
		return null;
	}

}
