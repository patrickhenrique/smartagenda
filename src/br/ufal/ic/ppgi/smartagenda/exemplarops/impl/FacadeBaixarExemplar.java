package br.ufal.ic.ppgi.smartagenda.exemplarops.impl;

import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ExemplarOpsDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IBaixarExemplar;

/**
 * @desc Classe que implementa uma interface provida
 * @author Joao Miguel e Edival Junior
 *
 */
class FacadeBaixarExemplar implements IBaixarExemplar {

	BaixarExemplar exemplar;

	/**
	 * @desc No construtor cria um controller para exemplar
	 */
	FacadeBaixarExemplar(IManager manager) {

		ObjectFactory factory = new ObjectFactory(manager);

		this.exemplar = factory.createBaixarExemplar();

	}

	@Override
	public byte[] baixarExemplar(Long identificador, Long idUsuario) {

		return this.exemplar.baixarExemplar(identificador, idUsuario);

	}

	@Override
	public byte[] visualizarExemplar(Long identificador, Long idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] reproduzirVideoExemplar(Long identificador, Long idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] reproduzirAudioExemplar(Long identificador, Long idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] exibirExemplar(Long identificador, Long idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
