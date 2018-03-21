package br.ufal.ic.ppgi.smartagenda.reservamgt.spec.prov;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Reserva;

public interface IReservaMgt {

	public List<Reserva> consultarList(int codItem);
	public void atualizarLista(List<Reserva> reservas);
	public Reserva consultarReserva(int codReserva);
	public Reserva cancelarReserva(int codReserva);

}
