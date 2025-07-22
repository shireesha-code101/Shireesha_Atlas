package practice;

class teacher1{
    void teach(){
        System.out.println("teacher1");
    }
}

class teacher2 extends teacher1{
    void teach2(){
        System.out.println("teacher2");

    }
}

class teacher3 extends teacher1{
    void teach3(){
        System.out.println("teacher3");
    }
}


public class hireinherit {
    public static void main(String[] args) {
        teacher1 t = new teacher1();
        t.teach();
        t.teach();
        t.teach();
    }
}
