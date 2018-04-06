package br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.req;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ExemplarDt;

public interface IPersistenceReq {

	public Long save(ExemplarDt exemplar);
	
	public ExemplarDt get(Long idExemplar);

	public boolean update(ExemplarDt exemplar);

	public boolean remove(ExemplarDt exemplar);

	public List<ExemplarDt> search(ExemplarDt exemplar);
	
	public List<ExemplarDt> list(Long idItem);

	public ExemplarDt search(Long idExemplar);

	public ExemplarDt search(String codigoIndentificador);

	public List<ExemplarDt> search(Object tipo);

	public List<ExemplarDt> searchItemExemplar(ExemplarDt item);
}
