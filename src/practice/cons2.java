package practice;

public class cons2 {
    String name;
    int age;

    public cons2(String n, int a) {
        name = n;
        age = a;
    }

    void show(){
        System.out.println("Inside cons2 – name: " + name + ", age: " + age);
    }

    public static void main(String[] args) {
        cons2 myobj = new cons2("siri", 4);
        myobj.show();
    }
}
