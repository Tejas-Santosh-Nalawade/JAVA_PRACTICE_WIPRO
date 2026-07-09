package Inheritance;

import java.util.Scanner;

public class Person {

    String name;
    int age;

    Person() {

    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static class Student extends Person {

        int rollNo;
        String course;

//        Student() {
//            super();
//        }

        Student(String name, int age, int rollNo, String course) {

            super(name, age);

            this.rollNo = rollNo;
            this.course = course;
        }

        void display() {
            System.out.println("\nStudent Details");
            System.out.println("Name     : " + name);
            System.out.println("Age      : " + age);
            System.out.println("Roll No  : " + rollNo);
            System.out.println("Course   : " + course);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Age : ");
        int age = sc.nextInt();

        System.out.print("Enter Roll No : ");
        int rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Course : ");
        String course = sc.nextLine();

        Student s = new Student(name, age, rollNo, course);

        s.display();

        sc.close();
    }
}