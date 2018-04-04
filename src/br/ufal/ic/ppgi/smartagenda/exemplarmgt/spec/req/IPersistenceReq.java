package br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.req;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ExemplarDt;

public interface IPersistenceReq {

	public Long save(ExemplarDt exemplar);

	public void update(ExemplarDt exemplar);

	public void remove(ExemplarDt exemplar);

	public List<ExemplarDt> search(ExemplarDt exemplar);

	public ExemplarDt search(Long idExemplar);

	public ExemplarDt search(String codigoIndentificador);

	public List<ExemplarDt> search(Object tipo);

	public List<ExemplarDt> searchItemExemplar(ExemplarDt item);
}
