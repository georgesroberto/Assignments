// SecondaryStudent.java
public class SecondaryStudent extends Student {

    public SecondaryStudent(int admissionNumber) {
        super(admissionNumber);
    }

    @Override
    public void print() {
        System.out.println("Admission Number: " + getAdmissionNumber());
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Gender: " + getGender());
        System.out.println("Address: " + getAddress());
    }
}

