package eCommerceHomework.core;

import eCommerceHomework.amazonEmail.AmazonMailManager;

public class AmazonMailManagerAdapter implements EmailService{

	private AmazonMailManager amazonMailManager;
	
	public AmazonMailManagerAdapter() {
		amazonMailManager = new AmazonMailManager();
	}

	@Override
	public void send(String eMail, String message) {
		amazonMailManager.send(eMail, message);
	}
}
