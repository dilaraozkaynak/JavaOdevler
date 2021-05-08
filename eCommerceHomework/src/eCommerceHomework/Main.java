package eCommerceHomework;

import eCommerceHomework.business.concretes.AuthManager;
import eCommerceHomework.business.concretes.UserManager;
import eCommerceHomework.core.AmazonMailManagerAdapter;
import eCommerceHomework.core.GoogleMailManagerAdapter;
import eCommerceHomework.dataAccess.concretes.InMemoryUserDao;
import eCommerceHomework.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		        //UserManager userManager=new UserManager(new InMemoryUserDao(), new AmazonMailManagerAdapter());
				User dilara=new User(1, "Dilara", "Özkaynak", "dilaraaozk@gmail.com", "123456", true);
				//userManager.add(dilara);
				
				User dilara1 = new User(4, "Dilara", "Kurtuluþ", "dilarakurtulus@gmail.com", "456456", true);
				//userManager.update(dilara1);
				
				InMemoryUserDao inMemoryUserDao = new InMemoryUserDao();
				GoogleMailManagerAdapter googleMailManagerAdapter = new GoogleMailManagerAdapter();
				AmazonMailManagerAdapter amazonMailManagerAdapter = new  AmazonMailManagerAdapter();

				
				AuthManager authManager =new AuthManager(new UserManager(inMemoryUserDao, googleMailManagerAdapter));
				//authManager.register(dilara);
				authManager.register(dilara);
				UserManager userManager = new UserManager(inMemoryUserDao, amazonMailManagerAdapter);
				
				userManager.getAll();
				//userManager.getAll();		
				
			}
		}
