package br.ufal.notificacoesops.spec.dt;

public class Notificacao {
	
	
	private long id;
	private UsuarioDT usuario;
	private TipoNotificacao tipoNotificacao;
	private String mensagemNotificacao;
	private Item item;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public UsuarioDT getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioDT usuario) {
		this.usuario = usuario;
	}
	public TipoNotificacao getTipoNotificacao() {
		return tipoNotificacao;
	}
	public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
		this.tipoNotificacao = tipoNotificacao;
	}
	public String getMensagemNotificacao() {
		return mensagemNotificacao;
	}
	public void setMensagemNotificacao(String mensagemNotificacao) {
		this.mensagemNotificacao = mensagemNotificacao;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	
	

}


