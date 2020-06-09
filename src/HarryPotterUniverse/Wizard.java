package HarryPotterUniverse;

import java.time.LocalDate;
import java.time.Period;

/**
 * Class for wizard Details
 * @author Mounika
 */
public class Wizard {
    /**
     * Attribute for wizard fullName
     */
    private String fullName;

    /**
     * Attribute for wizard gender
     */
    private String gender;

    /**
     * Attribute for wizard age
     */
    private int age;

    /**
     * Attribute for wizard date of birth
     */
    private LocalDate dateOfBirth;

    /**
     * Setter for wizard fullName
     * @param fullName - wizard fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Getter for wizard fullName
     * @return  - fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Setter for wizard age
     * @param age - Age
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * Getter for wizard age
     * @return Age
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter for wizard date of birth
     * @param dateOfBirth - date of birth
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Getter for wizard
     * @return - date of birth
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Setter for wizard gender
     * @param gender - gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Getter for wizard
     * @return - gender - gender
     */
    public String getGender() {
        return gender;
    }
}