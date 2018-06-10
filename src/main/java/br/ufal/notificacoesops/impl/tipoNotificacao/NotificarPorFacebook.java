package br.ufal.notificacoesops.impl.tipoNotificacao;



import br.ufal.notificacoesops.impl.TipoNotificacao;
import br.ufal.notificacoesops.spec.dt.UsuarioDT;
import co.aurasphere.botmill.core.annotation.Bot;
import co.aurasphere.botmill.fb.FbBot;
import co.aurasphere.botmill.fb.autoreply.MessageAutoReply;
import co.aurasphere.botmill.fb.event.FbBotMillEventType;
import co.aurasphere.botmill.fb.model.annotation.FbBotMillController;


@Bot
public class NotificarPorFacebook extends FbBot implements TipoNotificacao{

  
    @FbBotMillController(eventType=FbBotMillEventType.MESSAGE, text="Hi",caseSensitive = true)
    public void notificar(UsuarioDT usuario, Object contNotificacao) {
    	reply(new MessageAutoReply("Envio de notificação ao usuário"));
		
	}
}



