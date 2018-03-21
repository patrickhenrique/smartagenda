package br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.req;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.Exemplar;

public interface IExemplarMgt {

	public Long saveExemplar(Exemplar exemplar);

	public void updateExemplar(Exemplar exemplar);

	public void removeExemplar(Exemplar exemplar);

	public List<Exemplar> searchExemplar(Exemplar exemplar);

	public Exemplar searchExemplar(Long idExemplar);

	public Exemplar searchExemplar(String codigoIndentificador);

	public List<Exemplar> searchExemplar(Object tipo);

	public List<Exemplar> searchItemExemplar(Exemplar item);

	

}
