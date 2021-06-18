package domain;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String city;
    private String district;
    private String street;
    private int postalCode;

    public Address() {
    }

    public Address(String city, String district, String street, int postalCode) {
        this.city = city;
        this.district = district;
        this.street = street;
        this.postalCode = postalCode;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}
