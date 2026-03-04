class MotorVehicle {
    String idNumber;
    String powerSource;
    int maxSpeed;

    MotorVehicle(String idNumber, String powerSource, int maxSpeed) {
        this.idNumber = idNumber;
        this.powerSource = powerSource;
        this.maxSpeed = maxSpeed;
    }

    void beginJourney() {
        System.out.println(idNumber + " has started moving.");
    }

    void endJourney() {
        System.out.println(idNumber + " has come to a stop.");
    }
}

class Sedan extends MotorVehicle {
    int passengerCapacity;

    Sedan(String idNumber, String powerSource, int maxSpeed, int passengerCapacity) {
        super(idNumber, powerSource, maxSpeed);
        this.passengerCapacity = passengerCapacity;
    }

    void showSedanInfo() {
        System.out.println("Registration     : " + idNumber);
        System.out.println("Passenger seats  : " + passengerCapacity);
    }
}

class BMW extends Sedan {
    int electricRange;

    BMW(String idNumber, String powerSource, int maxSpeed,
        int passengerCapacity, int electricRange) {
        super(idNumber, powerSource, maxSpeed, passengerCapacity);
        this.electricRange = electricRange;
    }

    void recharge() {
        System.out.println("Recharging the battery — range: " + electricRange + " km");
    }

    void showBMWDetails() {
        showSedanInfo();
        System.out.println("Electric range   : " + electricRange + " km");
        System.out.println("--------------------");
    }
}

public class Hybrid_Inheritance {
    public static void main(String[] args) {

        BMW luxuryCar = new BMW("MH05XY7890", "Hybrid", 220, 5, 65);

        luxuryCar.beginJourney();
        luxuryCar.showBMWDetails();
        luxuryCar.recharge();
        luxuryCar.endJourney();
    }
}