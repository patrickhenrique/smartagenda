package br.ic.ufal.ppgi.smartagenda.itemOps.spec.prov;

import br.ic.ufal.ppgi.smartagenda.itemOps.spec.dt.ItemDt;

public interface IAcessarDetalhesOps {


    ItemDt detalhes(int id, int idUsuario);

}
