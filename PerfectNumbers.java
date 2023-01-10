package logicalPrograms;

public class PerfectNumbers {
    public static void main(String[] args) {
        int number = 28;
        int sum  = 0;
         for (int i = 1; i < number; i++) {
             if (number % i == 0) {
                 sum = sum + i;
             }
        }
         if(number == sum)
        System.out.println("perfect number");

    }
}
