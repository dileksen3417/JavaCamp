package signUpServices;

public class GoogleSignUpManager {
    public boolean signUpWithGoogle(String email) {
        if (email.isEmpty()) {
            return false;
        } else {
            System.out.println("Google ile üye olundu.");
            return true;
        }
    }
}
