package br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.prov;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.dt.NotificacaoDT;
import br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.dt.UsuarioDT;

public interface INotificacaoMgt {
	
	public void save(NotificacaoDT notificacao);
	public void update(NotificacaoDT notificacao);
	public List<NotificacaoDT> findAll();
	public NotificacaoDT findById(Long id);
	public List<NotificacaoDT> findByUsuario(UsuarioDT usuario);

}
