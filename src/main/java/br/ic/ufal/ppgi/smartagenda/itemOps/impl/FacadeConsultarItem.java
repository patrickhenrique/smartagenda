package br.ic.ufal.ppgi.smartagenda.itemOps.impl;

import br.ic.ufal.ppgi.smartagenda.itemOps.spec.dt.ItemDt;
import br.ic.ufal.ppgi.smartagenda.itemOps.spec.prov.IConsultarItemOps;

@Provided
public class FacadeConsultarItem extends AbstractFacade implements IConsultarItemOps {

	@Override
	public String getName() {
		return "IConsultarItem";
	}

	@Override
	public ItemDt consultar(int id) {
		return null;
	}

	@Override
	public ItemDt consultar(ItemDt filtro) {
		return null;
	}
}
