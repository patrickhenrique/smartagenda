package br.ufal.ic.ppgi.smartagenda.exemplarops.impl;

import java.io.Serializable;

import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IGerenciarExemplar;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IManager;

class GerenciarExemplar implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 670309219658176585L;
	IManager manager;
	
	GerenciarExemplar(IManager manager) {
		this.manager = manager;

	}

	byte[] remoExemplar(Long idExemplar, String permissao, Long idUsuario) {

		return null;
	}


	public Long saveExemplar(Serializable exemplar) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void updateExemplar(Serializable exemplar) {
		// TODO Auto-generated method stub
		
	}

	public void removeExemplar(Serializable exemplar) {
		// TODO Auto-generated method stub
		
	}

	public Object setAvaliableExemplar(Boolean exemplar) {
		// TODO Auto-generated method stub
		return null;
	}

}
