package br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.req;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ExemplarDt;

public interface IExemplarMgt {

	public Long saveExemplar(ExemplarDt exemplar);

	public void updateExemplar(ExemplarDt exemplar);

	public void removeExemplar(ExemplarDt exemplar);

	public List<ExemplarDt> searchExemplar(ExemplarDt exemplar);

	public ExemplarDt searchExemplar(Long idExemplar);

	public ExemplarDt searchExemplar(String codigoIndentificador);

	public List<ExemplarDt> searchExemplar(Object tipo);

	public List<ExemplarDt> searchItemExemplar(ExemplarDt item);

	

}
