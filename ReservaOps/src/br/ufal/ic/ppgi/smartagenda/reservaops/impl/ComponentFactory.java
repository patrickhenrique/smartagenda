package br.ufal.ic.ppgi.smartagenda.reservaops.impl;

import br.ufal.ic.ppgi.smartagenda.reservaops.spec.prov.IManager;

public class ComponentFactory {

	public static IManager createInstance() {
		return new Manager();
	}
}
