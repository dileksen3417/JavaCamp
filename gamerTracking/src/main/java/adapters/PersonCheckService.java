package adapters;

public class PersonCheckService implements PersonCheckServices{
    public boolean isPersonReal(String nationalityId, String name, String surname, int year){
        return nationalityId.length() == 11 && !name.isEmpty() && !surname.isEmpty() && year>1900;
    }
}
