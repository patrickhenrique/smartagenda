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
	public Reserva recuperarReserva(Reserva reserva) throws Exception {
		return reservaControle.recuperarReserva(reserva);
	}
	
	public Reserva recuperarReserva(Item item, Usuario usuario)throws Exception{
		return reservaControle.recuperarReserva(item, usuario);
	}
	
	@Override
	public Boolean existeReservaAtiva(Item item, Usuario usuario) {
		return reservaControle.existeReservaAtiva(item, usuario);
	}
	
	@Override
	public Boolean existeReserva(Reserva reserva) {
		return reservaControle.existeReserva(reserva);
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
