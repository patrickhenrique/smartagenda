package br.ic.ufal.ppgi.smartagenda.itemOps.impl;

import br.ic.ufal.ppgi.smartagenda.itemOps.spec.dt.ItemDt;
import br.ic.ufal.ppgi.smartagenda.itemOps.spec.prov.IAcessarDetalhesOps;

@Provided
public class FacadeAcessarDetalhes extends AbstractFacade implements IAcessarDetalhesOps {

	@Override
	public String getName() {
		return "IAcessarDetalhes";
	}


	@Override
	public ItemDt detalhes(int id) {
		return null;
	}
}
