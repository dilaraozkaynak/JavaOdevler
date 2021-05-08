package eCommerceHomework.business.abstracts;

import java.util.List;

import eCommerceHomework.entities.concretes.User;

public interface UserService {
	void add(User user);

	void add(String eMail);

	void update(User user);

	void delete(int userId);

	User get(String eMail);

	List<User> getAll();
}
