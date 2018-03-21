package br.ufal.ic.ppgi.smartagenda.impl;


import br.ufal.ic.ppgi.smartagenda.spec.prov.IManager;

public class ComponentFactory {
	
	public static IManager createInstance(){
		return new Manager();
	}
}
