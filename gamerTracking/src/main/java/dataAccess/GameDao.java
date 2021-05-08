package dataAccess;

import domain.Campaign;
import domain.Game;

public class GameDao {
    public void add(Game game){
        System.out.println("Kampanya sisteme eklendi. " + game.getGameName());
    }

    public void update(Game game){
        System.out.println("Kampanya bilgileri güncellendi. " + game.getGameName());
    }

    public void delete(Game game){
        System.out.println("Kampanya sistemden silindi. " + game.getGameName());
    }
}
