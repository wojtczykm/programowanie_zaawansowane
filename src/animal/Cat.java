package animal;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void saySome() {
        System.out.println(name+ "miau miau");
    }
}
