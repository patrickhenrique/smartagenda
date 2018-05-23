package br.ufal.ic.ppgi.smartagenda.UsuarioOps.impl;

import br.ufal.ic.ppgi.smartagenda.UsuarioOps.spec.prov.IManager;

class Manager {
	private Manager manager;
	
	void ClassManager(Manager mgr){
		this.manager = mgr;
	}
	
	public void Testar (String msg){
		System.out.println("Mensagem: " +msg);
	}
	
	
}
