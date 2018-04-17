package br.ufal.ic.ppgi.smartagenda.reservamgt.impl;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Item;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Reserva;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Usuario;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.req.IOperacoesReq;

public class ReservaControle {
		
	IOperacoesReq opReq;
	IManager manager;
	public ReservaControle(IManager manager) {
		this.manager = manager;
		opReq = (IOperacoesReq) manager.getRequiredInterface("IOperacoesReq");
	}

	public List<Reserva> consultarLista(Item item) {
		// TODO Auto-generated method stub
		return null;
	}

	public void atualizarLista(List<Reserva> reservas) {
		// TODO Auto-generated method stub
	}
	
	public Reserva criarReserva(Item item, Usuario usuario) {
		Reserva reserva = new Reserva();
		reserva.setItem(item);
		reserva.setUsuario(usuario);
		
		opReq.criarReserva(reserva);
		
		return reserva;
	}

	public Reserva consultarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Reserva verificarDisponibilidade(Item item, Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Reserva cancelarReserva(Reserva reserva) {
		// TODO Auto-generated method stub		
		return null;
	}

	public Reserva finalizarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return null;
	}
}
