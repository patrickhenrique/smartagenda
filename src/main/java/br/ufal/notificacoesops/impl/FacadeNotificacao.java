package br.ufal.notificacoesops.impl;

import br.ufal.notificacoesops.spec.dt.EmprestimoDT;
import br.ufal.notificacoesops.spec.dt.ReservaDT;
import br.ufal.notificacoesops.spec.dt.UsuarioDT;
import br.ufal.notificacoesops.spec.prov.IManager;
import br.ufal.notificacoesops.spec.prov.INotificacaoOps;

class FacadeNotificacao implements INotificacaoOps{

	private Notificacao notificacao;
	private IManager manager;
	//private ILimiteOps intReq;
	
	
	public FacadeNotificacao(IManager manager) {
		this.manager = manager;
		
		this.notificacao = new Notificacao();
	}


	public void notificar(UsuarioDT usuario) {
		
		this.notificacao.enviarNotificacao(null);
		
	}
	
	public void notificarReserva(UsuarioDT usuario, ReservaDT reserva) {
		
	}
	
	public void notificarCancelamentoReserva(UsuarioDT usuario, ReservaDT reserva) {
		
	}
	
	public void notificarEmprestimo(UsuarioDT usuario, EmprestimoDT emprestimo) {
		
	}


	public boolean isNotificado() {
		// TODO Auto-generated method stub
		return false;
	}

	
	

}
