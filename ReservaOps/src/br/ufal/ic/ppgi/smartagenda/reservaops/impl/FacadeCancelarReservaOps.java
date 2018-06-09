package br.ufal.ic.ppgi.smartagenda.reservaops.impl;

import java.io.Serializable;

import br.ufal.ic.ppgi.smartagenda.reservaops.spec.prov.ICancelarReservaOps;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.prov.IManager;

public class FacadeCancelarReservaOps implements ICancelarReservaOps, Serializable {

private static final long serialVersionUID = -6368737294891653454L;
	
	IManager manager;
	
	public FacadeCancelarReservaOps(IManager manager) {
		this.manager = manager;
	}
	
	public void cancelarReserva(Long idReserva, Long idUsuario) {
		
	}
}
