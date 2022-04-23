package animal;

public class Dog extends Animal{


    public Dog(String name) {
        super(name);
    }

    @Override
    public void saySome() {
        System.out.println(name+ "hau hau");
    }
}
