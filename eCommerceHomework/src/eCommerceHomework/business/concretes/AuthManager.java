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
			System.out.println("Kayıt başarısız!");
		}	
		
	}

	@Override
	public void verify(User user, String token) {
		if(user != null && token.length() > 15) {			
			User existUser= userService.get(user.geteMail());
			existUser.setVerify(true);
			
			userService.update(existUser);	
			
			System.out.println("Email doğrulandı.");
		}
		else {
			System.out.println("Email doğrulanamadı.");
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
			System.out.println("Başarıyla giriş yaptınız.");				
		}
		else {
			System.out.println("Kullanıcı adı veya şifren yanlış!");
		}	
	}

	public boolean userValidate(User user) {	
		if(user != null && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty()
				&& !user.geteMail().isEmpty()	&& !user.getPassword().isEmpty()) {
			return true;			
		}
		
		System.out.println("Boş alan bırakmayınız.");
		
		return false;		
	}
	
	public boolean passwordValidate(String password) {
		
		if(password.length() >= 6 ) {
			return true;
		}
		
		System.out.println("Şifreniz 6 karakterden dhaa uzun olmalıdır.");
		
		return false;
	}
}
