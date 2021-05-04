public class UserManager {
    public final void login(User user){
        System.out.println(user.getUserName()+"\thoşgeldiniz.");
    }

    public void logout(User user){
        System.out.println(user.getUserName()+"\tbaşarıyla çıkış yapıldı.");
    }
}
