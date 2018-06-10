package br.ufal.ic.ppgi.smartagenda.reservaops.spec.req;

import br.ufal.ic.ppgi.smartagenda.reservaops.spec.dt.Usuario;

public interface IReqSistema {
	
	public boolean verificarSeUsuarioExiste(int idUsuario);
	
	public Usuario recuperarUsuario(int idUsuario);

}
