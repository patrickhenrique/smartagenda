package br.ic.ufal.ppgi.smartagenda.itemOps.spec.req;

import br.ic.ufal.ppgi.smartagenda.itemOps.impl.Required;
import br.ic.ufal.ppgi.smartagenda.itemOps.spec.dt.ItemDt;

import java.util.List;

@Required(name = "ItemMgt")
public interface ItemMgt {

    ItemDt getById(int id);
    boolean save(ItemDt item);
    boolean remove(int id);
    List<ItemDt> filter(String titulo, String autor, int ano, String tipo);

}
