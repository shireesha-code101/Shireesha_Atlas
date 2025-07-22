package practice;

import java.util.Scanner;

//You’re building a Java program that categorizes users based on their age. If the user is below
//18, they’re considered a minor; if they’re between 18 and 60, they’re adults; and above 60,
//they’re senior citizens. The user’s age is input as a variable.
public class task004 {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("Enter your age");
        int ageis = age.nextInt();
        if (ageis < 18) {
            System.out.println("You are minor ");

        } else if (ageis <= 60 && ageis >= 18) {
            System.out.println("You adults ");
        } else {
            System.out.println("You are senior");
        }
    }
        }

