package br.ufal.ic.ppgi.smartagenda.exemplarmgt.impl;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IManager;

public class FacadeExemplar {

	IManager gerenciador;

	public FacadeExemplar(IManager gerenciador) {
		this.gerenciador = gerenciador;
	}	
}
