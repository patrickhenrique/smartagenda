package br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov;

import java.io.Serializable;
import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.Exemplar;

/**
 * 
 * @author Edival e João Miguel
 *
 */
public interface IConsultarExemplar {

	public Exemplar consultarExemplar(String codigoIndentificador);
	public Exemplar consultarExemplar(Long identificador);
	public List<Exemplar> consultarExemplar(Object tipo);
	public List<Exemplar> consultarExemplar(Serializable item);
		
}
