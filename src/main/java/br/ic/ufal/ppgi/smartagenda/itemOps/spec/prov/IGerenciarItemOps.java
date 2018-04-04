package br.ic.ufal.ppgi.smartagenda.itemOps.spec.prov;

import br.ic.ufal.ppgi.smartagenda.itemOps.spec.dt.ItemDt;

public interface IGerenciarItemOps {

    boolean add(ItemDt item);
    boolean remove(int id);


}
