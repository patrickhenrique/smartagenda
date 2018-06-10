package br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.req;

import br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.dt.EmprestimoDT;
import br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.dt.UsuarioDT;

public interface IEmprestimoOps {

	public EmprestimoDT obterEmprestimo(UsuarioDT usuario);
	
}
