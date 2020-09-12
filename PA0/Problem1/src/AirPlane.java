public class AirPlane {
    private String make;
    private String model;
    private double topSpeed;
    private double range;

    public AirPlane(String make, String model, double topSpeed, double range) {
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.range = range;
    }

    // Default constructor
    public AirPlane() {
        new AirPlane(
                "Boeing",
                "C-17",
                590,
                6456
        );
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }
}
