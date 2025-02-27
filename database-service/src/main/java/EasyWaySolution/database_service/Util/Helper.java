package EasyWaySolution.database_service.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {

    public static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
