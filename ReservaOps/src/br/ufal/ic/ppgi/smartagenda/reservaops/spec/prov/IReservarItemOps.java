package br.ufal.ic.ppgi.smartagenda.reservaops.spec.prov;

import java.io.Serializable;

public class IReservarItemOps implements Serializable {

	private static final long serialVersionUID = 2397594333801483574L;

	IManager manager;
	
	public IReservarItemOps(IManager manager) {
		this.manager = manager;
	}
	
	public void reservarItem(Long idItem, Long idUsuario) {
		
	}
}
