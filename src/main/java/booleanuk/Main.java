package booleanuk;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Human human = new Human();

        human.firstName = "Guybrush";
        human.lastName = "Threepwood";

        human.dateOfBirth = LocalDate.of(1989, 9, 01);

        // ----------------------------------------------------------------

        LocalDate today = LocalDate.now();
        int todayYear = today.getYear();

        int yearOfBirth = human.dateOfBirth.getYear();

        int humanAge = todayYear - yearOfBirth;

        // ----------------------------------------------------------------

        String fullName = human.firstName + " " + human.lastName;

        // ----------------------------------------------------------------

        System.out.println("\n-------------------------------------------");

        System.out.println("Human first name: " + human.firstName);
        System.out.println("Human last name: " + human.lastName);

        System.out.println("Human name: " + human.getFullName());

        System.out.println("Human date of birth: " + human.dateOfBirth);
        System.out.println("Human age (wrong way): " + humanAge);
        System.out.println("Human age (right way): " + human.getAge());

        System.out.println("\n-------------------------------------------");

        human.speak("Say something");
        human.goToWork();
        human.run();

        System.out.println("\n-------------------------------------------");

        Car car = new Car();

        car.color = "black";
        car.transmission = "manual";

        car.owner = human;

        String localOwnerFullName = car.owner.firstName + " " + car.owner.lastName;
        System.out.println("Owner full name (very wrong): " + localOwnerFullName);

        String carOwnerFullName = car.getWrongOwnerFullName();
        System.out.println("Owner full name (wrong): " + carOwnerFullName);

        String humanOwnerFullName = car.getOwnerFullName();
        System.out.println("Owner full name (correct): " + humanOwnerFullName);

        String humanOwnerGoodWay = car.owner.getFullName();

        System.out.println("\n-------------------------------------------");

    }
}
