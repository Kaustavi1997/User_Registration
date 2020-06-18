package com.bridgelabz;
import java.util.regex.Pattern;
import java.util.*;


public class UserRegistration {
    public static final String FIRST_NAME_REGEX = "^[A-Z]{1}[A-Za-z]{2,}$";
    public boolean validateFirstName(String firstName) {
            Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
            return pattern.matcher(firstName).matches();
    }

    public static final String LAST_NAME_REGEX = "^[A-Z]{1}[A-Za-z]{2,}$";
    public boolean validateLastName(String lastname) {
        Pattern pattern1 = Pattern.compile(LAST_NAME_REGEX);
        return pattern1.matcher(lastname).matches();
    }
}


