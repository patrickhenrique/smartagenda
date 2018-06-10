package br.ufal.ic.ppgi.smartagenda.reservaops.impl;

import java.io.Serializable;

import br.ufal.ic.ppgi.smartagenda.reservaops.spec.dt.Item;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.dt.Usuario;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.prov.IManager.Interfaces.Required;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.prov.IReservarItemOps;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.req.IReqNegocio;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.req.IReqSistema;

public class FacadeReservarItemOps implements IReservarItemOps, Serializable {
	
	private static final long serialVersionUID = 2397594333801483574L;

	IReqNegocio iReqNegocio;
	IReqSistema iReqSistema;
	
	public FacadeReservarItemOps(IManager manager) {
		iReqNegocio = (IReqNegocio) manager.getRequiredInterface(Required.IReqNegocio);
		iReqSistema = (IReqSistema) manager.getRequiredInterface(Required.IReqSistema);
	}
	
	public void reservarItem(int idItem, int idUsuario) throws Exception {
		boolean existeItem = iReqNegocio.existeItem(idItem);
		if(!existeItem) {
			throw new Exception("Item não encontrado.");
		}
		
		boolean existeUsuario = iReqSistema.verificarSeUsuarioExiste(idUsuario);
		if(!existeUsuario) {
			throw new Exception("Usuário não encontrado.");
		}
		
		Item item = iReqNegocio.recuperarItem(idItem);
		Usuario usuario = iReqSistema.recuperarUsuario(idUsuario);
		
		iReqNegocio.criarReserva(item, usuario);
	}
}
