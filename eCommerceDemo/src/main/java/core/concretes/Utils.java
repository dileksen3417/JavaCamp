package core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static boolean validatePassword(String password) {
        return password != null && !password.isEmpty() && password.length() >= 7;
    }

    public static boolean validateEmail(String email) {
        String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";

        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
