package br.ufal.notificacoesops.spec.req;

import br.ufal.notificacoesops.spec.dt.ReservaDT;
import br.ufal.notificacoesops.spec.dt.UsuarioDT;

public interface IReservaOps {

	public ReservaDT obterReserva(UsuarioDT usuario);
	
}
