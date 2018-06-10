package br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.req;

import br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.dt.ReservaDT;
import br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.dt.UsuarioDT;

public interface IReservaOps {

	public ReservaDT obterReserva(UsuarioDT usuario);
	
}
