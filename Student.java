import java.util.Scanner;

public class Student{

    //Attributes
    private String Name;
    private int SSN;
    private float GPA;

    //Constructor
    public Student(){
        //Getting Name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        this.Name = scanner.nextLine();

        //Getting SSN
        System.out.println("Please enter a SSN: ");
        this.SSN = Integer.parseInt(scanner.nextLine());


    public int getSSN(){
        System.out.println("Enter social security number: ");
        SSN = scanner.nextLine();
        return SSN;

        //Getting GPA
        System.out.println("Please enter a GPA: ");
        this.GPA = Float.parseFloat(scanner.nextLine());
    }

    //Accessors
    public String getname() {return Name;}
    public int getSSN(){return SSN;}
    public double getGPA(){return GPA;}

    //Mutators
    public String changeSSN(){

    public double getGPA(){
        System.out.println("Enter current GPA: ");
        GPA = scanner.nextLine();
        return GPA;


    }
    //toString

    //equals()