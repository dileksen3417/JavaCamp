package dataAccess;

import domain.Game;
import domain.Sale;

public class SaleDao {
    public void add(Sale sale){
        System.out.println("Satış bilgileri sisteme kaydedildi. ");
    }

    public void update(Sale sale){
        System.out.println("Satış bilgileri güncellendi.");
    }

    public void delete(Sale sale){
        System.out.println("Satış bilgileri sistemden silindi.");
    }
}
