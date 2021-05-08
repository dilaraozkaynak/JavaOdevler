package eCommerceHomework.business.concretes;

import java.util.List;

import eCommerceHomework.business.abstracts.UserService;
import eCommerceHomework.core.EmailService;
import eCommerceHomework.dataAccess.abstracts.UserDao;
import eCommerceHomework.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private EmailService eMailService;
	
	public UserManager(UserDao userDao, EmailService eMailService) {
		super();
		this.userDao=userDao;
		this.eMailService=eMailService;
	}

	@Override
	public void add(User user) {
		//if(userValidate(user)) {
		userDao.add(user);	
		System.out.println("Log: " + user.geteMail());
		eMailService.send(user.geteMail(), "Kayýt oldunuz.");
		//}
	}

	@Override
	public void add(String eMail) {
		//if(!email.isEmpty()) {
		User user =new User();
		user.seteMail(eMail);
		userDao.add(user);
		System.out.println("Log2: " + user.geteMail());
		eMailService.send(eMail,"Kayýt oldunuz.");
		//}
	}

	@Override
	public void update(User user) {
		if(userValidate(user)) {
			userDao.update(user);
		}		
		
	}

	@Override
	public void delete(int userId) {
		userDao.delete(userId);	
		
	}

	@Override
	public User get(String eMail) {
		return userDao.get(eMail);
	}

	@Override
	public List<User> getAll() {
		for (User user : userDao.getAll()) {
			System.out.println(user.getId() +" "+ user.geteMail() +" "+ user.getFirstName());
		}
		return userDao.getAll();
	}
	
	public boolean userValidate(User user) {
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			return true;				
		}
		System.out.println("Adýnýz ve soyadýnýz minimum 2 karakter olmalý.");
		return false;
	}

}
