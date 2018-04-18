package br.ufal.ic.ppgi.smartagenda.exemplarops.spec.req;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ExemplarOpsDT;

public interface IExemplarOps {

	/**
	 * @desc Faz a adição de um exemplar
	 * @param idExemplar
	 * @param idItem
	 * @param qtdExemplar
	 * @param tipo
	 * @param codigoIndentificador
	 * @param arquivodigital
	 * @return
	 */
	Long addExemplar(Long idExemplar, Long idItem, int qtdExemplar, String tipo, String codigoIndentificador,
			byte[] arquivodigital);

	/**
	 * @desc Edita os atributos de um exemplar
	 * @param idExemplar
	 * @param idItem
	 * @param qtdExemplar
	 * @param tipo
	 * @param codigoIndentificador
	 * @param arquivodigital
	 * @return
	 */
	Boolean editExemplar(Long idExemplar, Long idItem, int qtdExemplar, String tipo, String codigoIndentificador,
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
	 * @return List<ExemplarOpsDT>
	 */
	List<ExemplarOpsDT> getListExemplarItem(Long idItem);

	/**
	 * @desc Retorna um exemplar com base no id informado
	 * @param idExemplar
	 * @return ExemplarOpsDT
	 */
	ExemplarOpsDT getExemplar(Long idExemplar);

}
