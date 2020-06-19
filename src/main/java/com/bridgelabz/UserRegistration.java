package com.bridgelabz;
import java.util.regex.Pattern;
import java.util.*;


public class UserRegistration {
    public static final String FIRST_NAME_REGEX = "^[A-Z]{1}[A-Za-z]{2,}$";
    public static final String LAST_NAME_REGEX = "^[A-Z]{1}[A-Za-z]{2,}$";
    public static final String EMAIL_REGEX1 = "^[a-z0-9]+([._+-][0-9a-z]+)@+[a-z0-9]+.[a-z]{2,4}([.][a-z]{2}$)";
    public static final String EMAIL_REGEX2 = "^[a-z0-9]+([._+-][0-9a-z]+)@+[a-z0-9]+.[a-z]{2,4}$";
    public static final String EMAIL_REGEX3 = "(^[a-z0-9]+)@+[a-z0-9]+.[a-z]{2,4}([.][a-z]{2}$)";
    public static final String EMAIL_REGEX4 = "(^[a-z0-9]+)@+[a-z0-9]+.[a-z]{2,4}$";
    public static final String MOBILE_NO_REGEX = "^+[1-9]{2}[: :][0-9]{10}$";
    public static final String PASSWORD_REGEX = "^(?=.*\\d)(?=.*?[A-Z])(?=.*?[0-9])[A-Za-z0-9]{8,}$";//(?=.*?[!@#$%^&*]{1}),(?=.*[@$!%*#?&])

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
        return pattern.matcher(firstName).matches();
    }


    public boolean validateLastName(String lastname) {
        Pattern pattern = Pattern.compile(LAST_NAME_REGEX);
        return pattern.matcher(lastname).matches();
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX1);
        Pattern pattern1 = Pattern.compile(EMAIL_REGEX2);
        Pattern pattern2 = Pattern.compile(EMAIL_REGEX3);
        Pattern pattern3 = Pattern.compile(EMAIL_REGEX4);
        if (pattern.matcher(email).matches() || pattern1.matcher(email).matches() ||
                pattern2.matcher(email).matches() || pattern3.matcher(email).matches() )
            return true;
        return false;
    }

    public boolean validateMobileNo(String mobileNo) {
        Pattern pattern = Pattern.compile(MOBILE_NO_REGEX);
        return pattern.matcher(mobileNo).matches();
    }

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        return pattern.matcher(password).matches();
    }


}


