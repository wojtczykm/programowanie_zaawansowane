package animal;

public class Duck extends Bird{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void saySome() {
        System.out.println(name +"dak dak");
    }
}
