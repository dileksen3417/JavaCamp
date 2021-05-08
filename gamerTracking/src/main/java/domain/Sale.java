package domain;

public class Sale {
    private long id;
    private String saleNumber;
    private String gameName;
    private String gamerName;
    private String campaignName;
    private double price;

    public Sale(long id, String saleNumber, String gameName, String gamerName, double price) {
        this.id = id;
        this.saleNumber = saleNumber;
        this.gameName = gameName;
        this.gamerName = gamerName;
        this.price = price;
    }

    public Sale(long id, String saleNumber, String gameName,String gamerName, String campaignName, double price) {
        this.id = id;
        this.saleNumber = saleNumber;
        this.gameName = gameName;
        this.gamerName = gamerName;
        this.campaignName = campaignName;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(String saleNumber) {
        this.saleNumber = saleNumber;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGamerName() {
        return gamerName;
    }

    public void setGamerName(String gamerName) {
        this.gamerName = gamerName;
    }
}
