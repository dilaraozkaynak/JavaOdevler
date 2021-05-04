package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void addGame(Game game) {
		System.out.println("Oyun Eklendi !\nOyun Adı : " + game.getGameName() + " Oyun Fiyatı : " + game.getGamePrice()+"tl");
		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println("Oyun : " + game.getGameName() + "Güncellendi!");
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println("Oyun : " + game.getGameName() + "Silindi!");
		
	}
	
}
