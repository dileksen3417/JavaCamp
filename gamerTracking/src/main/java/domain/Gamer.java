package domain;

import java.util.Date;

public class Gamer {
    private long id;
    private String nationalityId;
    private String firstName;
    private String lastName;
    private int year;
    private String userName;

    public Gamer(long id, String nationalityId, String firstName, String lastName, int year, String userName) {
        this.id = id;
        this.nationalityId = nationalityId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.userName = userName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
