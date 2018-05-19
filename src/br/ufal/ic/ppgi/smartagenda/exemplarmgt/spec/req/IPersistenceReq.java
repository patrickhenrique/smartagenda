package br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.req;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ExemplarDT;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ItemDT;

/**
 * Responsável por prover as operacoes de crud do exemplar
 * 
 * @author João Miguel e Edival Junior
 *
 */
public interface IPersistenceReq {

	public Long save(ExemplarDT exemplar);

	public ExemplarDT get(Long idExemplar);
	
	public ExemplarDT get(Long idExemplar, String tipo);

	public boolean update(ExemplarDT exemplar);

	public boolean remove(ExemplarDT exemplar);

	public List<ExemplarDT> list(Long idItem);

	public List<ExemplarDT> search(ExemplarDT exemplar);

	public List<ExemplarDT> search(Long idItem);

	public List<ExemplarDT> search(String codigoIdentificador);

	public List<ExemplarDT> search(ItemDT item);

	public List<ExemplarDT> search(ItemDT item, String tipo);
}
