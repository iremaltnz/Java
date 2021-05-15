import java.time.LocalDate;

import Adapter.EDevletVerificationService;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer=new Gamer();
        gamer.setId(1);
        gamer.setNatioanlityId("*********");
        gamer.setFirstName("Ýrem");
        gamer.setLastName("Altýnöz");
        gamer.setDateOfBirth(LocalDate.of(2001,01,19));
        
        GamerManager gamerManager= new GamerManager(new EDevletVerificationService());
        
       gamerManager.add(gamer);
       gamerManager.list();
       System.out.println("-------");
       
       Game game=new Game();
       game.setId(1);
       game.setName("Gta");
       game.setPrice(50);
       game.setSystemRequirements("****");
       
       Campaign campaign=new Campaign();
       campaign.setId(1);
       campaign.setName("Black Friday");
       campaign.setCampaignRate(20);
       
       SalesManager salesManager= new SalesManager();
       salesManager.sales(game, gamer);
       salesManager.sales(game, gamer, campaign);
       
	}

}
