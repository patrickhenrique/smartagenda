package br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.req;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.Exemplar;

public interface IPersistenceReq {

	public Long save(Exemplar exemplar);

	public void update(Exemplar exemplar);

	public void remove(Exemplar exemplar);

	public List<Exemplar> search(Exemplar exemplar);

	public Exemplar search(Long idExemplar);

	public Exemplar search(String codigoIndentificador);

	public List<Exemplar> search(Object tipo);

	public List<Exemplar> searchItemExemplar(Exemplar item);
}
