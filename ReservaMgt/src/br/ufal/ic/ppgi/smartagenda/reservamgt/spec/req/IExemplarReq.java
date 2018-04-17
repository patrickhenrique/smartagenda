package br.ufal.ic.ppgi.smartagenda.reservamgt.spec.req;

public interface IExemplarReq {

	public int qtdTotalExemplares(int codItem);
	public int qtdExemplaresEmprestados(int codItem);
	public int qtdExemplaresBloqueados(int codItem);
	
}
