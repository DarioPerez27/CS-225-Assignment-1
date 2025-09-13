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

        //Getting GPA
        System.out.println("Please enter a GPA: ");
        this.GPA = Float.parseFloat(scanner.nextLine());
    }

    //Accessors
    public String getname() {return Name;}
    public int getSSN(){return SSN;}
    public double getGPA(){return GPA;}

    //Mutator for SSN
    //Includes its own requesting code for SSN, maybe keep or continue to use the other one
    //We'll need to change the conditions for this because when the student class is called in the first place you input an SSN so we just need to make it so when it displays the SSN it uses the * stuff
    //Basically what we need we just need to change the first few lines
    public String changeSSN() {
        Scanner scanner = new scanner(System.in);
        System.out.println("Enter SSN: ");
        String input = scanner.nextLine();

        if (input.length() > 4) {
            String last4 = input.substring(input.length() - 4);
            String masked = "*".repeat(input.length() -4) + last4;
            try {
                SSN = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid")
            }
            return masked;
        } else {
            System.out.println("Invalid SSN, must be longer than4 digits");
            return null;

}
    //toString

    //equals()
}
