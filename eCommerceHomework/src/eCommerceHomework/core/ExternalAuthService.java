package eCommerceHomework.core;

import eCommerceHomework.entities.concretes.LoginDto;

public interface ExternalAuthService {
	void register(String email);
	boolean userExists(String eMail);
	void login(LoginDto dto);
}
