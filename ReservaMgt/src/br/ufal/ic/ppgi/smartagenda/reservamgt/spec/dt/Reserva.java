package br.ufal.ic.ppgi.smartagenda.reservamgt.spec.dt;

import java.util.Date;

public class Reserva {
	private int codigo;
	private Item item;
	private Usuario usuario;
	private Date criadaEm;
	private Date disponivelEm;
	private Date validoAte;
	private Date finalizadaEm;
	
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}
	
	public Item getItem() {
		return this.item;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public void setCriadaEm(Date data) {
		this.criadaEm = data;
	}
	
	public Date getCriadaEm() {
		return this.criadaEm;
	}
	
	public void setDisponivelEm(Date data) {
		this.disponivelEm = data;
	}
	
	public Date getDisponivelEm() {
		return this.disponivelEm;
	}
	
	public void setValidoAte(Date data) {
		this.validoAte = data;
	}
	
	public Date getValidoAte() {
		return this.validoAte;
	}
	
	public void setFinalizadaEm(Date data) {
		this.finalizadaEm = data;
	}
	
	public Date getFinalizadaEm() {
		return this.finalizadaEm;
	}
	
}