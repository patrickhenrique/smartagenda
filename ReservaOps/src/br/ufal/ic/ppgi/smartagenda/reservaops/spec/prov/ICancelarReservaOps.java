package br.ufal.ic.ppgi.smartagenda.reservaops.spec.prov;

import java.io.Serializable;

public class ICancelarReservaOps implements Serializable{
	
	private static final long serialVersionUID = -6368737294891653454L;
	
	IManager manager;
	
	public ICancelarReservaOps(IManager manager) {
		this.manager = manager;
	}
	
	public void cancelarReserva(Long idReserva, Long idUsuario) {
		
	}
}
