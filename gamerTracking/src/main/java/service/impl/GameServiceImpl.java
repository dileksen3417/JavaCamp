package service.impl;

import dataAccess.GameDao;
import domain.Game;
import service.GameService;

public class GameServiceImpl implements GameService {
    private final GameDao gameDao;

    public GameServiceImpl(GameDao gameDao) {
        this.gameDao = gameDao;
    }

    @Override
    public void add(Game game) {
        gameDao.add(game);
    }

    @Override
    public void update(Game game) {
        gameDao.update(game);
    }

    @Override
    public void delete(Game game) {
        gameDao.delete(game);
    }
}
