package dataAccess;

import domain.Gamer;

public class GamerDao {
    public void add(Gamer gamer){
        System.out.println("Oyuncu sisteme eklendi. " + gamer.getUserName());
    }

    public void update(Gamer gamer){
        System.out.println("Oyuncu bilgileri güncellendi. " + gamer.getUserName());
    }

    public void delete(Gamer gamer){
        System.out.println("Oyuncu sistemden silindi. " + gamer.getUserName());
    }
}
