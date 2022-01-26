import java.util.*;

public class Metric {

    public static void main (String args []){

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your desired conversion...\n");
        System.out.println("1. From Feet to Meters");
        System.out.println("2. From Pounds to Kgs");
        System.out.println("3. From Fahrenheit to Celsius");

        int option = sc.nextInt();

        if (option == 1){
            System.out.println("How many Feet: ");
            int u1 = sc.nextInt();
            System.out.println( "From " + (u1 + "ft") + "\nto " +(u1 * 0.305) + "m" + "\nQuantity: " + u1 );

        }
        else if (option == 2){
            System.out.println("How many Pounds: ");
            int u2 = sc.nextInt();
            System.out.println( "From " + (u2 + "lb") + "\nto " +(u2 * 0.454) + "kg" + "\nQuantity: " + u2 );
        }
        else if (option == 3){
            System.out.println("How many Fahrenheit: ");
            float u3 = sc.nextFloat();
            float sum = ((u3-32) * 5)/9;

            System.out.println( "From " + (u3 + "F") + "\nto " + sum + "C" + "\nQuantity: " + u3 );

        }
        else {
            System.out.println("Do you see that number? ");
        }


    }

}
