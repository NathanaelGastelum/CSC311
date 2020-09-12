public class Bicycle extends Vehicle {

    private double avgSpeed;

    public Bicycle(String make, String model, double avgSpeed) {
        super(make, model);
        this.avgSpeed = avgSpeed;
    }

    // Changes verb and time display to be more bicycle appropriate
    @Override
    public void travel(double distance) {
        double travelTime = distance / avgSpeed;
        if (travelTime < 24) {
            System.out.printf("You have traveled %s miles in %.1f hours \n", distance, travelTime);
        }
        else {
            System.out.printf("You have ridden your %s %.1f miles in %d days and %.1f hours \n", this.toString(), distance, (int) Math.floor(travelTime/24), travelTime % 24);
        }
    }
}