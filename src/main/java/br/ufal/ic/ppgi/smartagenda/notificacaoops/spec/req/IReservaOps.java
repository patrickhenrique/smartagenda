package br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.req;

import br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.dt.ReservaDT;
import br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.dt.UsuarioDT;

public interface IReservaOps {

	public ReservaDT obterReserva(UsuarioDT usuario);
	
}
