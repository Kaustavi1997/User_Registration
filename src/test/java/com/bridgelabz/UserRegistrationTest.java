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
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateLastName("Sen");
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateLastName("Se");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenLastName_WhenNotProperForUppercaseCharacter_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateLastName("sen");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateEmail("abc@yahoo.com");
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenEmail_WhenProperWithOptionalPart_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateEmail("abc-100@yahoo.com");
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenEmail_WhenNotProperForUppercaseCharacter_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateEmail("abc123@.com");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateMobileNo("91 4456830064");
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenMobileNo_WhenNotProperForCountryCode_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateMobileNo("7889898");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenMobileNo_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validateMobileNo("91 7889898");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePassword("abcdE$fgh9"); // This usecase is not running uc8
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenPassword_WhenNotProperFor8characters_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePassword("dcgv4");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenPassword_WhenNotProperForUppercase_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePassword("dcgvhty4");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenPassword_WhenNotProperForNumber_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validatePassword("dCgvhtyg");
        Assert.assertFalse(isValid);
    }
}
