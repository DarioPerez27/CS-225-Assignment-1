public class Main {

    public static void main(String[] args) {

        System.out.println("Enter details for Student 1:");
        Student student1 = new Student();

        System.out.println("\nEnter details for Student 2:");
        Student student2 = new Student();

        System.out.println("\nStudent 1:");
        System.out.println("Name: " + student1.getName());
        System.out.println("GPA: " + student1.getGPA());
        student1.changeSSN();

        System.out.println("\nStudent 2:");
        System.out.println("Name: " + student2.getName());
        System.out.println("GPA: " + student2.getGPA());
        student2.changeSSN();

        // Use equals() to compare SSNs
        if (student1.equals(student2)) {
            System.out.println("\nBoth students have the SAME SSN.");
        } else {
            System.out.println("\nThe students have DIFFERENT SSNs.");
        }
    }
}
