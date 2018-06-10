package br.ufal.notificacoesops.impl;

import br.ufal.notificacoesops.impl.tipoNotificacao.NotificarPorEmail;
import br.ufal.notificacoesops.impl.tipoNotificacao.NotificarPorFacebook;
import br.ufal.notificacoesops.impl.tipoNotificacao.NotificarPorSMS;
import br.ufal.notificacoesops.impl.tipoNotificacao.NotificarPorWhatsApp;
import br.ufal.notificacoesops.spec.dt.NotificacaoDT;
import br.ufal.notificacoesops.spec.dt.UsuarioDT;

class Notificacao{

	private NotificacaoDT dadosNotificacao;
	private TipoNotificacao tipoNotificacao;
	
	public void enviarNotificacao(UsuarioDT usuario, Object contNotificacao) {
		
		if(usuario.email!=null) {
			tipoNotificacao = new NotificarPorEmail();
			tipoNotificacao.notificar(usuario, contNotificacao);
		}	
		
		if(usuario.nuTelefone!=null) {
			tipoNotificacao = new NotificarPorSMS();
			tipoNotificacao.notificar(usuario, contNotificacao);
			
			tipoNotificacao = new NotificarPorWhatsApp();
			tipoNotificacao.notificar(usuario, contNotificacao);
		}	
		
		if(usuario.idFacebook!=null) {
			tipoNotificacao = new NotificarPorFacebook();
			tipoNotificacao.notificar(usuario, contNotificacao);
		}	
		
		//TODO salvar notificação
				
		
	}
	
}
