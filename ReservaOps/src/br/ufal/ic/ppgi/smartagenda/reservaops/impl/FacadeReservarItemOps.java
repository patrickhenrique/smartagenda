package br.ufal.ic.ppgi.smartagenda.reservaops.impl;

import java.io.Serializable;

import br.ufal.ic.ppgi.smartagenda.reservaops.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.prov.IReservarItemOps;

public class FacadeReservarItemOps implements IReservarItemOps, Serializable {
	
	private static final long serialVersionUID = 2397594333801483574L;

	IManager manager;
	
	public FacadeReservarItemOps(IManager manager) {
		this.manager = manager;
	}
	
	public void reservarItem(Long idItem, Long idUsuario) {
		
	}

}
