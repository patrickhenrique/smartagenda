package br.ufal.ic.ppgi.smartagenda.notificacaoops.spec.dt;

import java.sql.Date;

public class ReservaDT {
	
	
	public long id;
	public UsuarioDT usuario;
	public Date dataReserva;
	public ItemDT itemReserva;
	public boolean cancelada;
	
	
}


