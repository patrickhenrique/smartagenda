package br.ufal.ic.ppgi.smartagenda.UsuarioOps.impl;

import br.ufal.ic.ppgi.smartagenda.UsuarioOps.spec.prov.IManager;

public class ComponentFactory {
	public static IManager createInstance(){
		return (IManager) new Manager();
		
	}
}
