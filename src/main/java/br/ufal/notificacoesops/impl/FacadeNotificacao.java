package br.ufal.notificacoesops.impl;

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


	public void notificar() {
		
		this.notificacao.enviarNotificacao();
		
	}


	public boolean isNotificado() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
