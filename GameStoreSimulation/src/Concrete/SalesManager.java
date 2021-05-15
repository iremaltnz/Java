package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService {

	@Override
	public void sales(Game game, Gamer gamer) {
		System.out.println(game.getName()+"isimli oyun "+gamer.getFirstName()+" "+gamer.getLastName()+" taraf�ndan "+game.getPrice()+" TL fiyatina satin alinm��tir.");
	}

	@Override
	public void sales(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName()+"isimli oyun "+gamer.getFirstName()+" "+gamer.getLastName()+" taraf�ndan "+
	campaign.getName()+" sebebiyle %"+campaign.getCampaignRate()+" indirimli fiyati olan " +
                (game.getPrice()- game.getPrice()*0.01*campaign.getCampaignRate()) + " TL fiyat�na sat�n al�nm��t�r.");
	
		
	}

}
