package eCommerceHomework.core;

import eCommerceHomework.business.abstracts.UserService;
import eCommerceHomework.entities.concretes.LoginDto;
import eCommerceHomework.entities.concretes.User;

public class GoogleAuthManagerAdapter implements ExternalAuthService{
	
private UserService userService;
	
	public GoogleAuthManagerAdapter(UserService userService) {
		super();
		this.userService=userService;
	}


	@Override
	public void register(String eMail) {

		if(userExists(eMail) == false) {				
			userService.add(eMail);	
		}
		
		else {
			User user=userService.get(eMail);
			
			LoginDto dto=new LoginDto();
			dto.seteMail(user.geteMail());
			dto.setPassword(user.getPassword());
			
			login(dto);
		}	
		
	}

	@Override
	public boolean userExists(String eMail) {
		if(userService.get(eMail) != null) {
			return true;
		}
		
		return false;
	}

	@Override
	public void login(LoginDto dto) {
		if(dto != null && dto.getPassword().equals(dto.getPassword())) {
			System.out.println("Baþarýyla giriþ yaptýnýz.");				
		}
		else {
			System.out.println("Kullanýcý adý veya þifren yanlýþ.");
		}
	
		
	}

}
