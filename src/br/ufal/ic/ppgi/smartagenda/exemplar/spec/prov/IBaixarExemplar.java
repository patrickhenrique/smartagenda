package br.ufal.ic.ppgi.smartagenda.exemplar.spec.prov;

import java.util.List;

/**
 *Interface responsável pelo a "view" do exemplar, quando o mesmo
 *for disponível para visualização em browser.
 * 
 * @author Edival e Miguel Lima
 * 
 */
public interface IBaixarExemplar {
	
	public Byte[] baixarExemplar(Long identificador);
	public Byte[] visualizarExemplar(Long identificador);
	public Byte[] reproduzirVideoExemplar(Long identificador);
	public Byte[] reproduzirAudioExemplar(Long identificador);
	public Byte[] exibirExemplar(Long identificador);
}
