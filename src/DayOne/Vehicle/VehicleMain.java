package DayOne.Vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Car[] listOfCars = new Car[5];
        listOfCars[0]= new Car("bmw", "e46");
        listOfCars[1]= new Car("fiat", "punto");
        listOfCars[2]= new Car("mercedes", "s");
        listOfCars[3]= new Car("audi", "300");
        listOfCars[4]= new Car("syrena", "ciri");

        System.out.println(listOfCars[0]);

        //listOfCars[2].setModel("a7");

        Car thirdCar = listOfCars[2];
        thirdCar.setModel("a7");

        for (Car car: listOfCars){
            car.show();
        }


    }
}
