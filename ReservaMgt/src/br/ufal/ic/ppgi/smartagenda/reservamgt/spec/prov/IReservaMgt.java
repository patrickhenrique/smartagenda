package br.ufal.ic.ppgi.smartagenda.reservamgt.spec.prov;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Item;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Reserva;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Usuario;

public interface IReservaMgt {

	public List<Reserva> recuperarReservas(Item item);

	public Reserva criarReserva(Item item, Usuario usuario)throws Exception ;
	public Reserva consultarReserva(Reserva reserva);
	
	/**
	 * Verificar se o item está disponível.
	 */
	public Reserva verificarDisponibilidade(Item item, Usuario usuario);
	
	public Reserva cancelarReserva(Reserva reserva);
	public Reserva finalizarReserva(Reserva reserva);

}
