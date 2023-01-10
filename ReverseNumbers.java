package logicalPrograms;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = scanner.nextInt();
        int reverse = 0;
//        for (int i = 1; i <= number - 1; i++){
//
//            int remender = number % 10;
//            reverse = reverse * 10 + remender;
//            number = number / 10;
//        }
//        System.out.println(reverse);

        while (number != 0){
            int remender = number % 10;
            reverse = reverse * 10 + remender;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}
