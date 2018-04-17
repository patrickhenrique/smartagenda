package br.ufal.ic.ppgi.smartagenda.reservamgt.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Item;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Reserva;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt.Usuario;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.prov.IManager.Interfaces;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.req.IReservaDAOReq;

public class ReservaControle {
		
	IReservaDAOReq opReq;
	IManager manager;
	
	public ReservaControle(IManager manager) {
		this.manager = manager;
		opReq = (IReservaDAOReq) manager.getRequiredInterface(Interfaces.Required.IOperacoesDAOReq);
	}
	
	public Reserva criarReserva(Item item, Usuario usuario) throws Exception {
		Boolean existeReserva = opReq.existeReservaAtiva(item.codigo, usuario.codigo);
		if(existeReserva) {
			throw new Exception("Usuário já possui uma reserva ativa para o item.");
		}
		
		Reserva reserva = new Reserva();
		reserva.setItem(item);
		reserva.setUsuario(usuario);
		
		Date dataAtual = new Date();
		reserva.setCriadaEm(dataAtual);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime((Date) dataAtual.clone());
		calendar.add(Calendar.DAY_OF_YEAR, 7);
		
		Date validoAte = calendar.getTime();
		
		reserva.setValidoAte(validoAte);
		
		reserva = opReq.criarReserva(reserva);
		
		return reserva;
	}

	public Reserva atualizarReserva(Reserva reserva) throws Exception {
		Boolean existeReserva = opReq.existeReserva(reserva.getCodigo());
		if(existeReserva) {
			reserva = opReq.atualizarReserva(reserva);
		}else {
			throw new Exception("Reserva não existe.");
		}
		return reserva;		
	}
	
	public List<Reserva> recuperarReservas(Item item) {
		return opReq.recuperarReservas(item.codigo);
	}
	
	public Reserva recuperarReserva(Reserva reserva) {
		return opReq.recuperarReserva(reserva.getCodigo());
	}
	
	public Reserva verificarDisponibilidade(Item item, Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Reserva cancelarReserva(Reserva reserva) {
		// TODO Auto-generated method stub		
		return null;
	}

	public Reserva finalizarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return null;
	}
}
