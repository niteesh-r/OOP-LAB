public class DataTypes {
    public static void main(String[] args) {

        // Whole numbers
        byte age = 25;
        short year = 2025;
        int population = 1420000;
        long worldPopulation = 8100000000L;

        // Decimal numbers
        float temperature = 36.6f;
        double distance = 149.6;

        // Single character
        char grade = 'A';

        // True or false value
        boolean isWeekend = false;

        // Showing the values
        System.out.println("byte value      : " + age);
        System.out.println("short value     : " + year);
        System.out.println("int value       : " + population);
        System.out.println("long value      : " + worldPopulation);
        System.out.println("float value     : " + temperature);
        System.out.println("double value    : " + distance);
        System.out.println("char value      : " + grade);

        // Checking the boolean
        if (isWeekend) {
            System.out.println("boolean value   : It's weekend time!");
        } else {
            System.out.println("boolean value   : " + isWeekend + " (weekday today)");
        }
    }
}