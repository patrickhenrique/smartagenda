package br.ic.ufal.ppgi.smartagenda.itemOps.impl;

import br.ic.ufal.ppgi.smartagenda.itemOps.impl.exceptions.ItemException;
import br.ic.ufal.ppgi.smartagenda.itemOps.spec.dt.ItemDt;
import br.ic.ufal.ppgi.smartagenda.itemOps.spec.prov.IAcessarDetalhesOps;

@Provided
public class FacadeAcessarDetalhes extends AbstractFacade implements IAcessarDetalhesOps {

	private ItemService service;

	public FacadeAcessarDetalhes() {
		this.service = new ItemService();
	}

	@Override
	public String getName() {
		return "IAcessarDetalhes";
	}


	@Override
	public ItemDt detalhes(int id, int idUsuario) {

		try {
			return service.consultarDetalhes(id, idUsuario);
		} catch (ItemException e) {
			throw new RuntimeException(e);
		}
	}
}
