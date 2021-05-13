package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entity.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    @Override
    public User add(User user) {
        System.out.println(user.getFirstName() + " sisteme eklendi.");
        return user;
    }

    @Override
    public User update(User user) {
        System.out.println(user.getFirstName() + " bilgileri güncellendi.");
        return user;
    }

    @Override
    public void delete(User user) {
        System.out.println("Kullanıcı sistemden silindi.");
    }

    @Override
    public boolean findByEmail(String email) {
        //demo code
        List<String> emails = new ArrayList<>();
        emails.add("dileks@gmail.com");
        emails.add("dsen@gmail.com");

        for (String e : emails) {
            if(e.equals(email)){
                return true;
            }
        }
        return false;
    }
}
