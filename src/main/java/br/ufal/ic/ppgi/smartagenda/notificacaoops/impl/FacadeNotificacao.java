package br.ufal.ic.ppgi.smartagenda.notificacaoops.impl;

import java.util.Date;

import br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.dt.EmprestimoDT;
import br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.dt.NotificacaoDT;
import br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.dt.ReservaDT;
import br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.dt.UsuarioDT;
import br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.prov.INotificacaoOps;
import br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.req.IEmprestimoOps;
import br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.req.INotificacaoMgt;
import br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.req.IReservaOps;

class FacadeNotificacao implements INotificacaoOps{

	private Notificacao notificacao;
	private IManager manager;
	private IReservaOps resReq;
	private IEmprestimoOps empReq;
	
	
	public FacadeNotificacao(IManager manager) {
		this.manager = manager;		
		this.notificacao = new Notificacao();
	}


	/**
	 * Notifica a reserva criada pelo usuário
	 */
	public void notificarReserva(UsuarioDT usuario) {
		this.resReq = (IReservaOps)this.manager.getRequiredInterface("IReservaOps");
		ReservaDT reserva = this.resReq.obterReserva(usuario);
		
		if(!reserva.cancelada) {
			this.notificacao.enviarNotificacao(usuario, reserva);
			salvarRegistroNotificacao(usuario, reserva);
		}	
	}
	
	/**
	 * Notifica o cancelamento feito pelo usuário
	 */
	public void notificarCancelamentoReserva(UsuarioDT usuario) {
		this.resReq = (IReservaOps)this.manager.getRequiredInterface("IReservaOps");
		ReservaDT reserva = this.resReq.obterReserva(usuario);
		
		if(reserva.cancelada) {
			this.notificacao.enviarNotificacao(usuario, reserva);
			salvarRegistroNotificacao(usuario, reserva);
		}		
		
	}
	
	/**
	 * Notifica o empréstimo feito pelo usuário
	 */
	public void notificarEmprestimo(UsuarioDT usuario) {
		this.empReq = (IEmprestimoOps)this.manager.getRequiredInterface("IEmprestimoOps");
		EmprestimoDT emprestimo = this.empReq.obterEmprestimo(usuario);
		this.notificacao.enviarNotificacao(usuario, emprestimo);
		salvarRegistroNotificacao(usuario, emprestimo);
	}
	
	/**
	 * salvar notificação
	 * @param usuario
	 */
	private void salvarRegistroNotificacao(UsuarioDT usuario, Object contNotificacao) {		
		NotificacaoDT notificacao = new NotificacaoDT();
		notificacao.dataNotificacao = new Date();
		notificacao.usuario = usuario;
		notificacao.mensagemNotificacao = contNotificacao.toString();
		
		INotificacaoMgt notificacaoMgt = (INotificacaoMgt)this.manager.getRequiredInterface("INotificacaoMgt");
		notificacaoMgt.salvarNotificacao(notificacao);
	}


	


	

}
