package Inheritance;
import java.time.LocalDate;

class Person1 {
    private String name;
    private int age;
    private String gender;

    public Person1(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println("\n------------ Personal Information ------------");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + gender);
    }
}

class Doctor extends Person1 {

    private String specialization;
    private double salary;

    public Doctor(String name, int age, String gender, String specialization, double salary) {

        super(name, age, gender);
        this.specialization = specialization;
        this.salary = salary;
    }

    public void display() {

        System.out.println("\n------------ Doctor Role ------------");
        System.out.println(getName() + " specializes in " + specialization);
        System.out.println("Salary : $" + salary);

        System.out.println("Responsibilities:");
        System.out.println("- Diagnose illnesses.");
        System.out.println("- Prescribe medicines.");
        System.out.println("- Perform surgeries.");
    }
}
class Patient extends Person1 {

    private String disease;
    private LocalDate admissionDate;

    public Patient(String name, int age, String gender, String disease, LocalDate admissionDate) {

        super(name, age, gender);
        this.disease = disease;
        this.admissionDate = admissionDate;
    }

    public void display() {

        System.out.println("\n------------ Patient Role ------------");
        System.out.println(getName() + " (Age : " + getAge() + ")");
        System.out.println("Disease        : " + disease);
        System.out.println("Admission Date : " + admissionDate);

        System.out.println("Responsibilities:");
        System.out.println("- Follow doctor's instructions.");
        System.out.println("- Take medicines on time.");
        System.out.println("- Attend regular checkups.");
    }
}

class Nurse extends Person1 {

    private String shift;
    private String assignedWard;

    public Nurse(String name, int age, String gender, String shift, String assignedWard) {

        super(name, age, gender);
        this.shift = shift;
        this.assignedWard = assignedWard;
    }

    public void display() {

        System.out.println("\n------------ Nurse Role ------------");
        System.out.println(getName() + " is assigned to " + assignedWard);
        System.out.println("Shift : " + shift);

        System.out.println("Responsibilities:");
        System.out.println("- Monitor patients.");
        System.out.println("- Administer medicines.");
        System.out.println("- Maintain patient records.");
    }
}

public class Assignment2 {

    public static void main(String[] args) {
        Doctor d = new Doctor("Alice Smith",38,"Female","Cardiology",150000.00);
        Patient p = new Patient("Carla Garcia",67,"Female","Pneumonia",LocalDate.of(2025, 8, 12));
        Nurse n = new Nurse("Bob Jones",29,"Male","Night","ICU - Ward B");
        
        System.out.println("======== Hospital Role Demonstration ========");
        // Doctor
        d.info();
        d.display();

        // Patient
        p.info();
        p.display();

        // Nurse
        n.info();
        n.display();

        System.out.println("\n=============================================");
    }
}