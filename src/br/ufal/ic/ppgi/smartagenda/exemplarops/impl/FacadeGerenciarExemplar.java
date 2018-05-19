package br.ufal.ic.ppgi.smartagenda.exemplarops.impl;

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
	public boolean setAvaliableExemplar(Long idExemplar, Long idUsuario) {
		return this.exemplar.setAvaliableExemplar(idExemplar, idUsuario);
	}

	@Override
	public boolean setUnavaliableExemplar(Long idExemplar, Long idUsuario) {
		return this.exemplar.setUnavaliableExemplar(idExemplar, idUsuario);
	}

	@Override
	public Long saveExemplaraddExemplar(Long idExemplar, Long idItem, int qtdExemplar, String tipo,
			String codigoIdentificador, byte[] arquivodigital, Long idUsuario) {
		return this.exemplar.saveExemplar(idExemplar, idItem, qtdExemplar, tipo, codigoIdentificador, arquivodigital, idUsuario);
	}

	@Override
	public boolean updateExemplar(Long idExemplar, Long idItem, int qtdExemplar, String tipo,
			String codigoIdentificador, byte[] arquivodigital, Long idUsuario) {
		return this.exemplar.updateExemplar(idExemplar, idItem, qtdExemplar, tipo, codigoIdentificador, arquivodigital, idUsuario);
	}

	@Override
	public boolean removeExemplar(Long idExemplar, Long idUsuario) {
		// TODO Auto-generated method stub
		return false;
	}


}
