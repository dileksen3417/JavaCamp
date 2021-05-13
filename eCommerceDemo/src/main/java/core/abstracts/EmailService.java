package core.abstracts;

import entity.concretes.User;

public interface EmailService {
    void sendEmail(User user);
}
