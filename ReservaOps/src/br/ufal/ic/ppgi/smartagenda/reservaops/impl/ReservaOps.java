package br.ufal.ic.ppgi.smartagenda.reservaops.impl;

import br.ufal.ic.ppgi.smartagenda.reservaops.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.prov.IManager.Interfaces;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.req.IReservaReq;

public class ReservaOps {
	
	IReservaReq reservaMgt;

	public ReservaOps(IManager manager) {
		reservaMgt = (IReservaReq) manager.getRequiredInterface(Interfaces.Required.IReservaMgt);
	}
	
	
}
