package br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.req;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ExemplarDT;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ItemDT;

public interface IPersistenceReq {

	public Long save(ExemplarDT exemplar);
	
	public ExemplarDT get(Long idExemplar);

	public boolean update(ExemplarDT exemplar);

	public boolean remove(ExemplarDT exemplar);

	public List<ExemplarDT> search(ExemplarDT exemplar);
	
	public List<ExemplarDT> list(Long idItem);

	public ExemplarDT search(Long idExemplar);

	public ExemplarDT search(String codigoIndentificador);

	public List<ExemplarDT> search(Object tipo);

	public List<ExemplarDT> searchItemExemplar(ItemDT item);
}
