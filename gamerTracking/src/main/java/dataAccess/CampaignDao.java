package dataAccess;

import domain.Campaign;

public class CampaignDao {
    public void add(Campaign campaign){
        System.out.println("Kampanya sisteme eklendi. " + campaign.getName());
    }

    public void update(Campaign campaign){
        System.out.println("Kampanya bilgileri güncellendi. " + campaign.getName());
    }

    public void delete(Campaign campaign){
        System.out.println("Kampanya sistemden silindi. " + campaign.getName());
    }
}
