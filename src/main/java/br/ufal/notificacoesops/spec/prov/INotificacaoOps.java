package br.ufal.notificacoesops.spec.prov;

import br.ufal.notificacoesops.spec.dt.EmprestimoDT;
import br.ufal.notificacoesops.spec.dt.ReservaDT;
import br.ufal.notificacoesops.spec.dt.UsuarioDT;

public interface INotificacaoOps {
	
	public boolean isNotificado();
	
	public void notificarReserva(UsuarioDT usuario);
	
	public void notificarCancelamentoReserva(UsuarioDT usuario, ReservaDT reserva);
	
	public void notificarEmprestimo(UsuarioDT usuario, EmprestimoDT emprestimo);

}
