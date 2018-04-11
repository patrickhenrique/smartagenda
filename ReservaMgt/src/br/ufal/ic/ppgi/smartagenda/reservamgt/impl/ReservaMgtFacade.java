package br.ufal.ic.ppgi.smartagenda.reservamgt.impl;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Item;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Reserva;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Usuario;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.prov.IReservaMgt;

class ReservaMgtFacade implements IReservaMgt {

	@Override
	public List<Reserva> consultarLista(int codItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizarLista(List<Reserva> reservas) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public Reserva criarReserva(int codItem, int codUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reserva consultarReserva(int codReserva) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Reserva verificarDisponibilidade(int codItem, int codUsuario) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Reserva cancelarReserva(int codReserva) {
		// TODO Auto-generated method stub		
		return null;
	}

	@Override
	public Reserva finalizarReserva(int codReserva) {
		// TODO Auto-generated method stub
		return null;
	}
}
