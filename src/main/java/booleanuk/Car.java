package booleanuk;

public class Car {

    String color;
    String transmission;

    Human owner;

    public void accelerate() {

        System.out.println("I'm going fast");
    }
    public void brake() {

        System.out.println("I'm going slow");
    }
    public void turnLeft() {

        System.out.println("I'm going left");
    }
    public void turnRight() {

        System.out.println("I'm going right");
    }

    public String getWrongOwnerFullName() {

        return owner.firstName + " " + owner.lastName;
    }

    public String getOwnerFullName() {

        return owner.getFullName();
    }
}
