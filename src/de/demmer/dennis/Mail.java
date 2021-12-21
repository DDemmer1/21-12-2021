package de.demmer.dennis;

import java.util.Date;

import org.simplejavamail.api.email.Email;
import org.simplejavamail.api.mailer.Mailer;
import org.simplejavamail.email.EmailBuilder;
import org.simplejavamail.mailer.MailerBuilder;

public class Mail{

	private String sender;
	private String recipient;
	private Date date;
	private String text;
	
	
	public Mail() {
		System.out.println("Objekt wird aus Klasse erstellt");
	}

	public Mail(String sender, String recipient) {
		this();
		this.sender = sender;
		this.recipient = recipient;
		this.date = new Date();
		this.text = "";
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSender() {
		return sender;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String toString() {
		return "Mail [sender=" + sender + ", recipient=" + recipient + ", date=" + date + ", text=" + text + "]";
	}
	
	public void send() {
	
		Email email = EmailBuilder.startingBlank().appendText(getText()).to(getRecipient())
				.from(getSender()).fixingSentDate(date).buildEmail();
		Mailer mailer = MailerBuilder.withSMTPServer("smtp.uni-koeln.de", 25).buildMailer();
		mailer.sendMail(email);
	}

}
