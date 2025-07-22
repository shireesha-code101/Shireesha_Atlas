package practice;

public class constructor {
    int age;
    String name;
    public constructor() {
        name = "siri";
        age = 18;
    }
    void show(){
        System.out.println("You are minor " + age);
}
    public static void main(String[] args) {
        constructor object = new constructor();
        object.show();
    }
}
