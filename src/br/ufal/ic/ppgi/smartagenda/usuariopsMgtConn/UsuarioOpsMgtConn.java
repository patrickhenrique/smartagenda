package br.ufal.ic.ppgi.smartagenda.usuariopsMgtConn;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ExemplarOpsDT;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt.ItemOpsDT;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.impl.ComponentFactory;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt.ExemplarDT;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IExemplar;
import br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.req.IExemplarOps;

public class UsuarioOpsMgtConn implements IUsuariosOps{
	IUsuario exemplarMgt;
	
	public UsuarioOpsMgtConn() {
		IManager manager = ComponentFactory.createInstance();
		this.exemplarMgt = (IUsuario)manager.getProvidedInterface("IExemplar");
	}

	@Override
	public UsuariosOpsDT getExemplar(Long idExemplar) {
		UsuariosOpsDT exemplarOpsDt = new UsuariosOpsDT();
		UsuariosDT exemplarDt = new UsuariosDT();		
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
	public Long addExemplar(UsuariosOpsDT exemplar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean editExemplar(UsuariosOpsDT exemplar) {
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
	public List<UsuariosOpsDT> getListExemplarItem(Long idItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuariosOpsDT getExemplar(String codigoIdentificador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuariosOpsDT getExemplarByTipo(Long idExemplar, String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuariosOpsDT> searchExemplar(UsuariosOpsDT exemplar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuariosOpsDT> searchExemplar(Long idItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuariosOpsDT> searchExemplar(String codigoIdentificador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuariosOpsDT> searchExemplar(ItemOpsDT item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuariosOpsDT> searchExemplar(Long idItem, String tipo) {
		// TODO Auto-generated method stub
		return null;
	}
	





}
