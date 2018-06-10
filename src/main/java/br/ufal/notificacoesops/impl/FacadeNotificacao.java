package br.ufal.notificacoesops.impl;

import br.ufal.notificacoesops.spec.dt.EmprestimoDT;
import br.ufal.notificacoesops.spec.dt.ReservaDT;
import br.ufal.notificacoesops.spec.dt.UsuarioDT;
import br.ufal.notificacoesops.spec.prov.IManager;
import br.ufal.notificacoesops.spec.prov.INotificacaoOps;
import br.ufal.notificacoesops.spec.req.IEmprestimoOps;
import br.ufal.notificacoesops.spec.req.IReservaOps;

class FacadeNotificacao implements INotificacaoOps{

	private Notificacao notificacao;
	private IManager manager;
	private IReservaOps resReq;
	private IEmprestimoOps empReq;
	
	
	public FacadeNotificacao(IManager manager) {
		this.manager = manager;
		
		this.notificacao = new Notificacao();
	}


	public void notificarReserva(UsuarioDT usuario) {
		this.resReq = (IReservaOps)this.manager.getRequiredInterface("IReservaOps");
		ReservaDT reserva = this.resReq.obterReserva(usuario);
		this.notificacao.enviarNotificacao(usuario, reserva);
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
