
package celcius2fahrenheit;

import java.util.Scanner;

/**
 *
 * @author Jordan Baker
 * 
 */
public class Celcius2Fahrenheit {

   
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a temperature in degrees Celcius : ");
        double temp = input.nextDouble();
        double conversion = (temp * 9/5) + 32;
        System.out.printf("% .1f C = % .1f F", temp, conversion);
    
    }
}
