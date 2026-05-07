// 1. creating abstract class Vehicle with data members String brand and int speed 
//Also constructor to initialize these fields
//Abstract method: abstract void displayDetails();
//concrete methods: void startEngine()-> Prints: "Engine started for <brand>"

abstract class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    abstract void displayDetails();

    void startEngine() {
        System.out.println("Engine started for " + brand);
    }
}
// 2. Derived Class: Car
    //Inherit from Vehicle
    //Additional data members: int numDoors
    //Implement
    //a constructor
    //b override displayDetails()
    //Print
    //Car Brand :<brand>
    //Speed : <speed>
    //Number of Doors :<numDoors>
class Car extends Vehicle {
    int numDoors;

    public Car(String brand, int speed, int numDoors) {
        super(brand, speed);
        this.numDoors = numDoors;
    }

    @Override
    void displayDetails() {
        System.out.println("Car Brand :" + brand);
        System.out.println("Speed : " + speed);
        System.out.println("Number of Doors :" + numDoors);
    }
}

//3. Derived Class: Bike
//  Inherit from Vehicle
//  Additional data members:
// a boolean hasGear
// implement :
// Constructor
// override displayDetails() that will print
//Bike Brand: <brand>
//Speed: <speed>
//Has Gear : <true/false>
class Bike extends Vehicle {
    boolean hasGear;

    public Bike(String brand, int speed, boolean hasGear) {
        super(brand, speed);
        this.hasGear = hasGear;
    }

    @Override
    void displayDetails() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Has Gear : " + hasGear);
    }
}

//4. Main Class
// Create objects of both Car and Bike
//Store them in a vehicle reference array
//For Each vehicle:
// call startEngine() 
// call displayDetails()
class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 120, 4);
        Vehicle bike = new Bike("Yamaha", 80, true);

        Vehicle[] vehicles = {car, bike};

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayDetails();
        }
    }
}
