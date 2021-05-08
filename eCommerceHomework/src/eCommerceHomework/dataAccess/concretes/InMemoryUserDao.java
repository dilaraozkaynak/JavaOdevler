package eCommerceHomework.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceHomework.dataAccess.abstracts.UserDao;
import eCommerceHomework.entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	private List<User> users = new ArrayList<User>();

	public InMemoryUserDao() {
		super();
		User user1 = new User(1, "Dilara", "Özkaynak", "dilaraaozk@gmail.com", "123456", true);
		User user2 = new User(2, "Timurhan", "Kurtuluþ", "timurhan@gmail.com", "789101", true);
		User user3 = new User(3, "Aleyna", "Aydemir", "aleyna@gmail.com", "111213", true);

		users.add(user1);
		users.add(user2);
		users.add(user3);
	}

	@Override
	public void add(User user) {
		System.out.println("Log bellekte: " + user.geteMail());
		users.add(user);

	}

	@Override
	public void update(User user) {
		User userToUpdate = users.stream().filter(u -> u.getId() == user.getId()).findFirst().orElse(null);

		userToUpdate.seteMail(user.geteMail());
		userToUpdate.seteMail(user.geteMail());
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.setPassword(user.getPassword());
		userToUpdate.setVerify(user.isVerify());

	}

	@Override
	public void delete(int userId) {
		User userToDelete = users.stream().filter(u -> u.getId() == userId).findFirst().orElse(null);

		users.remove(userToDelete);

	}

	@Override
	public User get(String eMail) {
		User user = users.stream().filter(u -> u.geteMail() == eMail).findFirst().orElse(null);
		return user;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
