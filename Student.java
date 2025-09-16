import java.util.Scanner;

public class Student {

    //Attributes
    private String Name;
    private int SSN;
    private float GPA;

    //Constructor
    public Student() {
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

    //toString Override for information display
    @Override
    public String toString(){

        return "Student: " + Name + "\nGPA: " + GPA;

    }

    //Accessors
    public String getName() {
        return Name;
    }

    public double getGPA() {
        return GPA;
    }

    //Mutator for SSN
    public void changeSSN() {
        // Convert int to string with leading zeros if necessary (to keep length consistent)
        String ssnStr = String.format("%09d", SSN);  // SSN typically 9 digits, adjust if needed

        if (ssnStr.length() > 4) {
            String last4 = ssnStr.substring(ssnStr.length() - 4);
            String masked = "*".repeat(ssnStr.length() - 4) + last4;
            System.out.println("SSN: " + masked);
        } else {
            System.out.println("Invalid SSN, must be longer than 4 digits");
        }
    }

    // Customized equals() comparing SSNs
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student other = (Student) obj;
        return this.SSN == other.SSN;
    }

    // Override hashCode when equals is overridden
    @Override
    public int hashCode() {
        return Integer.hashCode(SSN);
    }

}