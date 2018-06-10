package br.ufal.notificacoesops.spec.req;

import br.ufal.notificacoesops.spec.dt.EmprestimoDT;
import br.ufal.notificacoesops.spec.dt.UsuarioDT;

public interface IEmprestimoOps {

	public EmprestimoDT obterEmprestimo(UsuarioDT usuario);
	
}
