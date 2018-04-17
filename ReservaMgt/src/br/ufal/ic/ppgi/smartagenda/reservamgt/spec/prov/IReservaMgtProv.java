package br.ufal.ic.ppgi.smartagenda.reservamgt.spec.prov;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Item;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Reserva;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Usuario;

public interface IReservaMgtProv {

	public List<Reserva> consultarLista(Item item);
	public void atualizarLista(List<Reserva> reservas);
	
	public Reserva criarReserva(Item item, Usuario usuario);
	public Reserva consultarReserva(Reserva reserva);
	
	/**
	 * Verificar se o item está disponível.
	 */
	public Reserva verificarDisponibilidade(Item item, Usuario usuario);
	
	public Reserva cancelarReserva(Reserva reserva);
	public Reserva finalizarReserva(Reserva reserva);

}
