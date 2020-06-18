package bridgelabz;

import java.util.regex.Pattern;

public class Email {
    public static final String EMAIL_REGEX1 = "^[a-z0-9]+([._+-][0-9a-z]+)@+[a-z0-9]+.[a-z]{2,4}([.][a-z]{2}$)";
    public static final String EMAIL_REGEX2 = "^[a-z0-9]+([._+-][0-9a-z]+)@+[a-z0-9]+.[a-z]{2,4}$";
    public static final String EMAIL_REGEX3 = "(^[a-z0-9]+)@+[a-z0-9]+.[a-z]{2,4}([.][a-z]{2}$)";
    public static final String EMAIL_REGEX4 = "(^[a-z0-9]+)@+[a-z0-9]+.[a-z]{2,4}$";
    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX1);
        Pattern pattern1 = Pattern.compile(EMAIL_REGEX2);
        Pattern pattern2 = Pattern.compile(EMAIL_REGEX3);
        Pattern pattern3 = Pattern.compile(EMAIL_REGEX4);
        boolean result;
        if (pattern.matcher(email).matches() || pattern1.matcher(email).matches() ||
                pattern2.matcher(email).matches() || pattern3.matcher(email).matches() )
            result = true;
        else
            result = false;
        return result;
    }

}
