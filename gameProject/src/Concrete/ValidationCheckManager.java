package Concrete;

import Abstract.ValidationCheckService;
import Entities.Gamer;

public class ValidationCheckManager implements ValidationCheckService {

	@Override
	public boolean checkIfValidate(Gamer gamer) {
		int nationalityIdLength = gamer.getNationalityId().length();
		if (nationalityIdLength == 11) {
			System.out.println("Tebrikler doðrulama baþarýlý!");
			return true;
		}

		else {
			System.out.println("Lütfen bilgilerinizi kontrol eder misiniz?");

		}

		return false;
	}

}
