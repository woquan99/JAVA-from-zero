package week2;

import java.time.LocalDate;

public class StaticTest {
    public static void main(String[] args) {
        Employee1[] staff = new Employee1[3];
        staff[0] = new Employee1("Carl", 75000);
        staff[1] = new Employee1("Harry", 65000);
        staff[2] = new Employee1("Bob", 50000);

        for (Employee1 e : staff) {
            e.setId();
            System.out.println("name=" + e.getName() + " id=" + e.getId() + ",salary=" + e.getSalary());
        }

        int n = Employee1.getNextId(); // calls static method
        System.out.println("Next available id=" + n);
    }
}
class Employee1 {
    private static int nextId = 1;
    private final String name;
    private double salary;
    private int id;

    public Employee1(String n, double s) { //  构造器和类同名，无返回值，可以有多个参数，伴随着new进行调用
        name = n;
        salary = s;
        id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId; // set id to next available id
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) // unit test
    {
        Employee1 e = new Employee1("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }

}