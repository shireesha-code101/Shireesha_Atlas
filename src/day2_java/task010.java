package day2_java;

class task010 {
    public static void main(String args[]) {
        int intArray[] = {1, 2, 3};

        int cloneArray[] = intArray.clone();

        // will print false as shallow copy is created
        System.out.println(intArray == cloneArray);

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");
        }
    }
}
