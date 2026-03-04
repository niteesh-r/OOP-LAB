public class DataOperations {
    public static void main(String[] args) {

        int num1 = 45;
        int num2 = 15;
        int num3 = 50;

        // Basic math operations
        System.out.println("Sum           : " + (num1 + num2));
        System.out.println("Difference    : " + (num1 - num2));
        System.out.println("Product       : " + (num1 * num2));
        System.out.println("Quotient      : " + (num1 / num2));
        System.out.println("Remainder     : " + (num1 % num2));

        // Changing value with unary operators
        System.out.println("\nStarting value of num3: " + num3);
        num3++;   // increment first
        System.out.println("After increment : " + num3);
        num3--;   // decrement back
        System.out.println("After decrement : " + num3);

        // Comparing numbers
        if (num1 > num2) {
            System.out.println("num1 is bigger than num2");
        }
        if (num1 >= num2) {
            System.out.println("num1 is bigger or equal to num2");
        }
        if (num1 < num2) {
            System.out.println("num1 is smaller than num2");
        }
        if (num1 <= num2) {
            System.out.println("num1 is smaller or equal to num2");
        }
        if (num1 == num2) {
            System.out.println("Both numbers are the same");
        }
        if (num1 != num2) {
            System.out.println("The numbers are different");
        }

        // True/False logic
        boolean isSunny = true;
        boolean isRaining = false;

        System.out.println("\nIs sunny AND raining?  " + (isSunny && isRaining));
        System.out.println("Is sunny OR raining?   " + (isSunny || isRaining));
        System.out.println("Not sunny?             " + (!isSunny));
    }
}