package br.ufal.ic.ppgi.smartagenda.exemplarops.impl;

import java.io.Serializable;
import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ExemplarOpsDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IConsultarExemplar;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IManager;

public class FacadeConsultarExemplar implements IConsultarExemplar {

	
	ConsultarExemplar exemplar;

	/**
	 * @desc No construtor cria um controller para exemplar
	 */
	FacadeConsultarExemplar (IManager manager) {

		ObjectFactory factory = new ObjectFactory(manager);

		this.exemplar = factory.createConsultarExemplar();

	}

	@Override
	public ExemplarOpsDT consultarExemplar(String codigoIndentificador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExemplarOpsDT consultarExemplar(Long identificador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExemplarOpsDT> consultarExemplar(Object tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExemplarOpsDT> consultarExemplar(Serializable item) {
		// TODO Auto-generated method stub
		return null;
	}

}
