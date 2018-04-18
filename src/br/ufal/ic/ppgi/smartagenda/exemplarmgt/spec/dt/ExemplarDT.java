package br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt;

import java.io.Serializable;

public class ExemplarDT implements Serializable {

	public Long idExemplar;
	public Long idItem;
	public Integer qtdExemplar;
	public String tipo; // Fisico ou Digital enum
	public String codigoIndentificador;
	public byte[] arquivodigital;

}
