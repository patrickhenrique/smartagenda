package br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt;

import java.io.Serializable;
/**
 * @desc Atributos do Exemplar
 * 
 * @author João Miguel e Edival Junior
 *
 */
public class ExemplarDT implements Serializable {

	public Long idExemplar;
	public Long idItem;
	public Integer qtdExemplar;
	public String tipo; // Fisico ou Digital enum
	public String codigoIndentificador;
	public byte[] arquivodigital;

}
