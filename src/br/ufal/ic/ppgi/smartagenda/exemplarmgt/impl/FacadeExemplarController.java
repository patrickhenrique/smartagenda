package br.ufal.ic.ppgi.smartagenda.exemplarmgt.impl;

import java.io.Serializable;
import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IExemplar;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ExemplarDt;

class FacadeExemplarController implements IExemplar {

	IManager manager;

	FacadeExemplarController(IManager manager) {
		this.manager = manager;
	}

	

}
