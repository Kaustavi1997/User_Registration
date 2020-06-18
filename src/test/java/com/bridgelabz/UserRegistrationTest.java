package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateFirstName("Kaustavi");
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateFirstName("Ka");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenFirstName_WhenNotProperForUppercaseCharacter_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateFirstName("kaustavi");
        Assert.assertFalse(isValid);
    }
}