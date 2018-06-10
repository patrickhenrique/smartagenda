package br.ufal.notificacoesops.impl;

import br.ufal.notificacoesops.spec.dt.UsuarioDT;

public class NotificarPorSMS implements TipoNotificacao {

	public void notificar(UsuarioDT usuario, Object contNotificacao) {
		
		System.out.println("Mensagem enviada por SMS");
		
	}

}
