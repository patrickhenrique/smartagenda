package br.ufal.ic.ppgi.smartagenda.bloqueioMgt.impl;

import br.ufal.ic.ppgi.smartagenda.bloqueioMgt.spec.prov.IManager;

//necessita ser pública para que packages externos acessem ela
public class ComponentFactory {

	public static IManager CreateInstance(){
		return new Manager();
	
	}

}
