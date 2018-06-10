package br.ufal.notificacoesops.impl;

import br.ufal.notificacoesops.spec.dt.NotificacaoDT;

class Notificacao{

	private NotificacaoDT dadosNotificacao;
	private TipoNotificacao tipoNotificacao;
	
	public void enviarNotificacao() {
		
		tipoNotificacao = new NotificarPorEmail();
		tipoNotificacao.notificar();
		
		tipoNotificacao = new NotificarPorSMS();
		tipoNotificacao.notificar();
		
		tipoNotificacao = new NotificarPorFacebook();
		tipoNotificacao.notificar();
		
		tipoNotificacao = new NotificarPorWhatsApp();
		tipoNotificacao.notificar();		
		
		
	}
	
}
