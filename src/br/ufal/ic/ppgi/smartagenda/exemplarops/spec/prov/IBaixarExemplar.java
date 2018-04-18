package br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov;

import java.util.List;

/**
 *Interface responsável pelo a "view" do exemplar, quando o mesmo
 *for disponível para visualização em browser.
 * 
 * @author Edival e Miguel Lima
 * 
 */
public interface IBaixarExemplar {
	
	public byte[] baixarExemplar(Long identificador);
	public byte[] visualizarExemplar(Long identificador);
	public byte[] reproduzirVideoExemplar(Long identificador);
	public byte[] reproduzirAudioExemplar(Long identificador);
	public byte[] exibirExemplar(Long identificador);
}
