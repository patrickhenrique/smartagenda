package br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ExemplarDT;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ItemDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ExemplarOpsDT;

/**
 * @desc Interface do Exemplar
 * 
 * @author João Miguel e Edival Junior
 *
 */
public interface IExemplar {

	/**
	 * @desc Faz a adição de um exemplar
	 * @param idExemplar
	 * @param idItem
	 * @param qtdExemplar
	 * @param tipo
	 * @param codigoIdentificador
	 * @param arquivodigital
	 * @return
	 */
	Long addExemplar(Long idExemplar, Long idItem, int qtdExemplar, String tipo, String codigoIdentificador,
			byte[] arquivodigital);

	/**
	 * @desc Edita os atributos de um exemplar
	 * @param idExemplar
	 * @param idItem
	 * @param qtdExemplar
	 * @param tipo
	 * @param codigoIdentificador
	 * @param arquivodigital
	 * @return
	 */
	boolean editExemplar(Long idExemplar, Long idItem, int qtdExemplar, String tipo, String codigoIdentificador,
			byte[] arquivodigital);

	/**
	 * @desc Apaga um exemplar com base do idExemplar informado
	 * @param idExemplar
	 * @return
	 */
	boolean deleteExemplar(Long idExemplar);

	/**
	 * @desc Lista todos os exemplares de determinado item
	 * @param idItem
	 * @return List<ExemplarDt>
	 */
	List<ExemplarDT> getListExemplarItem(Long idItem);

	/**
	 * @desc Retorna um exemplar com base no id informado
	 * @param idExemplar
	 * @return ExemplarDt
	 */
	ExemplarDT getExemplar(Long idExemplar);

	/**
	 * @desc Retorna um exemplar somente se ele for de determinado tipo de midia
	 * @param idExemplar
	 * @param tipo
	 * @return
	 */
	ExemplarDT getExemplarByTipo(Long idExemplar, String tipo);

	/**
	 * @desc Faz a pesquisa por meio de um exemplar fornecido e retorna uma lista de
	 *       exemplares encontrados
	 * @param ExemplarDT
	 *            exemplar
	 * @return List<ExemplarDT>
	 */
	List<ExemplarDT> searchExemplar(ExemplarDT exemplar);

	/**
	 * @desc Faz a busca de exemplares a partir de um idItem informado
	 * @param Long
	 *            idItem
	 * @return List<ExemplarDT>
	 */
	List<ExemplarDT> searchExemplar(Long idItem);

	/**
	 * @desc Faz a busca de exemplares a partir de um codigo identificador do
	 *       exemplar informado
	 * @param String
	 *            codigoIdentificador
	 * @return List<ExemplarDT>
	 */
	List<ExemplarDT> searchExemplar(String codigoIdentificador);

	/**
	 * @desc Faz a busca de exemplares a partir de um codigo identificador do
	 *       exemplar informado
	 * @param ItemDT
	 *            item
	 * @return List<ExemplarDT>
	 */
	List<ExemplarDT> searchExemplar(ItemDT item);

	/**
	 * @desc Faz a busca de exemplares a partir de um item e de um tipo de exemplar
	 *       informado
	 * @param ItemDT
	 *            item
	 * @param String
	 *            tipo
	 * @return List<ExemplarDT>
	 */
	List<ExemplarDT> searchExemplar(ItemDT item, String tipo);
}
