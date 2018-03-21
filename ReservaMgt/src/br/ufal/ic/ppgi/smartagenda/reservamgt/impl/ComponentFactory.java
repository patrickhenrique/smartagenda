package br.ufal.ic.ppgi.smartagenda.reservamgt.impl;

import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.prov.IManager;

public class ComponentFactory {

	public static IManager createInstance(){
		return new Manager();
	}

}
