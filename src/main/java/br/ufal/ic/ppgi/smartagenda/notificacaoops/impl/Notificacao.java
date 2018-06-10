package br.ufal.ic.ppgi.smartagenda.notificacaoops.impl;

import br.ufal.ic.ppgi.smartagenda.notificacaoops.impl.tipoNotificacao.NotificarPorEmail;
import br.ufal.ic.ppgi.smartagenda.notificacaoops.impl.tipoNotificacao.NotificarPorFacebook;
import br.ufal.ic.ppgi.smartagenda.notificacaoops.impl.tipoNotificacao.NotificarPorSMS;
import br.ufal.ic.ppgi.smartagenda.notificacaoops.impl.tipoNotificacao.NotificarPorWhatsApp;
import br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.dt.UsuarioDT;

class Notificacao{

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
		
		
	}
	
}
