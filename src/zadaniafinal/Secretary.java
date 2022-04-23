package zadaniafinal;

import DayOne.company.Employee;

public final class Secretary extends Employee {

    public Secretary(String name, int salary) {
        super(name, salary);
        System.out.println("wywołuje konstruktor : %s i %i"+  name+  salary);
    }

    public void makeCall(String number){
        System.out.println("telefon do "+ number);
    }
}
