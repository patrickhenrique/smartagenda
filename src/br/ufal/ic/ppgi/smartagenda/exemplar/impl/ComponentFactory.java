package br.ufal.ic.ppgi.smartagenda.exemplar.impl;


import br.ufal.ic.ppgi.smartagenda.exemplar.spec.prov.IManager;

public class ComponentFactory {
	
	public static IManager createInstance(){
		return new Manager();
	}
}
