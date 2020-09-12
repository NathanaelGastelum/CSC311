public class VehicleTest {

    public static void main(String[] args) {

        // using polymorphism to create vehicle objects
        Vehicle miata = new Car("Mazda", "Miata", 80);
        Vehicle bike = new Bicycle("Schwinn", "World Sport", 15);

        // test travel methods
        miata.travel(2000.0);
        bike.travel(2000.0);
    }
}
