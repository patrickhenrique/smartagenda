package br.ufal.ic.ppgi.smartagenda.usuariops.spec.dt;

public class UsuariosOpsDT {

	/**
	 * Classe responsável pelo a representação de um usuario Vale salientar que um
	 * livro pode ter 0 ou N usuarioes e um usuario pertence a um livro.
	 * 
	 * Para o usuario é necessário requerer um item, para que possa obter as
	 * informações, por isso, foi trocado o atributo livro pelo atributo item.
	 * 
	 * O atributo livro tem sua tipagem como Object pelo fato que é uma classe que
	 * será produzida por outra dupla, bem como o atributo tipo.
	 * 
	 * Como o professor falou em sala de aula a interpretação fica a cargo do
	 * conector.
	 */
		
	public Long idusuario;
	public Long idItem;
	public Integer qtdusuario;
	public String tipo; 
	public String codigoIdentificador;
	public byte[] arquivodigital;


}
