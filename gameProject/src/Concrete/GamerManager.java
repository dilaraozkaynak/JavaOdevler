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
			System.out.println("Kay�t i�lemi ba�ar�l�! " + gamer.getFirstName());
		} else {
			System.out.println("Ge�erli bir kullan�c� de�il!");
		}

	}

	@Override
	public void updateInfo(Gamer gamer) {
		if (validationCheckService.checkIfValidate(gamer)) {
			System.out.println("G�ncelleme i�lemi ba�ar�l�! : " + gamer.getFirstName());

		} else {
			System.out.println("Ge�erli bir kullan�c� de�il!");
		}
	}

	@Override
	public void deleteInfo(Gamer gamer) {
		if (validationCheckService.checkIfValidate(gamer)) {
			System.out.println("Silme i�lemi ba�ar�l�! : " + gamer.getFirstName());

		} 

	}

}
