package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SalesService {
	void sales(Game game, Gamer gamer);
	void sales(Game game, Gamer gamer,Campaign campaign);
}
