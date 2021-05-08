package eCommerceHomework.business.concretes;

import eCommerceHomework.business.abstracts.AuthService;
import eCommerceHomework.business.abstracts.UserService;
import eCommerceHomework.core.utils.Utils;
import eCommerceHomework.entities.concretes.LoginDto;
import eCommerceHomework.entities.concretes.User;

public class AuthManager implements AuthService{
	
	private UserService userService;
	
	public AuthManager(UserService userService) {
		super();
		this.userService=userService;
	}

	@Override
	public void register(User user) {
		if(userValidate(user) 
				&& passwordValidate(user.getPassword()) 
				&& userExists(user.geteMail()) == false 
				&& Utils.eMailValidate(user.geteMail())) 
		{
			userService.add(user);	
		}
		else {
			System.out.println("Kay�t ba�ar�s�z!");
		}	
		
	}

	@Override
	public void verify(User user, String token) {
		if(user != null && token.length() > 15) {			
			User existUser= userService.get(user.geteMail());
			existUser.setVerify(true);
			
			userService.update(existUser);	
			
			System.out.println("Email do�ruland�.");
		}
		else {
			System.out.println("Email do�rulanamad�.");
		}	
		
	}

	@Override
	public boolean userExists(String eMail) {
		User user=userService.get(eMail);

		if(user == null) {
			return false;
		}
		
		else {
			System.out.println("Email zaten mevcut!" + eMail);		
			return true;
		}		
	}

	@Override
	public void login(LoginDto dto) {
User user = userService.get(dto.geteMail());
		
		if(user != null && user.getPassword().equals(dto.getPassword())) {
			System.out.println("Ba�ar�yla giri� yapt�n�z.");				
		}
		else {
			System.out.println("Kullan�c� ad� veya �ifren yanl��!");
		}	
	}

	public boolean userValidate(User user) {	
		if(user != null && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty()
				&& !user.geteMail().isEmpty()	&& !user.getPassword().isEmpty()) {
			return true;			
		}
		
		System.out.println("Bo� alan b�rakmay�n�z.");
		
		return false;		
	}
	
	public boolean passwordValidate(String password) {
		
		if(password.length() >= 6 ) {
			return true;
		}
		
		System.out.println("�ifreniz 6 karakterden dhaa uzun olmal�d�r.");
		
		return false;
	}
}
