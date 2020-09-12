public class VehicleTest {

    public static void main(String[] args) {
        Vehicle miata = new Car("Mazda", "Miata", 80);
        Vehicle bike = new Bicycle("Schwinn", "World Sport", 15);

        miata.travel(2000.0);
        bike.travel(2000.0);
    }
}
