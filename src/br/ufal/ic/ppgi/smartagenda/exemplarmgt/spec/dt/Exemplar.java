package br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt;

import java.io.Serializable;

public class Exemplar implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1262249047059414022L;
	/**
	 * Classe responsável pelo a representação de um exemplar Vale salientar que um
	 * livro pode ter 0 ou N exemplares e um exemplar pertence a um livro.
	 * 
	 * Para o exemplar é necessário requerer um item, para que possa obter as
	 * informações, por isso, foi trocado o atributo livro pelo atributo item.
	 * 
	 * O atributo livro tem sua tipagem como Object pelo fato que é uma classe que
	 * será produzida por outra dupla, bem como o atributo tipo.
	 * 
	 * Como o professor falou em sala de aula a interpretação fica a cargo do
	 * conector.
	 */

	private Long idexemplar;
	private Object item;
	private Integer qtdExemplar;
	private Object tipo; // Fisico ou Digital
	private String codigoIndentificador;
	private byte[] arquivodigital;

	public byte[] getArquivodigital() {
		return arquivodigital;
	}

	public String getCodigoIndentificador() {
		return codigoIndentificador;
	}

	public void setCodigoIndentificador(String codigoIndentificador) {
		this.codigoIndentificador = codigoIndentificador;
	}

	public void setArquivodigital(byte[] arquivodigital) {
		this.arquivodigital = arquivodigital;
	}

	public Long getIdexemplar() {
		return idexemplar;
	}

	public void setIdexemplar(Long idexemplar) {
		this.idexemplar = idexemplar;
	}

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}

	public Integer getQtdExemplar() {
		return qtdExemplar;
	}

	public void setQtdExemplar(Integer qtdExemplar) {
		this.qtdExemplar = qtdExemplar;
	}

	public Object getTipo() {
		return tipo;
	}

	public void setTipo(Object tipo) {
		this.tipo = tipo;
	}


}
