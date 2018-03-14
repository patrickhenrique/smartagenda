package br.ufal.ic.ppgi.smartagenda.spec.prov;

import java.util.List;

/**
 *Interface responsável pelo a "view" do exemplar, quando o mesmo
 *for disponível para visualização em browser.
 * 
 * @author Edival e Miguel Lima
 * 
 */
public interface IBaixarExemplar {
	
	public List<Byte> getBaixarExemplar(Long identificador);
}
