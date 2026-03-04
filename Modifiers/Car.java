public class Car extends Vehicle {

    public void honk() {
        System.out.println("The car honks: Beep beep!");
        System.out.println("Engine is on: " + hasEngine);
        System.out.println("Fuel capacity is " + fuelCapacity + " liters");
        // System.out.println(modelYear);  // ← private, can't access directly
    }
}