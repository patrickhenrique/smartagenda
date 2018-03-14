package br.ufal.ic.ppgi.smartagenda.bloqueioOps.impl;

import br.ufal.ic.ppgi.smartagenda.bloqueioOps.spec.prov.IManager;

public class ComponentFactory {
	
	public static IManager CreateInstance(){
		return new Manager();
	}
}
