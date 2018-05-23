package br.ufal.ic.ppgi.smartagenda.UsuarioOps.impl;


import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IManager;
/**
 * Responsável pela instanciação do componente
 * @author Glevson
 *
 */
public class ComponentFactory {	
	
	public static IManager createInstance(){
		return new Manager();
	}
}
