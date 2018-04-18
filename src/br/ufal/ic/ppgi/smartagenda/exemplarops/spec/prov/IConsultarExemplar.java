package br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov;

import java.io.Serializable;
import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ExemplarOpsDT;

/**
 * 
 * @author Edival e João Miguel
 *
 */
public interface IConsultarExemplar {

	public ExemplarOpsDT consultarExemplar(String codigoIndentificador);
	public ExemplarOpsDT consultarExemplar(Long identificador);
	public List<ExemplarOpsDT> consultarExemplar(Object tipo);
	public List<ExemplarOpsDT> consultarExemplar(Serializable item);
		
}
