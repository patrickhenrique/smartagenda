package br.ic.ufal.ppgi.smartagenda.itemOps.spec.prov;

import br.ic.ufal.ppgi.smartagenda.itemOps.spec.dt.ItemDt;

import java.util.List;

public interface IConsultarItemOps {

    ItemDt consultar(int id);
    List<ItemDt> consultar(ItemDt filtro);

}
