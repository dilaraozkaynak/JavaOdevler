package Adapters;

import java.rmi.RemoteException;

import Abstract.ValidationCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements ValidationCheckService {

	@Override
	public boolean checkIfValidate(Gamer gamer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(),
					gamer.getBirthYear());
		}catch (NumberFormatException exception) {
			exception.printStackTrace();
		}catch (RemoteException exception) {
			exception.printStackTrace();
		}
		
		return result;
	}

	

}
