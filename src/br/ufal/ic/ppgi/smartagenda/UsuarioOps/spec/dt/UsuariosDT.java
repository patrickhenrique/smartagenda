package br.ufal.ic.ppgi.smartagenda.UsuarioOps.spec.dt;

import java.io.Serializable;
/**
 * @desc Atributos do Exemplar
 * 
 * @author Glevson
 *
 */
public class UsuariosDT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Long idExemplar;
	public Long idItem;
	public Integer qtdExemplar;
	public String tipo; // Fisico ou Digital enum
	public String codigoIdentificador;
	public byte[] arquivodigital;

}
