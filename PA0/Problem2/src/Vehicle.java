public class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }

    public void travel(double distance) {
        System.out.println("You have traveled " + distance + " miles");
    }

    @Override
    public String toString() {
        return make + " " + model;
    }
}