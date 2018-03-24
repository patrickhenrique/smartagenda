package br.ufal.ic.ppgi.smartagenda.emprestimoops.impl;

import br.ufal.ic.ppgi.smartagenda.emprestimoops.espec.prov.IManager;

public class ComponentFactory {
	public static IManager createInstance(){//é static para que o metodo possa ser executado direto da classe
		return new Manager();//a classe manager representa o componente
	}
}
