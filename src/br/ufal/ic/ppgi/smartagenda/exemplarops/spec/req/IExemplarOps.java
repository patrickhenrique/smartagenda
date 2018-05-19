package br.ufal.ic.ppgi.smartagenda.exemplarops.spec.req;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ExemplarOpsDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ItemOpsDT;

/**
 * @desc Interface do ExemplarMgt para o uso das funcionalidades do Mgt
 * 
 * @author João Miguel e Edival Junior
 *
 */
public interface IExemplarOps {

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
	Long addExemplar(ExemplarOpsDT exemplar);

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
	boolean editExemplar(ExemplarOpsDT exemplar);

	/**
	 * @desc Apaga um exemplar com base do idExemplar informado
	 * @param idExemplar
	 * @return
	 */
	boolean deleteExemplar(Long idExemplar);

	/**
	 * @desc Seta o exemplar como disponivel
	 * @param idExemplar
	 * @return
	 */
	boolean setAvaliable(Long idExemplar);

	/**
	 * @desc Seta o exemplar como indisponivel
	 * @param idExemplar
	 * @return
	 */
	boolean setUnavaliable(Long idExemplar);

	/**
	 * @desc Lista todos os exemplares de determinado item
	 * @param idItem
	 * @return List<ExemplarOpsDT>
	 */
	List<ExemplarOpsDT> getListExemplarItem(Long idItem);

	/**
	 * @desc Retorna um exemplar com base no id informado
	 * @param idExemplar
	 * @return ExemplarOpsDT
	 */
	ExemplarOpsDT getExemplar(Long idExemplar);

	/**
	 * @desc Retorna um exemplar com base no codigo identificador
	 * @param codigoIdentificador
	 * @return
	 */
	ExemplarOpsDT getExemplar(String codigoIdentificador);

	/**
	 * @desc Retorna um exemplar somente se ele for de determinado tipo de midia
	 * @param idExemplar
	 * @param tipo
	 * @return
	 */
	ExemplarOpsDT getExemplarByTipo(Long idExemplar, String tipo);

	/**
	 * @desc Faz a pesquisa por meio de um exemplar fornecido e retorna uma lista de
	 *       exemplares encontrados
	 * @param ExemplarOpsDT
	 *            exemplar
	 * @return List<ExemplarOpsDT>
	 */
	List<ExemplarOpsDT> searchExemplar(ExemplarOpsDT exemplar);

	/**
	 * @desc Faz a busca de exemplares a partir de um idItem informado
	 * @param Long
	 *            idItem
	 * @return List<ExemplarOpsDT>
	 */
	List<ExemplarOpsDT> searchExemplar(Long idItem);

	/**
	 * @desc Faz a busca de exemplares a partir de um codigo identificador do
	 *       exemplar informado
	 * @param String
	 *            codigoIdentificador
	 * @return List<ExemplarOpsDT>
	 */
	List<ExemplarOpsDT> searchExemplar(String codigoIdentificador);

	/**
	 * @desc Faz a busca de exemplares a partir de um codigo identificador do
	 *       exemplar informado
	 * @param ItemDT
	 *            item
	 * @return List<ExemplarOpsDT>
	 */
	List<ExemplarOpsDT> searchExemplar(ItemOpsDT item);

	/**
	 * @desc Faz a busca de exemplares a partir de um item e de um tipo de exemplar
	 *       informado
	 * @param ItemDT
	 *            item
	 * @param String
	 *            tipo
	 * @return List<ExemplarOpsDT>
	 */
	List<ExemplarOpsDT> searchExemplar(Long idItem, String tipo);
}
