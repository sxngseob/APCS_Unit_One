public class TemperatureConversion {

    public static void main(String[] args) {

        // Create a variable of the appropriate type and initialize to to 78 degrees
        int fahrenheit;
        double celsius;
        fahrenheit = 78;
        // Create a second variable and write an expression to convert the value above to Celsius
        //(78°F − 32) × 5/9 = 25.556°C

        celsius = ((fahrenheit) - 32) * (5.0 / 9.0);

        // Display the results to the user:
        //78 degrees Fahrenheit is 25.555555555555557 degrees Celsius

        System.out.println((fahrenheit) + " degrees Fahrenheit is " + (celsius) + " degrees Celsius");

        // ex. 212 degrees F is 100 degrees C


    }
}