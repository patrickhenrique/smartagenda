package br.ufal.ic.ppgi.smartagenda.itemexemplar;


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