package br.ufal.notificacoesops.impl.tipoNotificacao;

import br.ufal.notificacoesops.impl.TipoNotificacao;
import br.ufal.notificacoesops.spec.dt.UsuarioDT;

public class NotificarPorWhatsApp implements TipoNotificacao {

	public void notificar(UsuarioDT usuario, Object contNotificacao) {
		
		System.out.println("Mensagem via WhatsApp enviada");
		
	}

}
