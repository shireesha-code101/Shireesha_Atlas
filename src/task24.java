class student{
    public String name;
    student(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}

public class task24 {
    public static void main(String[] args) {

        // declares an Array and initializing the
        // elements of the array
        student[] mystudents = new student[]{
                new student("Dharma"), new student("sanvi"),
                new student("Rupa"), new student("Ajay")
        };
        // accessing the elements of the specified array
        for (student m : mystudents) {
            System.out.println(m);
        }
    }
}
