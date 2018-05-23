package br.ufal.ic.ppgi.smartagenda.UsuarioOps.spec.req;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ExemplarDT;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ItemDT;

/**
 * Responsável por prover as operacoes de crud do exemplar
 * 
 * @author Glevson
 *
 */
public interface IPersistenceReq {

	public Long save(UsuariosDT exemplar);

	public UsuariosDT get(Long idExemplar);
	
	public UsuariosDT get(Long idExemplar, String tipo);

	public boolean update(UsuariosDT exemplar);

	public boolean remove(UsuariosDT exemplar);

	public List<UsuariosDT> list(Long idItem);

	public List<UsuariosDT> search(UsuariosDT exemplar);

	public List<UsuariosDT> search(Long idItem);

	public List<UsuariosDT> search(String codigoIdentificador);

	public List<UsuariosDT> search(ItemDT item);

	public List<UsuariosDT> search(ItemDT item, String tipo);
}
