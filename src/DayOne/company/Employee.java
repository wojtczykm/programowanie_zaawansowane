package DayOne.company;

public class Employee {
    private String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("wywołuje konstruktor klasy Employee z argumentami "+ name +" "+salary);
    }

    public int getSalary() {
        return salary;
    }

    public void show(){
        System.out.println("Ma na imię "+name+ "i zarabiam "+salary);
    }
}
