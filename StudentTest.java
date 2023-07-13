import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create objects of students
        SecondaryStudent student1 = new SecondaryStudent(1);
        System.out.println("Enter details for Student 1:");
        System.out.print("First Name: ");
        student1.setFirstName(scanner.nextLine());
        System.out.print("Last Name: ");
        student1.setLastName(scanner.nextLine());
        System.out.print("Gender: ");
        student1.setGender(scanner.nextLine());
        System.out.print("Address: ");

        // Print student details
        System.out.println("\nStudent 1 Details:");
        student1.print();
    }
}
