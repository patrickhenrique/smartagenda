package br.ufal.notificacoesops.impl;

import br.ufal.notificacoesops.spec.prov.IManager;
import br.ufal.notificacoesops.spec.prov.INotificacaoOps;

class FacadeNotificacao implements INotificacaoOps{

	private IManager manager;
	//private ILimiteOps intReq;
	
	
	public FacadeNotificacao(IManager manager) {
		this.manager = manager;
	}
	
		
	public void notificarPorSMS() {
		// TODO Auto-generated method stub
		
	}

	public void notificarPorWhattsApp() {
		// TODO Auto-generated method stub
		
	}

	public void notificarPorFacebook() {
		// TODO Auto-generated method stub
		
	}

	public void notificarPorEmail() {
		// TODO Auto-generated method stub
		
	}
	
	

}
