class Car {
    //Atrributes
    String make;
    String model;
    int year;

    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);  //Print all the atrributes
    }
}

public class CarDemo {
    public static void main(String[] args) {
        //Creating an object for Car class
        Car myCar = new Car();
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

        myCar.displayInfo();
        
    }
}