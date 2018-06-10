package br.ufal.ic.ppgi.smartagenda.reservaops.impl;

import java.io.Serializable;

import br.ufal.ic.ppgi.smartagenda.reservaops.spec.dt.Item;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.dt.Reserva;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.dt.Usuario;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.prov.ICancelarReservaOps;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.prov.IManager.Interfaces.Required;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.req.IReqNegocio;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.req.IReqSistema;

public class FacadeCancelarReservaOps implements ICancelarReservaOps, Serializable {

	private static final long serialVersionUID = -6368737294891653454L;
	
	IReqNegocio iReqNegocio;
	IReqSistema iReqSistema;
	
	public FacadeCancelarReservaOps(IManager manager) {
		iReqNegocio = (IReqNegocio) manager.getRequiredInterface(Required.IReqNegocio);
		iReqSistema = (IReqSistema) manager.getRequiredInterface(Required.IReqSistema);
	}
	
	public void cancelarReserva(int idReserva, int idUsuario) throws Exception {
		boolean existeReserva = iReqNegocio.existeReservaAtiva(idReserva);
		if(!existeReserva) {
			throw new Exception("Reserva não encontrada.");
		}
		
		boolean existeUsuario = iReqSistema.verificarSeUsuarioExiste(idUsuario);
		if(!existeUsuario) {
			throw new Exception("Usuário não encontrado.");
		}
		
		Reserva reserva = iReqNegocio.recuperarReserva(idReserva);
		Usuario usuario = iReqSistema.recuperarUsuario(idUsuario);
		
		if(reserva.usuario.cod != usuario.cod) {
			throw new Exception("Esta reserva não pertence a este usuário.");
		}
		
		iReqNegocio.cancelarReserva(reserva);
		
	}
}
