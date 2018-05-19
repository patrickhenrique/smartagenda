package br.ufal.ic.ppgi.smartagenda.exemplarOpsMgtConn;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ExemplarOpsDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IConsultarExemplar;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.impl.ComponentFactory;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ExemplarDT;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ItemDT;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IExemplar;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.req.IExemplarOps;

public class ExemplarOpsMgtConn implements IExemplarOps{
	IExemplar exemplarMgt;
	
	public ExemplarOpsMgtConn() {
		IManager manager = ComponentFactory.createInstance();
		this.exemplarMgt = (IExemplar)manager.getProvidedInterface("IExemplar");
	}

	@Override
	public ExemplarOpsDT getExemplar(Long idExemplar) {
		ExemplarOpsDT exemplarOpsDt = new ExemplarOpsDT();
		ExemplarDT exemplarDt = new ExemplarDT();		
		exemplarDt = this.exemplarMgt.getExemplar(idExemplar);
		exemplarOpsDt.idExemplar = exemplarDt.idExemplar;
		exemplarOpsDt.idItem = exemplarDt.idItem;
		exemplarOpsDt.qtdExemplar = exemplarDt.qtdExemplar;
		exemplarOpsDt.tipo = exemplarDt.tipo;
		exemplarOpsDt.codigoIdentificador = exemplarDt.codigoIdentificador;
		exemplarOpsDt.arquivodigital = exemplarDt.arquivodigital;
	
		// TODO Auto-generated method stub
		return exemplarOpsDt;
	}
	


	@Override
	public Long addExemplar(Long idExemplar, Long idItem, int qtdExemplar, String tipo, String codigoIdentificador,
			byte[] arquivodigital) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean editExemplar(Long idExemplar, Long idItem, int qtdExemplar, String tipo, String codigoIdentificador,
			byte[] arquivodigital) {
		return false;
	}

	@Override
	public boolean deleteExemplar(Long idExemplar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ExemplarOpsDT> getListExemplarItem(Long idItem) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public ExemplarOpsDT getExemplarByTipo(Long idExemplar, String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExemplarDT> searchExemplar(ExemplarDT exemplar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExemplarDT> searchExemplar(Long idItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExemplarDT> searchExemplar(String codigoIdentificador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExemplarDT> searchExemplar(ItemDT item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExemplarDT> searchExemplar(ItemDT item, String tipo) {
		// TODO Auto-generated method stub
		return null;
	}



}
