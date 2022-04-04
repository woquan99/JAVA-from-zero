package week2;

import java.time.*;

public class EmployeeTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];
        double percent = 10;
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        // raise everyone's salary by 5%
        for (Employee e : staff)  //  遍历所有的数组元素
            e.raiseSalary(percent);
        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + " ,salary=" + e.getSalary() + ",hi reDay=" + e.getHireDay());
    }
}

class Employee {
    private final String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) { //  构造器和类同名，无返回值，可以有多个参数，伴随着new进行调用
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }


    public static void main(String[] args) // unit test
    {
        Employee e = new Employee("Romeo" , 50000, 2003, 3, 31) ;
        e.raiseSalary(10);
        System.out.println(e.getName() + " " + e.getSalary());}


    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

}