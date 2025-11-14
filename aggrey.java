
//This programm is written by MEDSON A. MSISKA (NCE/SCI/225/23)
import java.util.Scanner;

public class aggrey {
    public static void main(String[] args) {
        Scanner Medson = new Scanner(System.in);

        // prompt the user to enter four numbers

        System.out.println("Enter the four numbers: ");
        double a = Medson.nextDouble();

        double b = Medson.nextDouble();

        double c = Medson.nextDouble();

        double d = Medson.nextDouble();
        // calculatng the sum of four numbers
        double sum = a + b + c + d;

        // calculating the average of four numbers
        double average = sum / 4;

        System.out.println("The average of " + a + ", " + b + ", " + c + ", " + d + " is equal to " + average);

        Medson.close();

    }
}