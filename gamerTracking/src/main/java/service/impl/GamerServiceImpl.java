package service.impl;

import adapters.PersonCheckServices;
import dataAccess.GamerDao;
import domain.Gamer;
import service.GamerService;

public class GamerServiceImpl implements GamerService {
    private final GamerDao gamerDao;
    private final PersonCheckServices personCheckServices;

    public GamerServiceImpl(GamerDao gamerDao, PersonCheckServices personCheckServices) {
        this.gamerDao = gamerDao;
        this.personCheckServices = personCheckServices;
    }

    @Override
    public void add(Gamer gamer) {
        if (personCheckServices.isPersonReal(gamer.getNationalityId(), gamer.getFirstName(), gamer.getLastName(), gamer.getYear())){
            gamerDao.add(gamer);
        } else {
            System.out.println("Kimlik bilgileri geçersizdir.");
        }
    }

    @Override
    public void update(Gamer gamer) {
        gamerDao.update(gamer);
    }

    @Override
    public void delete(Gamer gamer) {
        gamerDao.delete(gamer);
    }
}
