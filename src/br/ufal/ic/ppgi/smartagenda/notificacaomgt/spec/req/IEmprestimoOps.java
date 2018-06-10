package br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.req;

import br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.dt.EmprestimoDT;
import br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.dt.UsuarioDT;

public interface IEmprestimoOps {

	public EmprestimoDT obterEmprestimo(UsuarioDT usuario);
	
}
