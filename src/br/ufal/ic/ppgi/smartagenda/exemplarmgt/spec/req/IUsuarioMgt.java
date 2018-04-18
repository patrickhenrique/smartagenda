package br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.req;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ExemplarDT;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ItemDT;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.UsuarioDT;

public interface IUsuarioMgt {

	public UsuarioDT getUsuario(UsuarioDT usuario);

	public String getTipoUsuario(UsuarioDT usuario);
	
	public String getPermissaoUsuario(UsuarioDT usuario); 

}
