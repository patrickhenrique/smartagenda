package br.ufal.ic.ppgi.smartagenda.exemplarops.impl;

import java.io.Serializable;

import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IGerenciarExemplar;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IManager;

public class FacadeGerenciarExemplar implements IGerenciarExemplar {

	GerenciarExemplar exemplar;

	/**
	 * @desc No construtor cria um controller para exemplar
	 */
	FacadeGerenciarExemplar (IManager manager) {

		ObjectFactory factory = new ObjectFactory(manager);

		this.exemplar = factory.createGerenciarExemplar();

	}

	@Override
	public Long saveExemplar(Serializable exemplar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateExemplar(Serializable exemplar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeExemplar(Serializable exemplar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object setAvaliableExemplar(Boolean exemplar) {
		// TODO Auto-generated method stub
		return null;
	}
}
