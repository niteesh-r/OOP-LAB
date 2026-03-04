class Instrument {
    String modelName;
    int yearMade;
    String material;

    Instrument(String modelName, int yearMade, String material) {
        this.modelName = modelName;
        this.yearMade = yearMade;
        this.material = material;
    }

    void play() {
        System.out.println(modelName + " is being played");
    }

    void tune() {
        System.out.println(modelName + " is being tuned");
    }

    void showDetails() {
        System.out.println("Model    : " + modelName);
        System.out.println("Year     : " + yearMade);
        System.out.println("Material : " + material);
    }
}

class StringInstrument extends Instrument {
    String stringType;

    StringInstrument(String modelName, int yearMade, String material, String stringType) {
        super(modelName, yearMade, material);
        this.stringType = stringType;
    }

    void strum() {
        System.out.println(modelName + " is being strummed");
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {

        StringInstrument guitar = new StringInstrument(
                "Fender Stratocaster", 
                2018, 
                "Alder body + Maple neck", 
                "Steel"
        );

        guitar.showDetails();
        guitar.play();
        guitar.strum();
        guitar.tune();
    }
}