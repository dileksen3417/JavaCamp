import core.concretes.EmailServiceImpl;
import core.concretes.GoogleSignUpManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import entity.concretes.User;
import service.abstracts.UserService;
import service.concretes.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Dilek", "Şen", "dileksen@gmail.com", "12345AD");

        UserService userService = new UserServiceImpl(new HibernateUserDao(), new EmailServiceImpl(), new GoogleSignUpManagerAdapter());
        System.out.println(userService.signUp(user));
        System.out.println(userService.signUpWithOtherService(user));
        System.out.println(userService.login(user));
    }
}
