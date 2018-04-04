package br.ic.ufal.ppgi.smartagenda.itemOps.spec.prov;

import br.ic.ufal.ppgi.smartagenda.itemOps.spec.dt.ItemDt;

public interface IConsultarItemOps {

    ItemDt consultar(int id);
    ItemDt consultar(ItemDt filtro);

}
