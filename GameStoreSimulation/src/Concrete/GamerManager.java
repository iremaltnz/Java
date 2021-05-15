package Concrete;

import java.util.ArrayList;

import Abstract.GamerService;
import Abstract.VerificationService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	ArrayList<Gamer> gamers;
	private Gamer _gamer =new Gamer();
	VerificationService verificationService;
	
	
	
	public GamerManager( VerificationService verificationService) {
		super();
		gamers=new ArrayList<Gamer>() {};
		this.verificationService = verificationService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if(verificationService.verify(gamer)) {
			gamers.add(gamer);
			System.out.println("Oyuncu Doðrulandý");
			System.out.println("Oyuncu Eklendi");
		}
		else {
			System.out.println("Ýþlem basarisiz lutfen gercek bir kullanici giriniz");
		}
	}

	@Override
	public void delete(Gamer gamer) {
	
		for (Gamer g : gamers) {
			if(g.getId()==gamer.getId()) _gamer=g;
		}
		
		gamers.remove(_gamer.getId()-1);
		System.out.println(" "+_gamer.getFirstName()+" isimli oyuncu silindi");
	}

	@Override
	public void update(Gamer gamer) {
		for (Gamer g : gamers) {
			if(g.getId()==gamer.getId()) _gamer=g;
		}
		
		gamers.set(_gamer.getId()-1, gamer);
		System.out.println(" "+_gamer.getFirstName()+" isimli oyuncu güncellendi");
		
	}

	@Override
	public void list() {
		
		for (Gamer gamer : gamers) {
			System.out.println("Gamer Id="+gamer.getId()+"\nTcNum="+gamer.getNatioanlityId()+ "\nFirsName="+gamer.getFirstName()+"\nLastName="+gamer.getLastName()+
					"\nBirth Year="+ gamer.getDateOfBirth());
		}
		
	}

	
}
