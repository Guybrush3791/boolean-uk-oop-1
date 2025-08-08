package booleanuk;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Human {

    private String firstName;
    private String lastName;

    private LocalDate dateOfBirth;

    public Human(String firstName, String lastName, LocalDate dateOfBirth) {

        // this.firstName = firstName;
        setFirstName(firstName);
        // this.lastName = lastName;
        setLastName(lastName);
        // this.dateOfBirth = dateOfBirth;
        setDateOfBirth(dateOfBirth);
    }

    public String getFirstName() {

        return firstName;
    }
    public void setFirstName(String firstName) {

        // don't want empty string, blank string, less then 3 char(s) string
        if (checkString(firstName)) {

            this.firstName = "Default";

            return;
        }

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }
    public void setLastName(String lastName) {

        if (checkString(lastName)) {

            this.lastName = "Last Default";

            return;
        }

        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {


        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {

        // don't want future date, very past date

        this.dateOfBirth = dateOfBirth;
    }

    public String getFullName() {

        return firstName + " - " + lastName;
    }

    public int getAge() {

        LocalDate today = LocalDate.now();
        int todayYear = today.getYear();

        int yearOfBirth = dateOfBirth.getYear();

        return todayYear - yearOfBirth;
    }

    public void speak(String sentence) {

        System.out.println("Human said '" + sentence + "'");
    }

    public void goToWork() {

        System.out.println("Human goes to work");
    }

    public void run() {

        System.out.println("Human is running");
    }

    private boolean checkString(String str) {

        return str == null
                || str.isBlank()
                || str.length() <= 3;
    }
}
