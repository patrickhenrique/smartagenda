package br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt;

public class ItemOpsDT {

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

	public Long idexemplar;
	public Object item;
	public Integer qtdExemplar;
	public Object tipo; // Fisico ou Digital
	public String codigoIndentificador;
	public byte[] arquivodigital;


}
