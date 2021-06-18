package domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="personel")
public class Personel {

    @Id
    @Column(name="id")
    private int id;
    private String firstName;

    private String lastName;

    @Column(name = "birth_of_day", updatable = false) //update edilemez
    @Temporal(TemporalType.DATE)
    //date:sadece tarih//01/01/2021  time:sadece saat;16:20.04, timestamp: hem tarih hem zaman tutar
    private Date birthOfDate;

    @Column(name= "personel_number", nullable = false, length = 10, unique = true)
    private String personelNumber;

    @Lob //buraya uzun bir veri gelebilir demek 2 3 satır uzunluğunda hakkında yazısı..
    private String about;

    @Transient //dbde kolon olarak gözükmesin
    private double salary;

    public Personel() {
    }

    public Personel(int id, String firstName, String lastName, Date birthOfDate, String personelNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfDate = birthOfDate;
        this.personelNumber = personelNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(Date birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public String getPersonelNumber() {
        return personelNumber;
    }

    public void setPersonelNumber(String personelNumber) {
        this.personelNumber = personelNumber;
    }
}
