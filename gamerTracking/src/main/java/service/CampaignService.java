package service;

import domain.Campaign;
import domain.Gamer;

public interface CampaignService {
    void add(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);
}
