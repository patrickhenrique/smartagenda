package br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.prov;

import br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.dt.NotificacaoDT;
import br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.dt.UsuarioDT;

public interface INotificacaoMgt {
	
	public void save(NotificacaoDT notificacao);
	public void update(NotificacaoDT notificacao);
	public void findAll(NotificacaoDT notificacao);
	public void findById(NotificacaoDT notificacao);
	public void findByUsuario(UsuarioDT usuario);

}
