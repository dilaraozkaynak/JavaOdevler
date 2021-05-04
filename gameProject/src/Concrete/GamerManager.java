package Concrete;

import Abstract.GamerService;
import Abstract.ValidationCheckService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	private ValidationCheckService validationCheckService;

	public GamerManager(ValidationCheckService validationCheckService) {
		this.validationCheckService = validationCheckService;
	}

	@Override
	public void registration(Gamer gamer) {
		if (validationCheckService.checkIfValidate(gamer)) {
			System.out.println("Kayýt iþlemi baþarýlý! " + gamer.getFirstName());
		} else {
			System.out.println("Geçerli bir kullanýcý deðil!");
		}

	}

	@Override
	public void updateInfo(Gamer gamer) {
		if (validationCheckService.checkIfValidate(gamer)) {
			System.out.println("Güncelleme iþlemi baþarýlý! : " + gamer.getFirstName());

		} else {
			System.out.println("Geçerli bir kullanýcý deðil!");
		}
	}

	@Override
	public void deleteInfo(Gamer gamer) {
		if (validationCheckService.checkIfValidate(gamer)) {
			System.out.println("Silme iþlemi baþarýlý! : " + gamer.getFirstName());

		} 

	}

}
