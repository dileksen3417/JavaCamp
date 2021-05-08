package Test;

import adapters.PersonCheckService;
import adapters.PersonCheckServices;
import dataAccess.CampaignDao;
import dataAccess.GamerDao;
import dataAccess.SaleDao;
import domain.Campaign;
import domain.Game;
import domain.Gamer;
import service.CampaignService;
import service.GamerService;
import service.SaleService;
import service.impl.CampaignServiceImpl;
import service.impl.GamerServiceImpl;
import service.impl.SaleServiceImpl;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Main {
    private static Object LocalDate;

    public static void main(String[] args) {
        Gamer gamer = new Gamer(1, "00000000062", "Dilek", "Şen", 1995, "dsen");
        PersonCheckServices personCheckServices = new PersonCheckService();
        GamerService gamerService = new GamerServiceImpl(new GamerDao(), personCheckServices);
        gamerService.add(gamer);
        gamerService.update(gamer);
        gamerService.delete(gamer);

        Campaign campaign = new Campaign(1, "Yeni yıl kampanyası", "Yeni yıl fırsatları", 15);
        CampaignService campaignService = new CampaignServiceImpl(new CampaignDao());
        campaignService.add(campaign);
        campaignService.update(campaign);
        campaignService.delete(campaign);

        Game game = new Game(1, "Strike", "Strike Game v2", 2, 150);

        SaleService saleService = new SaleServiceImpl(new SaleDao());
        saleService.sell(game, gamer, campaign);
        saleService.sell(game, gamer);
    }
}
