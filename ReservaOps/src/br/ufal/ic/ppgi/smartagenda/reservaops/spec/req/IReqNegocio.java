package br.ufal.ic.ppgi.smartagenda.reservaops.spec.req;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.reservaops.spec.dt.Item;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.dt.Reserva;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.dt.Usuario;

public interface IReqNegocio {
	
	//Criar reserva
	public Reserva criarReserva(Item item, Usuario usuario) throws Exception ;
	
	// Recuperar reservas
	public Reserva recuperarReserva(Reserva reserva) throws Exception;
	public Reserva recuperarReserva(Item item, Usuario usuario) throws Exception;
	public List<Reserva> recuperarReservas(Item item);
	
	//Verificar se o item está disponível.
	public Boolean existeReservaAtiva(Item item);
	public Boolean existeReservaAtiva(Item item, Usuario usuario);
	
	//Finalizar reserva	 
	public Reserva cancelarReserva(Reserva reserva);
	public Reserva finalizarReserva(Reserva reserva);
}
