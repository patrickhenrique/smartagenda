package br.ic.ufal.ppgi.smartagenda.itemOps.spec.req;

import br.ic.ufal.ppgi.smartagenda.itemOps.impl.Required;
import br.ic.ufal.ppgi.smartagenda.itemOps.spec.dt.UsuarioDt;

@Required(name="IUsuarioOps")
public interface IUsuarioOps {

    UsuarioDt consultar(int id);

}
