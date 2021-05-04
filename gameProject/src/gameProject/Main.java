package gameProject;

import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Concrete.ValidationCheckManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		gamer.setFirstName("Dilara");
		gamer.setLastName("Özkaynak");
		gamer.setNationalityId("11111111111");
		gamer.setBirthYear(1997);

		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.registration(gamer);

		GamerManager gamerManager2 = new GamerManager(new ValidationCheckManager());
		gamerManager2.deleteInfo(gamer);

		Game game = new Game(1, "The Sims 4", 150);
		GameManager gameManager = new GameManager();
		gameManager.addGame(game);

		Campaign campaign = new Campaign(10, 150);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign, game);
		campaignManager.updateCampaign(campaign, game);
		campaignManager.deleteCampaign(campaign, game);
		campaign.getUnitPriceAfterDiscount();

		SaleManager saleManager = new SaleManager();
		saleManager.saleWithCampaign(game, gamer, campaign);
		saleManager.saleWithoutCampaign(game, gamer, campaign);
	}

}