

import java.util.Scanner;

public class TaxCollector {
    public static void main(String[]args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("what is the order amount");
        double amount = sc.nextDouble();

        System.out.println("what state is the order in?");
        String state = sc.nextLine();
        System.out.print("The subtotal is $"+amount);

        if (state.toLowerCase().equals("wi")) {
            double tax = amount * 0.055;
            System.out.print("\nThe Tax is $"+ tax);
            amount = amount + tax;
            System.out.print("\nThe total is $"+ amount);
        }


    }

}
