package br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.req;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ExemplarDT;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ItemDT;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.UsuarioDT;

public interface IItemMgt {

	public ItemDT getItem(ItemDT item);

	public String getItemTipo(ItemDT item);
}
