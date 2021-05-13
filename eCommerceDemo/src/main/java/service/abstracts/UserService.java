package service.abstracts;

import entity.concretes.User;

public interface UserService {
    User save(User user);
    User update(User user);
    void delete(User user);
    String signUp(User user);
    String signUpWithOtherService(User user);
    String login(User user);
    boolean emailExists(String email);
    boolean clickOnTheVerificationLink(boolean isClicked);
}
