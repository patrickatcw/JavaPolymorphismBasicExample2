package com.me;
//directions
/*
- create a base class called car
- it should have a few fields that would be appropriate for a generic
car class; engine, cylinders, wheels, etc.
- constructor should initialize # of cylinders and name, and set wheels to 4
and engine to true. cylinders and names would be passed parameters
- create appropriate getters
- create some methods like startEngine, accelerate, and brake; show a
message for each in the base class
- now create 3 sub classes for your favorite vehicles
- override the appropriate methods to demonstrate polymorphism in use
- put all classes in the one java file, like this one we are in now!
 */

//step 1 create Car class
class Car {

    //step 2 create fields
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    //step 3 create constructor, only doing cylinders and name,
    // then set values manually for wheels and engine
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        //step 4 set values for the following we did not put in constructor
        this.wheels = 4;
        this.engine = true;

    }

    //step 5, create getters for cylinders and name
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

}


public class Main {

    public static void main(String[] args) {

    }

}
