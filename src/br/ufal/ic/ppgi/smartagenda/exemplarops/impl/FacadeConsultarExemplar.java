package br.ufal.ic.ppgi.smartagenda.exemplarops.impl;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ExemplarOpsDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ItemOpsDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IConsultarExemplar;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IManager;

public class FacadeConsultarExemplar implements IConsultarExemplar {

	ConsultarExemplar exemplar;

	/**
	 * @desc No construtor cria um controller para consultar exemplar
	 */
	FacadeConsultarExemplar(IManager manager) {

		ObjectFactory factory = new ObjectFactory(manager);

		this.exemplar = factory.createConsultarExemplar();

	}

	@Override
	public ExemplarOpsDT consultarExemplar(Long idExemplar) {
		return this.exemplar.consultarExemplar(idExemplar);
	}

	@Override
	public ExemplarOpsDT consultarExemplar(String codigoIdentificador) {
		return this.exemplar.consultarExemplar(codigoIdentificador);
	}

	@Override
	public List<ExemplarOpsDT> consultarExemplarByItem(Long idItem) {
		return this.exemplar.consultarExemplarByItem(idItem);
	}

	@Override
	public List<ExemplarOpsDT> consultarExemplarByTipo(Long idItem, String tipo) {
		return this.exemplar.consultarExemplarByTipo(idItem, tipo);
	}

	@Override
	public List<ExemplarOpsDT> consultarExemplarByItem(ItemOpsDT item) {
		return this.exemplar.consultarExemplarByItem(item);
	}

}
