package week2;

// 程序清单4-4 P121

public class ParamTest
{
    public static void main(String[] args)
    {
        // test1:方法不能修改数值型或者布尔型参数
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

        // test2:方法可以修改对象参数的状态
        System.out.println("\nTesting tripleSalary:");// \n可以空一行
        Employee2 harry = new Employee2("Harry", 50000);
        System.out.println("Before: salary="+harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary="+harry.getSalary());

        // test3:方法不能让对象参数引用一个新的对象
        System.out.println("\nTesting swap:");
        Employee2 a = new Employee2("Alice", 70000);
        Employee2 b = new Employee2("Bob", 60000);
        System.out.println("Before: a="+a.getName());
        System.out.println("Before: b="+b.getName());
        swap(a, b);
        System.out.println("After: a="+a.getName());
        System.out.println("After: b="+b.getName());
}

    public static void tripleValue(double x)// doesn't work
    {
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }

    public static void tripleSalary(Employee2 x)// works
    {
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    public static void swap(Employee2 x, Employee2 y) {
        Employee2 temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }
}

class Employee2 // simplified Employee2 class
{
    private String name;
    private double salary;

    public Employee2(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}


