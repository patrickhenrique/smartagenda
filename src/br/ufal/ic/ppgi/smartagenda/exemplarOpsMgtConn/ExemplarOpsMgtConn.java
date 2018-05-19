package br.ufal.ic.ppgi.smartagenda.exemplarOpsMgtConn;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ExemplarOpsDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ItemOpsDT;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.impl.ComponentFactory;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ExemplarDT;
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
	public Long addExemplar(ExemplarOpsDT exemplar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean editExemplar(ExemplarOpsDT exemplar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteExemplar(Long idExemplar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setAvaliable(Long idExemplar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setUnavaliable(Long idExemplar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ExemplarOpsDT> getListExemplarItem(Long idItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExemplarOpsDT getExemplar(String codigoIdentificador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExemplarOpsDT getExemplarByTipo(Long idExemplar, String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExemplarOpsDT> searchExemplar(ExemplarOpsDT exemplar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExemplarOpsDT> searchExemplar(Long idItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExemplarOpsDT> searchExemplar(String codigoIdentificador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExemplarOpsDT> searchExemplar(ItemOpsDT item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExemplarOpsDT> searchExemplar(Long idItem, String tipo) {
		// TODO Auto-generated method stub
		return null;
	}
	





}
