package br.ufal.ic.ppgi.smartagenda.exemplarmgt.impl;


import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IManager;
/**
 * Responsável pela instanciação do componente
 * @author João Miguel e Edival
 *
 */
public class ComponentFactory {	
	
	public static IManager createInstance(){
		return new Manager();
	}
}
