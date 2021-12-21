package de.demmer.dennis;


public class Application {

	public static void main(String[] args) {

		Mail mail = new Mail("sender@web.de", "recipient@uni-koeln.de");
		mail.setText("Hallo Welt!");
		mail.send();
		System.out.println(mail.toString());
	
	}

}
