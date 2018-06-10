package br.ufal.ic.ppgi.smartagenda.notificacaoops.impl;

import br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.dt.UsuarioDT;

public interface TipoNotificacao {

	public void notificar(UsuarioDT usuario, Object objTpNotificacao);	
	
}
