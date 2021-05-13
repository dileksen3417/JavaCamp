package core.concretes;

import core.abstracts.EmailService;
import entity.concretes.User;

public class EmailServiceImpl implements EmailService {
    @Override
    public void sendEmail(User user) {
        //email gönderme işlemleri....
        System.out.println(user.getFirstName() + " kullanıcısına e-mail gönderildi.");
    }
}
