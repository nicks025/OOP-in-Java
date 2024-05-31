package constructor;

import java.util.Scanner;
public class Result {
    private int roll, age;
    private String name, address, faculty;
    private double totalmarks, percentage;

    public Result() {
        this.roll = 0;
        this.age = 0;
        this.name = "Student";
        this.address = "Address";
        this.faculty = "BCA";
        this.totalmarks = 0.0;
        this.percentage = 0.0;
    }

    public Result(int r, int ag) {
        this.roll = r;
        this.age = ag;
    }

    public Result(String n, String ad, String fac) {
        this.name = n;
        this.address = ad;
        this.faculty = fac;
    }

    public Result(double tm, double per) {
        this.totalmarks = tm;
        this.percentage = per;
    }

    public int getRoll() {
        return this.roll;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public double getTotalmarks() {
        return this.totalmarks;
    }

    public double getPercentage() {
        return this.percentage;
    }

    public static void main(String[] args) {
        //Using scanner as input
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Result result = new Result();

        //Display output
        System.out.println("Displaying from default");
        System.out.println("Roll=" + result.getRoll());
        System.out.println("Age=" + result.getAge());
        System.out.println("Name=" + result.getName());
        System.out.println("Address=" + result.getAddress());
        System.out.println("Faculty=" + result.getFaculty());
        System.out.println("Total marks=" + result.getTotalmarks());
        System.out.println("Percentage=" + result.getPercentage());
        System.out.println(" ");


        Result result1 = new Result(2, 19);
        Result result2 = new Result("Nikhil", "Sesmati", "BCA");
        Result result3 = new Result(99.00, 99.00);

        //Input from parameter

        System.out.println("Displaying parameterized value");
        System.out.println("Roll=" + result1.getRoll());
        System.out.println("Age=" + result1.getAge());
        System.out.println("Name=" + result2.getName());
        System.out.println("Address=" + result2.getAddress());
        System.out.println("Faculty=" + result2.getFaculty());
        System.out.println("Total marks=" + result3.getTotalmarks());
        System.out.println("Percentage=" + result3.getPercentage());

        Result result4 = new Result();
        //Input from user
        System.out.println("Enter roll:");
        result4.roll = scanner1.nextInt();
        System.out.println("Enter age:");
        result4.age = scanner1.nextInt();
        System.out.println("Enter name:");
        result4.name = scanner1.next();
        System.out.println("Enter address:");
        result4.address = scanner1.next();
        System.out.println("Enter faculty:");
        result4.faculty = scanner1.next();
        System.out.println("Enter total marks:");
        result4.totalmarks = scanner1.nextDouble();
        System.out.println("Enter percentage:");
        result4.percentage = scanner1.nextDouble();

        System.out.println("Displaying parameterized value");
        System.out.println("Roll=" + result4.getRoll());
        System.out.println("Age=" + result4.getAge());
        System.out.println("Name=" + result4.getName());
        System.out.println("Address=" + result4.getAddress());
        System.out.println("Faculty=" + result4.getFaculty());
        System.out.println("Total marks=" + result4.getTotalmarks());
        System.out.println("Percentage=" + result4.getPercentage());
    }
}
