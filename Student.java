import java.util.Scanner;

public class Student{

    private String Name = "Dicky";
    private int SSN = 123456789;
    private double GPA = 4.0;

    public String getname() {

        return Name;

    }
    //Push test
    public String changeName(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        Name = scanner.nextLine();
        return Name;

    }

    public int getSSN(){
        System.out.println("Enter social security number: ");
        SSN = scanner.nextLine();
        return SSN;

    }

    public double getGPA(){
        System.out.println("Enter current GPA: ");
        GPA = scanner.nextLine();
        return GPA;

    }

}
//git push test
