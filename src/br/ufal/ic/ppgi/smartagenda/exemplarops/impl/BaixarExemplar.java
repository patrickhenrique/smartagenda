package br.ufal.ic.ppgi.smartagenda.exemplarops.impl;

import java.io.Serializable;

import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IBaixarExemplar;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IManager;

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


	public byte[] baixarExemplar(Long identificador) {
		// TODO Auto-generated method stub
		return null;
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
