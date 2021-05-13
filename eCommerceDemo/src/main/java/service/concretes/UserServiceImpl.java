package service.concretes;

import core.abstracts.EmailService;
import core.abstracts.SignUpService;
import core.concretes.Utils;
import dataAccess.abstracts.UserDao;
import entity.concretes.User;
import service.abstracts.UserService;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    private final EmailService emailService;
    private final SignUpService signUpService;

    public UserServiceImpl(UserDao userDao, EmailService emailService, SignUpService signUpService) {
        this.userDao = userDao;
        this.emailService = emailService;
        this.signUpService = signUpService;
    }

    @Override
    public User save(User user) {
        return userDao.add(user);
    }

    @Override
    public User update(User user) {
        return userDao.update(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public String signUp(User user) {
        if (!Utils.validatePassword(user.getPassword())) {
            return "Parola en az 6 karakterden oluşmalıdır.";
        } else if (!Utils.validateEmail(user.getEmail())) {
            return "Lütfen geçerli bir e-posta adresi giriniz.";
        } else if (emailExists(user.getEmail())) {
            return "Bu e-posta adresine tanımlı bir kullanıcı bulunmaktadır.";
        } else if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
            return "Kullanıcı adı ve parola en az 2 karakterden oluşmalıdır.";
        } else {
            emailService.sendEmail(user);
            if(clickOnTheVerificationLink(true)){
                save(user);
                return "Kullanıcı kaydı başarıyla tamamlandı.";
            } else {
                return "Lütfen doğrulama e-postasını onaylayınız.";
            }
        }
    }

    @Override
    public String signUpWithOtherService(User user) {
        if(signUpService.signUp(user)){
            save(user);
            return "Kayıt başarılı.";
        } else{
            return "Bir hata oluştu.";
        }
    }

    @Override
    public String login(User user) {
        if(user.getEmail().isEmpty() || user.getPassword().isEmpty()){
            return "Lütfen e-posta ve parola alanlarını doldurunuz.";
        } else {
            return "Sisteme hoşgeldiniz.";
        }
    }

    @Override
    public boolean emailExists(String email) {
        return userDao.findByEmail(email);
    }

    public boolean clickOnTheVerificationLink(boolean isClicked){
        if(isClicked){
            System.out.println("Doğrulama linkine tıklandı.");
        }
        return isClicked;
    }
}
