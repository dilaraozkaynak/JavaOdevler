package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign, Game game) {
		System.out
				.println("%" + campaign.getDiscountRate() + " indirim oran� oyununuza eklendi : " + game.getGameName());

	}

	@Override
	public void deleteCampaign(Campaign campaign, Game game) {
		System.out.println("�zg�n�z, kampanya bitti");

	}

	@Override
	public void updateCampaign(Campaign campaign, Game game) {
		System.out
				.println("Oyunun indirim oran� g�ncellendi : " + game.getGameName());

	}

}
