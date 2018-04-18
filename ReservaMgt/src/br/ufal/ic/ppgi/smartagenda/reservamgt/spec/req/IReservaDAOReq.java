package br.ufal.ic.ppgi.smartagenda.reservamgt.spec.req;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Reserva;

public interface IReservaDAOReq {

	public Reserva criarReserva(Reserva reserva);
	
	public Reserva atualizarReserva(Reserva reserva);
	
	public Reserva recuperarReserva(int codReserva);
	public Reserva recuperarReserva(int codItem, int codUsuario);
	
	public List<Reserva> recuperarReservas(int codItem);
	
	public Boolean existeReserva(int codReserva);
	public Boolean existeReservaAtiva(int codItem, int codUsuario);
	
}
