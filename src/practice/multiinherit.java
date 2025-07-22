package practice;


interface first {
void first1();
}
interface second {
    void second1();

 }
 class school implements first,second {
    public void first1() {
        System.out.println("eat");

    }
    public void second1() {
        System.out.println("sleep");
    }

 }
public class multiinherit {
    public static void main(String[] args) {
        school s = new school();
        s.first1();
        s.second1();


    }
}
