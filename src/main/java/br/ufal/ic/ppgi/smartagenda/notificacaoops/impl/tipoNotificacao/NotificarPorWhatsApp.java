package br.ufal.ic.ppgi.smartagenda.notificacaoops.impl.tipoNotificacao;

import br.ufal.ic.ppgi.smartagenda.notificacaoops.impl.TipoNotificacao;
import br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.dt.UsuarioDT;

public class NotificarPorWhatsApp implements TipoNotificacao {

	public void notificar(UsuarioDT usuario, Object contNotificacao) {
		
		System.out.println("Mensagem via WhatsApp enviada");
		
	}

}
