package domain;

public class Game {
    private long id;
    private String gameName;
    private String gameDescription;
    private int degreeOfDifficulty;
    private double salePrice;

    public Game() {
    }

    public Game(long id, String gameName, String gameDescription, int degreeOfDifficulty, double salePrice) {
        this.id = id;
        this.gameName = gameName;
        this.gameDescription = gameDescription;
        this.degreeOfDifficulty = degreeOfDifficulty;
        this.salePrice = salePrice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public int getDegreeOfDifficulty() {
        return degreeOfDifficulty;
    }

    public void setDegreeOfDifficulty(int degreeOfDifficulty) {
        this.degreeOfDifficulty = degreeOfDifficulty;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
}
