package br.ic.ufal.ppgi.smartagenda.itemOps.impl;

import br.ic.ufal.ppgi.smartagenda.itemOps.spec.prov.IManager;

public class ComponentFactory {

	private ComponentFactory() {
		super();
	}
	
	public static IManager createInstance() {
		return new Manager();
	}
	
	
}
