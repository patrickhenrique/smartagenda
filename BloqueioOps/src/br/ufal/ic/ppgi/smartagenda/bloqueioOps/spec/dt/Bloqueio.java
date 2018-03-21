package br.ufal.ic.ppgi.smartagenda.bloqueioOps.spec.dt;

import java.util.Date;

public class Bloqueio {

	public long idBloqueio;

	public Object exemplar; // Aqui datatypes de outros componentes são representados por Object.
	public Object usuario;

	public Date dataInicio;
	public Date dataFim;

}
