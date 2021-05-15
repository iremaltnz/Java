package Concrete;

import java.util.ArrayList;

import Abstract.GameService;
import Entities.Game;


public class GameManager implements GameService {
	
	ArrayList<Game> games;
	private Game _game =new Game();
	
	
	public GameManager() {
		super();
		games=new ArrayList<Game>() {};
		
	}

	@Override
	public void add(Game game) {
		
			games.add(game);
			System.out.println("Oyun Eklendi");
	}

	@Override
	public void delete(Game game) {
	
		for (Game g : games) {
			if(g.getId()==game.getId()) _game=g;
		}
		
		games.remove(_game.getId()-1);
		System.out.println(" "+_game.getName()+" isimli oyuncu silindi");
	}

	@Override
	public void update(Game game) {
		for (Game g : games) {
			if(g.getId()==game.getId()) _game=g;
		}
		
		games.set(_game.getId()-1, game);
		System.out.println(" "+_game.getName()+" isimli oyuncu güncellendi");
		
	}

	@Override
	public void list() {
		
		for (Game gamer : games) {
			System.out.println("Game Id="+gamer.getId() + "\nName=" + gamer.getName() + "\nPrice=" + gamer.getPrice()+ "\nSystem Requirements" + gamer.getSystemRequirements());
		}
		
	}

}
