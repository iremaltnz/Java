package Adapter;

import Abstract.VerificationService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class EDevletVerificationService implements VerificationService {

	@Override
	public boolean verify(Gamer gamer) {
		
		KPSPublicSoapProxy client =new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
		 result = client.TCKimlikNoDogrula(Long.parseLong(gamer.getNatioanlityId()) , gamer.getFirstName(), gamer.getLastName(), gamer.getDateOfBirth().getYear());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
