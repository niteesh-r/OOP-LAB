public class Vehicle {
    public boolean hasEngine;     
    protected int fuelCapacity;       
    private final String modelYear;    
    Vehicle() {
        hasEngine = true;
        fuelCapacity = 50; 
        modelYear = "2023";
    }

    public void displayEngineStatus() {
        System.out.println("This vehicle has an engine running: " + hasEngine);
    }

    protected void showFuelDetails() {
        System.out.println("Fuel tank capacity: " + fuelCapacity + " liters");
    }

    public String getModelYear() {
        return modelYear;
    }
}