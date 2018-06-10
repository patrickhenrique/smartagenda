package br.ufal.notificacoesops.impl;

import java.security.Security;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.smtp.SMTPTransport;

import br.ufal.notificacoesops.spec.dt.UsuarioDT;

public class NotificarPorEmail implements TipoNotificacao {

	public void notificar(UsuarioDT usuario, Object contNotificacao) {
		Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
		final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";

		// Get a Properties object
		Properties props = System.getProperties();
		props.setProperty("mail.smtps.host", "smtp.gmail.com");
		props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		props.setProperty("mail.smtp.socketFactory.fallback", "false");
		props.setProperty("mail.smtp.port", "465");
		props.setProperty("mail.smtp.socketFactory.port", "465");
		props.setProperty("mail.smtps.auth", "true");

		/*
		 * If set to false, the QUIT command is sent and the connection is immediately
		 * closed. If set to true (the default), causes the transport to wait for the
		 * response to the QUIT command.
		 * 
		 * ref :
		 * http://java.sun.com/products/javamail/javadocs/com/sun/mail/smtp/package-
		 * summary.html http://forum.java.sun.com/thread.jspa?threadID=5205249
		 * smtpsend.java - demo program from javamail
		 */
		props.put("mail.smtps.quitwait", "false");

		Session session = Session.getInstance(props, null);

		// -- Create a new message --
		final MimeMessage msg = new MimeMessage(session);

		try {
			// -- Set the FROM and TO fields --
			msg.setFrom(new InternetAddress("smartagenda@ufal.br"));
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(usuario.email, false));
	
			msg.setSubject("Notificação do SmartAgenda");
			msg.setText("Notificação do SmartAgenda", "utf-8");
			msg.setSentDate(new Date());
	
			SMTPTransport t = (SMTPTransport) session.getTransport("smtps");
	
			t.connect("smtp.gmail.com", "smartagenda@ufal.br", "");
			t.sendMessage(msg, msg.getAllRecipients());
			t.close();
		}catch(Exception excp) {}	

	}

}
