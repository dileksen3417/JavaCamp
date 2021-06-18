package domain;

import domain.util.BodyInfoType;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "personel")
public class Personel {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    @Temporal(TemporalType.DATE)
    private Date birthOfDate;
    @ElementCollection
    @CollectionTable(
            name = "personnel_phone_number",
            joinColumns = {@JoinColumn(
                    name = "personel_id"
            )}
    )
    @Column(
            name = "phone_number",
            length = 11
    )
    private List<String> personelNumber = new ArrayList();
    @ElementCollection
    @CollectionTable(
            name = "personnel_address",
            joinColumns = {@JoinColumn(
                    name = "personnel_id"
            )}
    )
    @AttributeOverrides({@AttributeOverride(
            name = "street",
            column = @Column(
                    name = "sokak",
                    length = 50
            )
    ), @AttributeOverride(
            name = "district",
            column = @Column(
                    name = "mahalle",
                    length = 50
            )
    )})
    private List<Address> addressList = new ArrayList();
    @ElementCollection
    @CollectionTable(
            name = "personnel_body_size",
            joinColumns = {@JoinColumn(
                    name = "personel_id"
            )}
    )
    @Column(
            name = "value"
    )
    @MapKeyColumn(
            name = "info_type"
    )
    private Map<String, String> bodySize = new HashMap();
    @ElementCollection
    @CollectionTable(
            name = "personnel_body_info",
            joinColumns = {@JoinColumn(
                    name = "personnel_id"
            )}
    )
    @Column(
            name = "value"
    )
    @MapKeyColumn(
            name = "key"
    )
    @MapKeyEnumerated(EnumType.STRING)
    private Map<BodyInfoType, String> bodyInfo = new HashMap();
    @ElementCollection
    @CollectionTable(
            name = "personnel_email",
            joinColumns = {@JoinColumn(
                    name = "personnel_id"
            )}
    )
    @Column(
            name = "email"
    )
    private List<String> emails = new ArrayList();

    public Personel() {
    }

    public Personel(String firstName, String lastName, Date birthOfDate, List<String> personelNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfDate = birthOfDate;
        this.personelNumber = personelNumber;
    }

    public Personel(String firstName, String lastName, Date birthOfDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfDate = birthOfDate;
    }

    public void addBodyInfo(BodyInfoType bodyInfoType, String value) {
        this.bodyInfo.put(bodyInfoType, value);
    }

    public void addPhoneNumber(String number) {
        this.personelNumber.add(number);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthOfDate() {
        return this.birthOfDate;
    }

    public void setBirthOfDate(Date birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public List<String> getPersonelNumber() {
        return this.personelNumber;
    }

    public void setPersonelNumber(List<String> personelNumber) {
        this.personelNumber = personelNumber;
    }

    public List<Address> getAddressList() {
        return this.addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Map<String, String> getBodySize() {
        return this.bodySize;
    }

    public void setBodySize(Map<String, String> bodySize) {
        this.bodySize = bodySize;
    }

    public void addBodySize(String key, String value) {
        this.bodySize.put(key, value);
    }

    public Map<BodyInfoType, String> getBodyInfo() {
        return this.bodyInfo;
    }

    public void setBodyInfo(Map<BodyInfoType, String> bodyInfo) {
        this.bodyInfo = bodyInfo;
    }

    public List<String> getEmails() {
        return this.emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }
}
