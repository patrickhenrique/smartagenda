package br.ufal.ic.ppgi.smartagenda.reservamgt.spec.prov;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Reserva;

public interface IReservaMgt {

	public List<Reserva> consultarLista(int codItem);
	public void atualizarLista(List<Reserva> reservas);
	
	public Reserva criarReserva(int codItem, int codUsuario);
	public Reserva consultarReserva(int codReserva);
	
	/**
	 * Verificar se o item está disponível.
	 */
	public Reserva verificarDisponibilidade(int codItem, int codUsuario);
	
	public Reserva cancelarReserva(int codReserva);
	public Reserva finalizarReserva(int codReserva);

}
