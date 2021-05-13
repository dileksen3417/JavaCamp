package core.concretes;

import core.abstracts.SignUpService;
import entity.concretes.User;
import signUpServices.GoogleSignUpManager;

public class GoogleSignUpManagerAdapter implements SignUpService {
    @Override
    public boolean signUp(User user) {
        GoogleSignUpManager googleSignUpManager = new GoogleSignUpManager();
        return googleSignUpManager.signUpWithGoogle(user.getEmail());
    }
}
