package br.ic.ufal.ppgi.smartagenda.itemOps.impl;

import br.ic.ufal.ppgi.smartagenda.itemOps.spec.dt.ItemDt;
import br.ic.ufal.ppgi.smartagenda.itemOps.spec.prov.IConsultarItemOps;

import java.util.List;

@Provided
public class FacadeConsultarItem extends AbstractFacade implements IConsultarItemOps {

	private ItemService service;

	public FacadeConsultarItem() {
		service = new ItemService();
	}

	@Override
	public String getName() {
		return "IConsultarItem";
	}

	@Override
	public ItemDt consultar(int id) {
		return service.consultar(id);
	}

	@Override
	public List<ItemDt> consultar(ItemDt filtro) {
		return service.filtrar(filtro.titulo, filtro.autor, filtro.ano, filtro.tipo.toString());
	}
}
