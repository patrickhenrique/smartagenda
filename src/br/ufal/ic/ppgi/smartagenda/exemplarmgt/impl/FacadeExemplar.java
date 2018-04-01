package br.ufal.ic.ppgi.smartagenda.exemplarmgt.impl;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IExemplar;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IManager;

class FacadeExemplar implements IExemplar {

	IManager manager;

	public FacadeExemplar(IManager manager) {
		this.manager = manager;
	}	
}
