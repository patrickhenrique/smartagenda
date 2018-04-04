package br.ic.ufal.ppgi.smartagenda.itemOps.impl;

import br.ic.ufal.ppgi.smartagenda.itemOps.spec.dt.ItemDt;
import br.ic.ufal.ppgi.smartagenda.itemOps.spec.prov.IGerenciarItemOps;

@Provided
public class FacadeGerenciarItem extends AbstractFacade implements IGerenciarItemOps {

	@Override
	public String getName() {
		return "IGerenciarItem";
	}


    @Override
    public boolean add(ItemDt item) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }
}
