package service.impl;

import dataAccess.CampaignDao;
import domain.Campaign;
import service.CampaignService;

public class CampaignServiceImpl implements CampaignService {
    private final CampaignDao campaignDao;

    public CampaignServiceImpl(CampaignDao campaignDao) {
        this.campaignDao = campaignDao;
    }

    @Override
    public void add(Campaign campaign) {
        campaignDao.add(campaign);
    }

    @Override
    public void update(Campaign campaign) {
        campaignDao.update(campaign);
    }

    @Override
    public void delete(Campaign campaign) {
        campaignDao.delete(campaign);
    }
}
