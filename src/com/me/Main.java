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

    //step 6 create method more starting engine
    public String startEngine(){
        return "Car -> startEngine()";

    }

    //step 7 create method for accelerating
    public String accelerate(){
        return "Car -> accelerate()";

    }

    //step 8 create method for stopping
    public String brake(){
        return "Car -> brake()";
    }
//everything above is within base car class
}

//now create sub-classes to car base class
//step 9 sub-classes now
class Chevy extends Car {

    //no creation of fields
    //step 10 create constructor
    public Chevy(int cylinders, String name) {
        super(cylinders, name);
    }

    //step 11 override now, just chose the following 3
    @Override
    public String startEngine() {
        //return super.startEngine();       change to....
        return "Chevy -> startEngine()";

    }

    @Override
    public String accelerate() {
        //return super.accelerate();        changed to....
        return "Chevy -> accelerate()";
    }

    @Override
    public String brake() {
        //return super.brake();             changed to.....
        return "Chevy -> brake()";

        //step 12 test for car and chevy in main below
    }

//all of the above is within chevy sub-class
}

//step 14 creating another class, ford, copy and pasted chevy, the changed some inside
class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        //return "Ford -> startEngine()";
        //another way of getting above
        return getClass().getSimpleName() + " -> startEngine()";
        //get.Class is an automatic extension, hit control button a mouse over
        //get.Close

    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";

        //step 15 test these
    }
}

//step 16 creating another class, ford, copy and pasted chevy, the changed some inside
class VW extends Car {

    public VW(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        //return "VW -> startEngine()";
        //another way of getting above
        return getClass().getSimpleName() + " -> startEngine()";
        //get.Class is an automatic extension, hit control button a mouse over
        //get.Close

    }

    @Override
    public String accelerate() {
        return "VW -> accelerate()";
    }

    @Override
    public String brake() {
        return "VW -> brake()";

        //step 17 test these by running in main
    }
}



public class Main {

    public static void main(String[] args) {

        //step 12 testing for car
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        //result
                /*
                Car -> startEngine()
                Car -> accelerate()
                Car -> brake()
                */

        //step 13 testing for chevy
        Chevy chevy = new Chevy(6, "Chevette");
        System.out.println(chevy.startEngine());
        System.out.println(chevy.accelerate());
        System.out.println(chevy.brake());
        //results
                /*
                Chevy -> startEngine()
                Chevy -> accelerate()
                Chevy -> brake()
                */

         //now add another car-type Ford as a subclass to base car class, step 14

        //step 15 testing for ford
        Ford ford = new Ford(6, "Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        //results;
                /*
                Ford -> startEngine()
                Ford -> accelerate()
                Ford -> brake()
                */

          //now add another car-type VW as a subclass to base car class, step16

        //step 17 testing for ford
        VW vw = new VW (4, "Jetta");
        System.out.println(vw.startEngine());
        System.out.println(vw.accelerate());
        System.out.println(vw.brake());
        //results;
                /*
                VW -> startEngine()
                VW -> accelerate()
                VW -> brake()
                */

    }

}
