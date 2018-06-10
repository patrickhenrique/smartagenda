package br.ufal.ic.ppgi.smartagenda.notificacaomgt.impl;

import java.util.Date;
import java.util.List;

import br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.dt.NotificacaoDT;
import br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.dt.UsuarioDT;
import br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.prov.INotificacaoMgt;

class FacadeNotificacaoMgt implements INotificacaoMgt{

	private NotificacaoDAO notificacaoDAO;
	private IManager manager;	
	
	public FacadeNotificacaoMgt(IManager manager) {
		this.manager = manager;
		this.notificacaoDAO = new NotificacaoDAO();
	}	
	
	@Override
	public void save(NotificacaoDT notificacao) {
		this.notificacaoDAO.save(notificacao);		
	}


	@Override
	public void update(NotificacaoDT notificacao) {
		this.notificacaoDAO.update(notificacao);		
	}


	@Override
	public List<NotificacaoDT> findAll(){
		return this.notificacaoDAO.findAll();		
	}


	@Override
	public NotificacaoDT findById(Long id) {
		return this.notificacaoDAO.findById(id);
		
	}


	@Override
	public List<NotificacaoDT> findByUsuario(UsuarioDT usuario) {
		return this.notificacaoDAO.findByUsuario(usuario);		
	}


	


	

}
