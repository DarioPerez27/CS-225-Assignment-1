public class Main {

    public static void main(String[] args) {

        System.out.println("Enter details for Student 1:");
        Student student1 = new Student();
        System.out.println(student1);
        student1.changeSSN();

        System.out.println("\nEnter details for Student 2:");
        Student student2 = new Student();
        System.out.println(student2);
        student2.changeSSN();

        // Use equals() to compare SSNs
        if (student1.equals(student2)) {
            System.out.println("\nBoth students have the SAME SSN.");
        } else {
            System.out.println("\nThe students have DIFFERENT SSNs.");
        }
    }
}
