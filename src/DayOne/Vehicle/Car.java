package DayOne.Vehicle;

public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void show(){
        System.out.println("To jest "+model +" "+brand);
    }

    @Override
    public String toString() {
        return "Car 1" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'';
    }
}
