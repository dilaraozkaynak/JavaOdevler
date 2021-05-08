package eCommerceHomework.business.abstracts;

import eCommerceHomework.entities.concretes.LoginDto;
import eCommerceHomework.entities.concretes.User;

public interface AuthService {
	void register(User user);

	void verify(User user, String token);

	boolean userExists(String eMail);

	void login(LoginDto dto);
}
