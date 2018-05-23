package br.ufal.ic.ppgi.smartagenda.usuariops.itemexemplar;


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