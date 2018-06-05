package br.ufal.ic.ppgi.smartagenda.reservaops.spec.req;


import java.util.List;

import br.ufal.ic.ppgi.smartagenda.reservaops.spec.dt.Item;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.dt.Reserva;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.dt.Usuario;

public interface IReservaReq {

	public List<Reserva> recuperarReservas(Item item);

	public Reserva criarReserva(Item item, Usuario usuario) throws Exception ;
	public Reserva recuperarReserva(Reserva reserva) throws Exception;
	public Reserva recuperarReserva(Item item, Usuario usuario) throws Exception;
	/**
	 * Verificar se o item está disponível.
	 */	
	public Boolean existeReservaAtiva(Item item, Usuario usuario);
	public Boolean existeReserva(Reserva reserva);
	
	public Reserva cancelarReserva(Reserva reserva);
	public Reserva finalizarReserva(Reserva reserva);
}
