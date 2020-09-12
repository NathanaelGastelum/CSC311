public class Car extends Vehicle {

    private double avgSpeed;

    public Car(String make, String model, double avgSpeed) {
        super(make, model);
        this.avgSpeed = avgSpeed;
    }

    @Override
    public void travel(double distance) {
        System.out.printf("You have driven your %s %.1f miles in %.1f hours \n", this.toString(), distance, distance / avgSpeed);
    }
}