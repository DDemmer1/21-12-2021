package de.demmer.dennis;

public class MailCollection {
	
	private Mail[] mails;
	
	public MailCollection(int size) {
		mails = new Mail[size];
	}
	
	public boolean addMail(Mail mail) {
		
		for (int i = 0; i < this.mails.length; i++) {
			if (mails[i] == null) {
				mails[i] = mail;
				return true;
			}		
		}
		return false;
	}
	
	

	public Mail[] getMails() {
		return mails;
	}
	
	
	
	

}
