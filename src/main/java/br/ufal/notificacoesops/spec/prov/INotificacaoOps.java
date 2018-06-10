package br.ufal.notificacoesops.spec.prov;

import br.ufal.notificacoesops.spec.dt.UsuarioDT;

public interface INotificacaoOps {
	
	public void notificarReserva(UsuarioDT usuario);
	
	public void notificarCancelamentoReserva(UsuarioDT usuario);
	
	public void notificarEmprestimo(UsuarioDT usuario);

}
