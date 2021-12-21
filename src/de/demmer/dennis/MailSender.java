package de.demmer.dennis;

import org.simplejavamail.api.email.Email;
import org.simplejavamail.api.mailer.Mailer;
import org.simplejavamail.email.EmailBuilder;
import org.simplejavamail.mailer.MailerBuilder;

public class MailSender {

	public Sent sent;
	
	public MailSender(Sent sent) {
		this.sent = sent;
	}
	
	
	public void send(Mail mail) {
		
		Email email = EmailBuilder.startingBlank().appendText(mail.getText()).to(mail.getRecipient()).from(mail.getSender()).fixingSentDate(mail.getDate()).buildEmail();
		Mailer mailer = MailerBuilder.withSMTPServer("smtp.uni-koeln.de", 25).buildMailer();
		mailer.sendMail(email);
		
		sent.addMail(mail);
		
	}

}
