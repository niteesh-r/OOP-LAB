public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle genericVehicle = new Vehicle();
        Car myCar = new Car();

        System.out.println("Vehicle has engine? " + genericVehicle.hasEngine);

        genericVehicle.displayEngineStatus();
        genericVehicle.showFuelDetails();
        System.out.println("Model year: " + genericVehicle.getModelYear());

        System.out.println("\n--- Now from the Car ---");
        myCar.honk();

        myCar.displayEngineStatus();
    }
}