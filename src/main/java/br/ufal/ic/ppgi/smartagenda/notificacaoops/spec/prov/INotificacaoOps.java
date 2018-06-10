package br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.prov;

import br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.dt.UsuarioDT;

public interface INotificacaoOps {
	
	public void notificarReserva(UsuarioDT usuario);
	
	public void notificarCancelamentoReserva(UsuarioDT usuario);
	
	public void notificarEmprestimo(UsuarioDT usuario);

}
