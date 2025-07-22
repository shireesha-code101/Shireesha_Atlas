package practice;

class Animal {
    void eat(){
        System.out.println("Animal eats");
    }
    void sleep(){
        System.out.println("Animal sleeps");

    }

}
class dog  extends Animal {
    void bark(){
        System.out.println("Dog bark");
    }
    void swim(){
        System.out.println("Dog swims");
    }
}

public class inherit1{

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.sleep();
        dog b = new dog();
        b.bark();
        b.swim();
    }
}

