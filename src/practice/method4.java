package practice;

public class method4 {

    static void checkAge(int age) {
        if (age < 18) {
            System.out.print("young");
        } else if (age < 60) {
            System.out.print("adult");
        } else {
            System.out.print("older");
        }
    }

    public static void main(String[] args) {
        checkAge(70);
        System.out.println();
        checkAge(18);
    }
}
