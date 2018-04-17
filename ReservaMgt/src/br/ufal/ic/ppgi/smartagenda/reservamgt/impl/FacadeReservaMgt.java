package br.ufal.ic.ppgi.smartagenda.reservamgt.impl;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Item;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Reserva;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Usuario;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.prov.IReservaMgt;

class FacadeReservaMgt implements IReservaMgt {

	private ReservaControle reservaControle;
	
	public FacadeReservaMgt(IManager manager) {
		this.reservaControle = new ReservaControle(manager);
	}
	
	@Override
	public List<Reserva> recuperarReservas(Item item) {		
		return reservaControle.recuperarReservas(item);
	}

	@Override
	public Reserva criarReserva(Item item, Usuario usuario) throws Exception {
		return reservaControle.criarReserva(item, usuario);
	}

	@Override
	public Reserva consultarReserva(Reserva reserva) {
		return reservaControle.recuperarReserva(reserva);
	}
	
	@Override
	public Reserva verificarDisponibilidade(Item item, Usuario usuario) {
		return reservaControle.verificarDisponibilidade(item, usuario);
	}
	
	@Override
	public Reserva cancelarReserva(Reserva reserva) {
		return reservaControle.cancelarReserva(reserva);
	}

	@Override
	public Reserva finalizarReserva(Reserva reserva) {
		return reservaControle.finalizarReserva(reserva);
	}
}
