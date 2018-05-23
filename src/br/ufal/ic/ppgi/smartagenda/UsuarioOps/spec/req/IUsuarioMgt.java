package br.ufal.ic.ppgi.smartagenda.UsuarioOps.spec.req;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.UsuarioDT;

public interface IUsuarioMgt {

	public UsuarioDT getUsuario(UsuarioDT usuario);

	public String getTipoUsuario(UsuarioDT usuario);
	
	public String getPermissaoUsuario(UsuarioDT usuario); 

}
