package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		System.out.println("Sat�n al�nan oyun : " + game.getGameName() + " Oyunun indirimli fiyat� : "
				+ campaign.getUnitPriceAfterDiscount() + "tl");

	}

	@Override
	public void saleWithoutCampaign(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(
				"Sat�n al�nan oyun : " + game.getGameName() + " Oyunun indirimsiz fiyat� : " + campaign.getUnitPrice() + "tl");

	}

}
