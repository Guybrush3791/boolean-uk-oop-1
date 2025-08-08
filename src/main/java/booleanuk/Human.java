package booleanuk;

import java.time.LocalDate;

public class Human {

    String firstName;
    String lastName;

    LocalDate dateOfBirth;

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
}
