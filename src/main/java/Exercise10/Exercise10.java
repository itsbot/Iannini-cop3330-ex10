/*
 *  UCF COP3330 Fall 2021 Exercise 10 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise10;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of item 1: ");
        double price1 = Double.parseDouble(sc.next());
        System.out.println("Enter the quantity of item 1: ");
        int quantity1 = sc.nextInt();

        System.out.println("Enter the price of item 2: ");
        double price2 = Double.parseDouble(sc.next());
        System.out.println("Enter the quantity of item 2: ");
        int quantity2 = sc.nextInt();

        System.out.println("Enter the price of item 3: ");
        double price3 = Double.parseDouble(sc.next());
        System.out.println("Enter the quantity of item 3: ");
        int quantity3 = sc.nextInt();

        DecimalFormat df = new DecimalFormat("#.00");
        double subtotal = (price1*quantity1)+(price2*quantity2)+(price3*quantity3);
        double taxRate = 0.055;
        double tax = subtotal*taxRate;
        double total = subtotal+tax;

        System.out.println("Subtotal: $"+df.format(subtotal)+"\nTax: $"+df.format(tax)+"\nTotal: $"+df.format(total));

    }
}
