package br.ufal.ic.ppgi.smartagenda.UsuarioOps.impl;

<<<<<<< HEAD

import br.ufal.ic.ppgi.smartagenda.usuariomgt.spec.prov.IManager;
/**
 * Responsável pela instanciação do componente
 * @author Glevson
 *
 */
public class ComponentFactory {	
	
	public static IManager createInstance(){
		return new Manager();
=======
import br.ufal.ic.ppgi.smartagenda.UsuarioOps.spec.prov.IManager;

public class ComponentFactory {
	public static IManager createInstance(){
		return (IManager) new Manager();
		
>>>>>>> branch 'usuarioops' of https://github.com/patrickhenrique/smartagenda.git
	}
}
