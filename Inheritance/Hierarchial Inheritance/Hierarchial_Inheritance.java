class Transport {
    private String vehicleId;
    private String energyType;
    private int currentSpeed;

    Transport(String vehicleId, String energyType, int currentSpeed) {
        this.vehicleId = vehicleId;
        this.energyType = energyType;
        this.currentSpeed = currentSpeed;
    }

    void move() {
        System.out.println(vehicleId + " is now moving!");
    }

    void halt() {
        System.out.println(vehicleId + " has stopped.");
    }

    void showBasicInfo() {
        System.out.println("Vehicle ID     : " + vehicleId);
        System.out.println("Energy Source  : " + energyType);
        System.out.println("Top Speed      : " + currentSpeed + " km/h");
    }
}

class PassengerBus extends Transport {
    private int passengerSeats;

    PassengerBus(String vehicleId, String energyType, int currentSpeed, int passengerSeats) {
        super(vehicleId, energyType, currentSpeed);
        this.passengerSeats = passengerSeats;
    }

    void showBusDetails() {
        showBasicInfo();
        System.out.println("Seating Capacity: " + passengerSeats + " passengers");
        System.out.println("===================");
    }
}

class CargoTruck extends Transport {
    private int maxCargoWeight;

    CargoTruck(String vehicleId, String energyType, int currentSpeed, int maxCargoWeight) {
        super(vehicleId, energyType, currentSpeed);
        this.maxCargoWeight = maxCargoWeight;
    }

    void showTruckDetails() {
        showBasicInfo();
        System.out.println("Max Load       : " + maxCargoWeight + " tonnes");
        System.out.println("===================");
    }
}

class DeliveryVan extends Transport {
    private boolean hasCooling;

    DeliveryVan(String vehicleId, String energyType, int currentSpeed, boolean hasCooling) {
        super(vehicleId, energyType, currentSpeed);
        this.hasCooling = hasCooling;
    }

    void showVanDetails() {
        showBasicInfo();
        System.out.println("Cooling System : " + (hasCooling ? "Yes" : "No"));
        System.out.println("===================");
    }
}

public class Hierarchial_Inheritance {
    public static void main(String[] args) {

        PassengerBus cityBus = new PassengerBus("TN11AB1234", "CNG", 85, 60);
        CargoTruck heavyTruck = new CargoTruck("TN12CD5678", "Diesel", 75, 18);
        DeliveryVan foodVan = new DeliveryVan("TN13EF9012", "Electric", 95, true);

        cityBus.move();
        cityBus.showBusDetails();

        heavyTruck.move();
        heavyTruck.showTruckDetails();

        foodVan.move();
        foodVan.showVanDetails();

        System.out.println("All vehicles can stop:");
        cityBus.halt();
        heavyTruck.halt();
        foodVan.halt();
    }
}