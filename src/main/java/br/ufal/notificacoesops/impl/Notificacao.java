package br.ufal.notificacoesops.impl;

import br.ufal.notificacoesops.spec.dt.NotificacaoDT;
import br.ufal.notificacoesops.spec.dt.UsuarioDT;

class Notificacao{

	private NotificacaoDT dadosNotificacao;
	private TipoNotificacao tipoNotificacao;
	
	public void enviarNotificacao(UsuarioDT usuario) {
		
		tipoNotificacao = new NotificarPorEmail();
		tipoNotificacao.notificar(usuario);
		
		tipoNotificacao = new NotificarPorSMS();
		tipoNotificacao.notificar(usuario);
		
		tipoNotificacao = new NotificarPorFacebook();
		tipoNotificacao.notificar(usuario);
		
		tipoNotificacao = new NotificarPorWhatsApp();
		tipoNotificacao.notificar(usuario);		
		
		
	}
	
}
