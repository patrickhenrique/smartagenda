package br.ic.ufal.ppgi.smartagenda.itemOps.impl;

import br.ic.ufal.ppgi.smartagenda.itemOps.impl.exceptions.ItemException;
import br.ic.ufal.ppgi.smartagenda.itemOps.spec.dt.ItemDt;
import br.ic.ufal.ppgi.smartagenda.itemOps.spec.prov.IGerenciarItemOps;

@Provided
public class FacadeGerenciarItem extends AbstractFacade implements IGerenciarItemOps {

    private ItemService service;

    public FacadeGerenciarItem() {
        service = new ItemService();
    }


	@Override
	public String getName() {
		return "IGerenciarItem";
	}


    @Override
    public boolean add(ItemDt item) {
        try {
            return service.save(item);
        } catch (ItemException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean remove(int id) {
        try {
            return service.remove(id);
        } catch (ItemException e) {
            e.printStackTrace();
            return false;
        }
    }
}
