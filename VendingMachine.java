package logicalPrograms;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        int amount = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount to check the notes ");
        amount = scan.nextInt();
        int notes;
        int rupees = 0;
        while (amount != 0) {
            if (amount >= 1000) {
                rupees = 1000;
            }
            if (amount >= 500 && amount < 1000) {
                rupees = 500;
            }
            if (amount >= 100 && amount < 500) {
                rupees = 100;
            }
            if (amount >= 50 && amount < 100) {
                rupees = 50;
            }
            if (amount >= 10 && amount < 50) {
                rupees = 10;
            }
            if (amount >= 5 && amount < 10) {
                rupees = 5;
            }
            if (amount >= 2 && amount < 5) {
                rupees = 2;
            }
            if (amount == 1 ) {
                rupees = 1;
            }
            notes = amount / rupees;
            System.out.println("Number of " + rupees
                    + " rupees notes required is " + notes);
            amount %= rupees;
        }
    }

}
