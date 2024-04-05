public class TemperatureConverter {
 public static double celsiusToFahrenheit (double celsius)
 {
 return (celsius * 9 / 5) + 32;
 }
 public static double fahrenheitToCelsius (double fahrenheit)
 {
 return (fahrenheit - 32) * 5 / 9;
 }
 public static void main (String [] args)
 {
 double celsiusTemperature = 0.0;
 double fahrenheitTemperature = 98.0;
 double convertedToFahrenheit = celsiusToFahrenheit(celsiusTemperature);
 System.out.println(celsiusTemperature + " Celsius is equal to " + convertedToFahrenheit + "Fahrenheit");
 double convertedToCelsius = fahrenheitToCelsius(fahrenheitTemperature);
 System.out.println(fahrenheitTemperature + " Fahrenheit is equal to " + convertedToCelsius + "Celsius");
 }

}