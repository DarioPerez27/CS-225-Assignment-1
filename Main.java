public class Main{

    public static void main(String[] args){

        Student student1 = new Student();

        System.out.println(student1.getname());
        System.out.println(student1.getGPA());
        student1.changeSSN();
        System.out.println(student1.getSSN());

    }
}