package br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov;

import java.io.Serializable;
import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ExemplarOpsDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ItemOpsDT;

/**
 * 
 * @author Edival e João Miguel
 *
 */
public interface IConsultarExemplar {
	/**
	 * @desc Permite a consulta das caracteristicas de um exemplar informado pelo id
	 * @param idExemplar
	 * @return ExemplarOpsDT
	 */
	public ExemplarOpsDT consultarExemplar(Long idExemplar);

	/**
	 * @desc Permite a consulta das características de um exemplar se for fornecido
	 *       o codigo identificador
	 * @param codigoIdentificador
	 * @return ExemplarOpsDT
	 */
	public ExemplarOpsDT consultarExemplar(String codigoIdentificador);

	/**
	 * @desc Permite a consutla de todos os exemplares para um item informado pelo
	 *       id
	 * @param idItem
	 * @return List<ExemplarOpsDT>
	 */
	public List<ExemplarOpsDT> consultarExemplarByItem(Long idItem);

	/**
	 * @desc Consulta os exemplares cadastrados para um item, desde que sejam de
	 *       determinado tipo
	 * @param idItem
	 * @param tipo
	 * @return List<ExemplarOpsDT>
	 */
	public List<ExemplarOpsDT> consultarExemplarByTipo(Long idItem, String tipo);
	/**
	 * 
	 * @param idItem
	 * @return
	 */
	public List<ExemplarOpsDT> consultarExemplarByItem(ItemOpsDT idItem);

}
