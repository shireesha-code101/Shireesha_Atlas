package day12_java;

import java.util.Scanner;

public class task002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 5- or 6-digit number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Temporary variable for processing
        int n = number;

        // Extract digits from right to left
        int units = n % 10;
        n /= 10;

        int tens = n % 10;
        n /= 10;

        int hundreds = n % 10;
        n /= 10;

        int thousands = n % 10;
        n /= 10;

        int tenThousands = n % 10;
        n /= 10;

        // The remaining part is considered as the lakhs digit
        int lakhs = n;

        // Display the results
        System.out.println("Units digit is " + units);
        System.out.println("Tens digit is " + tens);
        System.out.println("Hundreds digit is " + hundreds);
        System.out.println("Thousands digit is " + thousands);
        System.out.println("10 thousands digit is " + tenThousands);
        System.out.println("Lakhs digit is " + lakhs);
    }
}

