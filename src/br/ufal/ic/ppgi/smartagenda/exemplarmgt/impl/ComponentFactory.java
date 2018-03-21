package br.ufal.ic.ppgi.smartagenda.exemplarmgt.impl;


import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IManager;

public class ComponentFactory {
	
	public static IManager createInstance(){
		return new Manager();
	}
}
