package DayOne.company;

public class Manager extends Employee {
    private int bonus;
    public Manager(String name, int salary) {
        super(name, salary);
    }
    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
        System.out.println("wywołuje konstruktor z klasy Manager z argumentami" +name +" "+ salary +" "+ bonus);
    }

    public void makeSpeech() {
        System.out.println("motywujaca przemowa");
    }
    @Override
    public int getSalary(){
        //return super.getSalary() +bonus;
        return salary+ bonus;
    }
    //@Overload
    public void makeSpeech(String addintionalMessage){
        makeSpeech();
        System.out.println(addintionalMessage);
    }
}

