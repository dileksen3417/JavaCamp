package dataAccess.abstracts;

import entity.concretes.User;

public interface UserDao {
    User add(User user);
    User update(User user);
    void delete(User user);
    boolean findByEmail(String email);
}
