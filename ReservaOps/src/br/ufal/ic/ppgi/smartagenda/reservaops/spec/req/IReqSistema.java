package br.ufal.ic.ppgi.smartagenda.reservaops.spec.req;

import br.ufal.ic.ppgi.smartagenda.reservaops.spec.dt.Usuario;

public interface IReqSistema {
	
	public boolean usuarioExiste(Long idUsuario);
	
	public Usuario recuperarUsuario(Long idUsuario);

}
