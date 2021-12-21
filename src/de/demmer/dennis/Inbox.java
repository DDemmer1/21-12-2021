package de.demmer.dennis;

public class Inbox extends MailCollection{


	public Inbox(int size) {
		super(size);
	}
	
	
	
	public void refreshInbox() {
		
		System.out.println("Inbox refreshed");
	}
	
	
}
