package br.ufal.ic.ppgi.smartagenda.UsuarioOps.spec.req;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ItemDT;

public interface IItemMgt {

	public ItemDT getItem(ItemDT item);

	public String getItemTipo(ItemDT item);
}
