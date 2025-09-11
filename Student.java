import java.util.Scanner;

public class Student{

    private String Name = "Dicky";
    private int SSN = 123456789;
    private double GPA = 4.0;

    public String getname() {

        return Name;

    }

    public String changeName(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        Name = scanner.nextLine();
        return Name;

    }

    public int getSSN(){

        return SSN;

    }

    public double getGPA(){

        return GPA;

    }
    //Mutator for SSN
    //Includes its own requesting code for SSN, maybe keep or continue to use the other one
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
