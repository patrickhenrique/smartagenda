package br.ic.ufal.ppgi.smartagenda.itemMgt.spec.req;

import br.ic.ufal.ppgi.smartagenda.itemMgt.spec.dt.ItemDt;

import java.util.List;

public interface IItemDAO {

    boolean save(ItemDt item);
    boolean remove(int codItem);
    List<ItemDt> find(String titulo, String autor, int ano, String tipo);
    ItemDt get(int codItem);

}
