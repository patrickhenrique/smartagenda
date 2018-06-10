package br.ufal.ic.ppgi.smartagenda.notificacaomgt.impl;

import java.util.ArrayList;
import java.util.List;

import br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.dt.NotificacaoDT;
import br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.dt.UsuarioDT;
import br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.prov.INotificacaoMgt;

class NotificacaoDAO implements INotificacaoMgt{

	@Override
	public void save(NotificacaoDT notificacao) {
		
		System.out.println("Objeto salvo");
		
	}

	@Override
	public void update(NotificacaoDT notificacao) {
		System.out.println("Objeto atualizado");
		
	}

	@Override
	public List<NotificacaoDT> findAll() {
		System.out.println("Lista de notificações");
		return new ArrayList<NotificacaoDT>();
		
	}

	@Override
	public NotificacaoDT findById(Long id) {
		System.out.println("Retorna 1 notificação");
		return new NotificacaoDT();
		
	}

	@Override
	public List<NotificacaoDT> findByUsuario(UsuarioDT usuario) {
		System.out.println("Lista de notificações");
		return new ArrayList<NotificacaoDT>();		
	}

	
	
}
