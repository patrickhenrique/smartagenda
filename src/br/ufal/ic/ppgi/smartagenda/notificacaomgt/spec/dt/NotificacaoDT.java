package br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.dt;

import java.util.Date;

public class NotificacaoDT {
		
	public long id;
	public Date dataNotificacao;
	public UsuarioDT usuario;
	public TipoNotificacaoDT tipoNotificacao;
	public String mensagemNotificacao;
	public ItemDT item;
	
	
}


