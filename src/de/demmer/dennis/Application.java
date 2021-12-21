package de.demmer.dennis;

import java.util.Arrays;
import java.util.Calendar;

public class Application {

	public static void main(String[] args) {
		
		Sent sent = new Sent(20);
		Inbox inbox = new Inbox(200);
		MailSender mailSender = new MailSender(sent);
		
		
		
		Mail mail = new Mail("sender@web.de", "Dennis.Demmer@uni-koeln.de");
		
		
		Calendar calender = Calendar.getInstance();
		calender.set(2021, 11, 31, 23, 59, 59);
		mail.setDate(calender.getTime());
		mail.setText("Frohes Neues!");
		mailSender.send(mail);
		
		
		System.out.println(Arrays.toString(sent.getMails()));
		
		
	}

}
