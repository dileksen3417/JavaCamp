package service.impl;

import dataAccess.SaleDao;
import domain.Campaign;
import domain.Game;
import domain.Gamer;
import domain.Sale;
import service.SaleService;

public class SaleServiceImpl implements SaleService {
    private final SaleDao saleDao;

    public SaleServiceImpl(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    @Override
    public void sell(Game game, Gamer gamer) {
        Sale sale = new Sale(1,"5000", game.getGameName(),gamer.getFirstName(),game.getSalePrice());
        saleDao.add(sale);
    }

    @Override
    public void sell(Game game, Gamer gamer, Campaign campaign) {
        Sale sale = new Sale(2,"5001",game.getGameName(),gamer.getFirstName(), campaign.getName(),game.getSalePrice());
        saleDao.add(sale);
    }
}
