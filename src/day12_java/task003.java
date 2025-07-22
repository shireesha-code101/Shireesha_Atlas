package day12_java;

import java.util.Scanner;

public class task003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        int count = countDigits(number);

        System.out.println("It's a " + count + " digit number");
    }

    public static int countDigits(int num) {
        if (num == 0) return 1;

        num = Math.abs(num);
        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        return count;
    }
}

