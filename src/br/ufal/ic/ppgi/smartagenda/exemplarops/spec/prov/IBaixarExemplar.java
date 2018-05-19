package br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ExemplarOpsDT;

/**
 *Interface responsável pelo a "view" do exemplar, quando o mesmo
 *for disponível para visualização em browser.
 * 
 * @author Edival e Miguel Lima
 * 
 */
public interface IBaixarExemplar {
	
	public byte[] baixarExemplar(Long idExemplar, Long idUsuario);
	public byte[] visualizarExemplar(Long idExemplar, Long idUsuario);
	public byte[] reproduzirVideoExemplar(Long idExemplar, Long idUsuario);
	public byte[] reproduzirAudioExemplar(Long idExemplar, Long idUsuario);
	public byte[] exibirExemplar(Long idExemplar, Long idUsuario);
}
