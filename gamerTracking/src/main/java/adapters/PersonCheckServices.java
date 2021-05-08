package adapters;

public interface PersonCheckServices {
    boolean isPersonReal(String nationalityId, String name, String surname, int date);
}
