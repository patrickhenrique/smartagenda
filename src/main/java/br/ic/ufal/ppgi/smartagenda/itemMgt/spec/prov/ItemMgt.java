package br.ic.ufal.ppgi.smartagenda.itemMgt.spec.prov;


import br.ic.ufal.ppgi.smartagenda.itemMgt.spec.dt.ItemDt;

public interface ItemMgt {

    ItemDt getById(int id);
    boolean save(ItemDt item);
    boolean remove(int id);
    ItemDt filter(String titulo, String autor, int ano, String tipo);

}
