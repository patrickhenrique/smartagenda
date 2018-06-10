package br.ufal.notificacaoMgt.impl;

import br.ufal.notificacoesops.spec.prov.IManager;

public class ComponentFactory {
	private static IManager manager = null;
	
	private ComponentFactory() {
		// faz nada - SINGLETON
	}
	
	//FACTORY METHOD
	public static IManager createInstance(){
		//SINGLETON
		if(manager == null)
			manager = new Manager();
		return manager;
	}
}
