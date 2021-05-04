package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		System.out.println("Satýn alýnan oyun : " + game.getGameName() + " Oyunun indirimli fiyatý : "
				+ campaign.getUnitPriceAfterDiscount() + "tl");

	}

	@Override
	public void saleWithoutCampaign(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(
				"Satýn alýnan oyun : " + game.getGameName() + " Oyunun indirimsiz fiyatý : " + campaign.getUnitPrice() + "tl");

	}

}
