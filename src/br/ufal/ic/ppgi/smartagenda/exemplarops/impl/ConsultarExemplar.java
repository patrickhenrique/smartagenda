package br.ufal.ic.ppgi.smartagenda.exemplarops.impl;

import java.io.Serializable;
import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ExemplarDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ExemplarOpsDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IConsultarExemplar;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.req.IExemplarOps;

class ConsultarExemplar implements Serializable{
	IManager manager;
	/**
	 * 
	 */
	private static final long serialVersionUID = 190392282141369552L;

	ConsultarExemplar(IManager manager) {
		this.manager = manager;

	}

	ExemplarOpsDT getExemplar(Long idExemplar, Long idUsuario) {

		ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
		exemplarOpsDt.idExemplar = idExemplar;
		IExemplarOps req = (IExemplarOps) this.manager.getProvidedInterface("IExemplarOps");

		exemplarOpsDt = req.getExemplar(exemplarOpsDt.idExemplar);

		return exemplarOpsDt;
	}
	
	public ExemplarOpsDT consultarExemplar(String codigoIndentificador) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ExemplarOpsDT consultarExemplar(Long identificador) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ExemplarOpsDT> consultarExemplar(Object tipo) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<ExemplarOpsDT> consultarExemplar(Serializable item) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
