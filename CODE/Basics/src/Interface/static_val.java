package Interface;

class Employee {
    static String companyName = "Google";
    String employeeName;
    Employee(String employeeName) {
        this.employeeName = employeeName;
    }
    void display() {
        System.out.println("Company Name : " + companyName);
        System.out.println("Employee Name: " + employeeName);
        System.out.println();
    }
}

class AreaCalculator {
    static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }


    static double areaOfRectangle(double length, double width) {
        return length * width;
    }
}

public class static_val {

    public static void main(String[] args) {
        Employee e1 = new Employee("Tejas");
        Employee e2 = new Employee("Rahul");

        System.out.println("Employee Details");
        e1.display();
        e2.display();

        // Area calculations
        double circleArea = AreaCalculator.areaOfCircle(7);
        double rectangleArea = AreaCalculator.areaOfRectangle(10, 5);

        System.out.println("Area of Circle = " + circleArea);
        System.out.println("Area of Rectangle = " + rectangleArea);
    }
}