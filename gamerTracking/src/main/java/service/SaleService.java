package service;

import domain.Campaign;
import domain.Game;
import domain.Gamer;
import domain.Sale;

public interface SaleService {
    void sell(Game game, Gamer gamer);
    void sell(Game game, Gamer gamer, Campaign campaign);
}
